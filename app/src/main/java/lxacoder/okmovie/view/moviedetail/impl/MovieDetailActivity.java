package lxacoder.okmovie.view.moviedetail.impl;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.ms.square.android.expandabletextview.ExpandableTextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import lxacoder.okmovie.R;
import lxacoder.okmovie.config.CommonConfig;
import lxacoder.okmovie.config.RecyclerViewDecoration;
import lxacoder.okmovie.config.Utils;
import lxacoder.okmovie.model.moviedetail.bean.MovieDetailBean;
import lxacoder.okmovie.presenter.moviedetail.IMovieDetailPresenter;
import lxacoder.okmovie.presenter.moviedetail.impl.MovieDetailPresenterImpl;
import lxacoder.okmovie.view.moviedetail.IMovieDetail;
import lxacoder.okmovie.view.moviedetail.adapter.CastsRvAdapter;

public class MovieDetailActivity extends AppCompatActivity implements IMovieDetail {

    @BindView(R.id.expand_text_view)
    ExpandableTextView mExpandableTextView;
    @BindView(R.id.cover)
    ImageView coverIm;
    @BindView(R.id.title)
    TextView titleTv;
    @BindView(R.id.akaTitle)
    TextView akaTitle;
    @BindView(R.id.gaussBackground)
    ImageView gaussBackgroundIm;
    @BindView(R.id.summaryContainer)
    LinearLayout summaryContainer;
    @BindView(R.id.detailContainer)
    LinearLayout detailContainer;
    @BindView(R.id.ratingContainer)
    LinearLayout ratingContainer;
    @BindView(R.id.expandable_text)
    TextView expandableTv;
    @BindView(R.id.runTime)
    TextView mRunTime;
    @BindView(R.id.runTimeTv)
    TextView mRunTimeTv;
    @BindView(R.id.generic)
    TextView mGeneric;
    @BindView(R.id.genericTv)
    TextView mGenericTv;
    @BindView(R.id.language)
    TextView mLanguage;
    @BindView(R.id.languageTv)
    TextView mLanguageTv;
    @BindView(R.id.pupdate)
    TextView mPupdate;
    @BindView(R.id.pupdateTv)
    TextView mPupdateTv;
    @BindView(R.id.ratingAver)
    TextView mRatingAver;
    @BindView(R.id.rating5Tv)
    TextView mRating5Tv;
    @BindView(R.id.rating4Tv)
    TextView mRating4Tv;
    @BindView(R.id.rating3Tv)
    TextView mRating3Tv;
    @BindView(R.id.rating2Tv)
    TextView mRating2Tv;
    @BindView(R.id.rating1Tv)
    TextView mRating1Tv;
    @BindView(R.id.castsRv)
    RecyclerView castsRv;

    IMovieDetailPresenter mPresenter;
    MovieDetailBean bean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String id = intent.getStringExtra("movieid");
        mPresenter = new MovieDetailPresenterImpl(this);
        mPresenter.loadData(id);
    }

    @Override
    public void showData(MovieDetailBean bean) {
        this.bean = bean;
        Glide.with(this).load(bean.images.large).asBitmap().into(new SimpleTarget<Bitmap>() {
            @Override
            public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
                coverIm.setImageBitmap(resource);
                gaussBackgroundIm.setImageBitmap(Utils.doBlur(resource, 50, false));
                Palette.from(resource).generate(new Palette.PaletteAsyncListener() {
                    public void onGenerated(Palette p) {
                        Palette.Swatch swatch = p.getVibrantSwatch();
                        Palette.Swatch trailorSwatch = p.getDarkVibrantSwatch();
                        if (swatch != null) {
                            summaryContainer.setBackgroundColor(swatch.getRgb());
                            titleTv.setTextColor(swatch.getTitleTextColor());
                            akaTitle.setTextColor(swatch.getBodyTextColor());
                            expandableTv.setTextColor(swatch.getBodyTextColor());
                        }
                        if (trailorSwatch != null) {
                            detailContainer.setBackgroundColor(trailorSwatch.getRgb());
                            int bodyColor = trailorSwatch.getBodyTextColor();
                            mRunTime.setTextColor(bodyColor);
                            mRunTimeTv.setTextColor(bodyColor);
                            mGeneric.setTextColor(bodyColor);
                            mGenericTv.setTextColor(bodyColor);
                            mLanguage.setTextColor(bodyColor);
                            mLanguageTv.setTextColor(bodyColor);
                            mPupdate.setTextColor(bodyColor);
                            mPupdateTv.setTextColor(bodyColor);
                        }
                    }
                });
            }
        });
        mExpandableTextView.setText(bean.summary);
        titleTv.setText(bean.title);
        akaTitle.setText(bean.aka.get(0));
        mRunTimeTv.setText(bean.durations.get(0));
        StringBuilder genresBuilder = new StringBuilder();
        for (int i = 0, j = bean.genres.size(); i < j; i++) {
            genresBuilder.append(bean.genres.get(i));
            if (i != j-1)
                genresBuilder.append(",");
        }
        mGenericTv.setText(genresBuilder.toString());
        mLanguageTv.setText(bean.languages.get(0));
        mPupdateTv.setText(bean.pubdate);
        mRatingAver.setText(String.valueOf(bean.rating.average));
        mRating5Tv.setText(String.valueOf(bean.rating.details.value5));
        mRating4Tv.setText(String.valueOf(bean.rating.details.value4));
        mRating3Tv.setText(String.valueOf(bean.rating.details.value3));
        mRating2Tv.setText(String.valueOf(bean.rating.details.value2));
        mRating1Tv.setText(String.valueOf(bean.rating.details.value1));
        castsRv.setLayoutManager(new LinearLayoutManager(this));
        castsRv.addItemDecoration(new RecyclerViewDecoration(this,0, CommonConfig.isNightMode(this)));
        castsRv.setNestedScrollingEnabled(false);
        castsRv.setAdapter(new CastsRvAdapter(this,bean));
    }
}