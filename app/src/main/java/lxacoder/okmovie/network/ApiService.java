package lxacoder.okmovie.network;


import lxacoder.okmovie.model.rank.bean.RankContentBean;
import lxacoder.okmovie.model.rank.bean.RankDetailListBean;
import lxacoder.okmovie.model.rank.bean.RankHeaderBean;
import lxacoder.okmovie.model.theater.bean.DoubanNormalBean;
import lxacoder.okmovie.model.moviedetail.bean.MovieDetailBean;
import lxacoder.okmovie.beans.NewsDetailBean;
import lxacoder.okmovie.beans.NewsListBean;
import lxacoder.okmovie.model.theater.bean.WeeklyBean;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by lxacoder on 2016/9/6.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */
public interface ApiService {
    String doubanBaseURL = "https://api.douban.com/";
    String mtimenews = "http://api.m.mtime.cn/News/NewsList.api";

    @GET("v2/movie/in_theaters")
    Observable<DoubanNormalBean> getNowMovie(@Query("city") String city, @Query("apikey") String key);

    @GET("http://api.m.mtime.cn/News/NewsList.api/")
    Observable<NewsListBean> getNews(@Query("pageIndex") int pageIndex);

    @GET("http://api.m.mtime.cn/News/Detail.api")
    Observable<NewsDetailBean> getNewsDetail(@Query("newsId") int newsId);

    @GET("v2/movie/top250")
    Observable<DoubanNormalBean> getTop250(@Query("apikey") String key, @Query("count") int count, @Query("start") int start);

    @GET("v2/movie/weekly")
    Observable<WeeklyBean> getWeekly(@Query("apikey") String key);

    @GET("v2/movie/new_movies")
    Observable<DoubanNormalBean> getNewMovieTop(@Query("apikey") String key);

    @GET("v2/movie/coming_soon")
    Observable<DoubanNormalBean> getComingSoon(@Query("apikey") String key);

    @GET("v2/movie/subject/{id}")
    Observable<MovieDetailBean> getMovieDetail(@Path("id") String id, @Query("apikey") String key);

    @GET("http://api.m.mtime.cn/PageSubArea/GetRecommendationIndexInfo.api")
    Observable<RankHeaderBean> getRankHeader();

    @GET("http://api.m.mtime.cn/TopList/TopListOfAll.api")
    Observable<RankContentBean> getRankContent(@Query("pageIndex")int pageIndex);

    @GET("http://api.m.mtime.cn/TopList/TopListDetails.api")
    Observable<RankDetailListBean> getRankListDetail(@Query("topListId")int id, @Query("pageIndex")int pageIndex);
}
