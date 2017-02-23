package lxacoder.okmovie.view.rank.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ms.square.android.expandabletextview.ExpandableTextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import lxacoder.okmovie.R;
import lxacoder.okmovie.model.rank.bean.RankDetailListBean;

/**
 * Created by lxacoder on 2016/10/3.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public class RankListRvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private static final String TAG = "RankListRvAdapter";

    private static final int HEDER = 0;
    private static final int CONTENT = 1;


    private RankDetailListBean mListBean;
    private Context mContext;

    public RankListRvAdapter(Context context, RankDetailListBean listBean) {
        this.mListBean = listBean;
        this.mContext = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType){
            case HEDER:
                View headerView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_header_ranklist,parent,false);
                return new HeaderVH(headerView);
            case CONTENT:
                View contentView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_ranklist,parent,false);
                return new ListItemVH(contentView);
            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int type = getItemViewType(position);
        if (type == HEDER){
            ((HeaderVH)holder).listTitleTv.setText(mListBean.topList.name);
            ((HeaderVH)holder).mListSummary.setText(mListBean.topList.summary);
        }else if (type == CONTENT){
            ListItemVH vh = (ListItemVH)holder;
            RankDetailListBean.MoviesEntity entity = mListBean.movies.get(position-1);
            if (position ==1){
                Glide.with(mContext).load(R.drawable.topmovie_list_num1).into(vh .mRankNumBack);
            }else if (position == 2){
                Glide.with(mContext).load(R.drawable.topmovie_list_num2).into(vh .mRankNumBack);
            }else if (position == 3){
                Glide.with(mContext).load(R.drawable.topmovie_list_num3).into(vh .mRankNumBack);
            }else {
                Glide.with(mContext).load(R.drawable.topmovie_list_num_normal).into(vh .mRankNumBack);
            }
            vh.mRankNum.setText(entity.rankNum+"");
            Glide.with(mContext).load(entity.posterUrl).into(vh.mCover);
            vh.mTitle.setText(entity.name);
            vh.mMovieRate.setText(String.valueOf(entity.rating));
            vh.mAkaTitle.setText(entity.nameEn);
            vh.mDirector.setText(entity.director);
            vh.mMainactor.setText(entity.actor);
            StringBuilder builder = new StringBuilder();
            builder.append(entity.releaseDate).append(" ").append(entity.releaseLocation);
            vh.mPupdate.setText(builder.toString());
            vh.mSummary.setText(entity.remark);
        }
    }

    @Override
    public int getItemCount() {
        Log.d(TAG,mListBean.toString());
        return mListBean.movies != null  ? mListBean.movies.size()+1 :0;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == HEDER) {
            return HEDER;
        }else {
            return CONTENT;
        }
    }

    class HeaderVH extends RecyclerView.ViewHolder {
        @BindView(R.id.toplisttitle)
        TextView listTitleTv;
        @BindView(R.id.toplistsumary)
        ExpandableTextView mListSummary;

        public HeaderVH(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    class ListItemVH extends RecyclerView.ViewHolder {

        @BindView(R.id.rankNumBack)
        ImageView mRankNumBack;
        @BindView(R.id.rankNum)
        TextView mRankNum;
        @BindView(R.id.cover)
        ImageView mCover;
        @BindView(R.id.title)
        TextView mTitle;
        @BindView(R.id.movie_rate)
        TextView mMovieRate;
        @BindView(R.id.akaTitle)
        TextView mAkaTitle;
        @BindView(R.id.director)
        TextView mDirector;
        @BindView(R.id.mainactor)
        TextView mMainactor;
        @BindView(R.id.pupdate)
        TextView mPupdate;
        @BindView(R.id.summary)
        TextView mSummary;

        public ListItemVH(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
