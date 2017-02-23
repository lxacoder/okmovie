package lxacoder.okmovie.network;

import java.util.concurrent.TimeUnit;

import lxacoder.okmovie.BuildConfig;
import lxacoder.okmovie.model.rank.bean.RankContentBean;
import lxacoder.okmovie.model.rank.bean.RankDetailListBean;
import lxacoder.okmovie.model.rank.bean.RankHeaderBean;
import lxacoder.okmovie.model.theater.bean.DoubanNormalBean;
import lxacoder.okmovie.model.moviedetail.bean.MovieDetailBean;
import lxacoder.okmovie.beans.NewsDetailBean;
import lxacoder.okmovie.beans.NewsListBean;
import lxacoder.okmovie.model.theater.bean.WeeklyBean;
import lxacoder.okmovie.config.Keys;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Created by lxacoder on 2016/9/5.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */
public class RetrofitSingleton {

    private ApiService mApiService;

    private Retrofit mRetrofit;

    private OkHttpClient mOkHttpClient;

    private RetrofitSingleton() {
        init();
    }

    public static RetrofitSingleton getInstance() {
        return RetrofitHolder.instance;
    }

    private static class RetrofitHolder {
        public static final RetrofitSingleton instance = new RetrofitSingleton();
    }

    private void init() {
        initOkHttp();
        initRetrofit();
        mApiService = mRetrofit.create(ApiService.class);
    }

    private void initOkHttp() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
            builder.addInterceptor(interceptor);
        }
        mOkHttpClient = builder.connectTimeout(15, TimeUnit.SECONDS)
                .readTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .build();
    }

    private void initRetrofit() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(ApiService.doubanBaseURL)
                .client(mOkHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    public Observable<DoubanNormalBean> getTodayMovie(String city) {
        return mApiService.getNowMovie(city, Keys.doubanKey);
    }

    public Observable<NewsListBean> getNews(int pageIndex) {
        return mApiService.getNews(pageIndex);
    }

    public Observable<NewsDetailBean> getNewsDetail(int newsId) {
        return mApiService.getNewsDetail(newsId);
    }

    public Observable<DoubanNormalBean> getTop250(int count, int start) {
        return mApiService.getTop250(Keys.doubanKey, count, start);
    }

    public Observable<WeeklyBean> getWeekly() {
        return mApiService.getWeekly(Keys.doubanKey);
    }
    public Observable<DoubanNormalBean> getNewMoviewRank() {
        return mApiService.getNewMovieTop(Keys.doubanKey);
    }
    public Observable<DoubanNormalBean> getComingSoon() {
        return mApiService.getComingSoon(Keys.doubanKey);
    }
    public Observable<MovieDetailBean> getMovieDetail(String id){
        return  mApiService.getMovieDetail(id,Keys.doubanKey);
    }
    public Observable<RankHeaderBean> getRankHeader(){
        return mApiService.getRankHeader();
    }

    public Observable<RankContentBean> getRankContent(int pageIndex){
        return mApiService.getRankContent(pageIndex);
    }

    public Observable<RankDetailListBean> getRankListDetail(int listId, int pageIndex){
        return mApiService.getRankListDetail(listId,pageIndex);
    }
}
