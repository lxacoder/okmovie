package lxacoder.okmovie.view.rank.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import lxacoder.okmovie.R;
import lxacoder.okmovie.model.rank.bean.RankContentBean;
import lxacoder.okmovie.model.rank.bean.RankHeaderBean;
import lxacoder.okmovie.view.theater.ItemTheaterRvAdapter;

import static lxacoder.okmovie.view.rank.impl.RankFragmentImpl.CONTENT;
import static lxacoder.okmovie.view.rank.impl.RankFragmentImpl.HEADER;
import static lxacoder.okmovie.view.rank.impl.RankFragmentImpl.RANK100;

/**
 * Created by lxacoder on 2016/10/1.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public class RankRvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{


    private RankHeaderBean mHeaderBean;
    private Context mContext;
    private RankContentBean mContentBean;

    private  OnItemClickListener mListener;

    public RankRvAdapter(RankHeaderBean headerBean, RankContentBean contentBean, Context context) {
        mHeaderBean = headerBean;
        mContext = context;
        mContentBean = contentBean;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType){
            case HEADER:
                View headView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rank_rv_header,parent,false);
                return new HeaderViewHolder(headView);
            case RANK100:
                View rank100View = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rank_rv_top,parent,false);
                return new Rank100ViewHolder(rank100View);
            case CONTENT:
                View contentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rank_rv_content,parent,false);
                return new RankContentViewHolder(contentView);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        switch (position){
            case HEADER:
                ((HeaderViewHolder)holder).bind(mHeaderBean);
                ((HeaderViewHolder)holder).mItem.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mListener.onItemClick(mHeaderBean.topList.id);
                    }
                });
                break;
            case RANK100:
                break;
            default:
                ((RankContentViewHolder)holder).bind(mContentBean.topLists.get(position-2));
                ((RankContentViewHolder)holder).mitem.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mListener.onItemClick(mContentBean.topLists.get(position-2).id);
                    }
                });
    }
    }

    @Override
    public int getItemViewType(int position) {
        switch (position){
            case HEADER:
                return HEADER;
            case RANK100:
                return RANK100;
            default:
                return CONTENT;
        }
    }

    public void setItemClickListender(OnItemClickListener listener){
        this.mListener = listener;
    }

    public interface OnItemClickListener{
        void onItemClick(int id);
    }

    @Override
    public int getItemCount() {
        return mHeaderBean.topList!=null && mContentBean.topLists !=null ?mContentBean.topLists.size()+2:0;
    }

    public class HeaderViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.header)
        ImageView mHeaderImage;
        @BindView(R.id.title)
        TextView mTitle;
        @BindView(R.id.itemheader)
        FrameLayout mItem;

        public HeaderViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        public void bind(RankHeaderBean headerBean){
            Glide.with(mContext).load(headerBean.topList.imageUrl).into(mHeaderImage);
            mTitle.setText(headerBean.topList.title);
        }
    }
    public class Rank100ViewHolder extends RecyclerView.ViewHolder{

        public Rank100ViewHolder(View itemView) {
            super(itemView);
        }
    }
    public class RankContentViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.title)
        TextView mTitleText;
        @BindView(R.id.subTitle)
        TextView mSubTitleText;
        @BindView(R.id.rankItemContent)
        LinearLayout mitem;
        public RankContentViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
        public void bind(RankContentBean.TopListsEntity entity){
            mTitleText.setText(entity.topListNameCn);
            mSubTitleText.setText(entity.summary);
        }
    }
}
