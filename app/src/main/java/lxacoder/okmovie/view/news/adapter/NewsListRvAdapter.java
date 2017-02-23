package lxacoder.okmovie.view.news.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import lxacoder.okmovie.R;
import lxacoder.okmovie.beans.NewsListBean;
import lxacoder.okmovie.config.Utils;
import lxacoder.okmovie.view.news.impl.NewsDetailActivity;

/**
 * Created by lxacoder on 2016/9/6.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */
public class NewsListRvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int NORMAL = 0;
    private static final int ALBUM = 1;
    private static final int HASVIDEO = 2;

    private static final int FOOTER = 4;


    private boolean mShowFooter = true;


    private Context mContext;
    private NewsListBean mNewsListBean;

    private OnItemClickListener itemListener = new OnItemClickListener() {
        @Override
        public void onItemClick(int newsType, int position) {
            if (newsType == NORMAL) {
                int newsID = mNewsListBean.newsList.get(position).id;
                Intent intent = new Intent(mContext, NewsDetailActivity.class);
                intent.putExtra("newsId", newsID);
                mContext.startActivity(intent);
            }
        }
    };

    public NewsListRvAdapter(Context context, NewsListBean newsListBean) {
        this.mContext = context;
        this.mNewsListBean = newsListBean;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        switch (viewType) {
            case NORMAL:
                return new Item0Holder(LayoutInflater.from(mContext).inflate(R.layout.item1_news, parent, false));
            case HASVIDEO:
                return new Item1Holder(LayoutInflater.from(mContext).inflate(R.layout.item1_news, parent, false));
            case ALBUM:
                return new Item2Holder(LayoutInflater.from(mContext).inflate(R.layout.item2_news, parent, false));
            case FOOTER:
                return new FooterViewHolder(LayoutInflater.from(mContext).inflate(R.layout.footer, parent, false));

        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int type = getItemViewType(position);
        if (type == NORMAL) {
            ((Item0Holder) holder).bind(mNewsListBean.newsList.get(position));
        } else if (type == HASVIDEO) {
            ((Item1Holder) holder).bind(mNewsListBean.newsList.get(position));
        } else if (type == ALBUM) {
            ((Item2Holder) holder).bind(mNewsListBean.newsList.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return mNewsListBean.newsList != null ? mNewsListBean.newsList.size() + 1 : 0;
    }

    @Override
    public int getItemViewType(int position) {
        if (position + 1 == getItemCount()) {
            return FOOTER;
        }
        return mNewsListBean.newsList.get(position).type;
    }


    public void setShowFooter(boolean showFooter) {
        this.mShowFooter = showFooter;
    }

    public boolean isShowFooter() {
        return this.mShowFooter;
    }

    public class Item0Holder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView title;
        TextView subTitle;
        TextView time;
        TextView commentCount;
        ImageView newsImage;
        ImageView playImage;

        public Item0Holder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            title = (TextView) itemView.findViewById(R.id.title);
            subTitle = (TextView) itemView.findViewById(R.id.subtitle);
            time = (TextView) itemView.findViewById(R.id.postTime);
            commentCount = (TextView) itemView.findViewById(R.id.commentCount);
            newsImage = (ImageView) itemView.findViewById(R.id.newsImage);
            playImage = (ImageView) itemView.findViewById(R.id.play_image);
        }

        public void bind(NewsListBean.NewsListEntity entity) {
            title.setText(entity.title);
            subTitle.setText(entity.title2);
            time.setText(Utils.converTimeFrom1970(entity.publishTime));
            commentCount.setText(String.valueOf(entity.commentCount));
            Glide.with(mContext).load(entity.image).centerCrop().into(newsImage);
        }

        @Override
        public void onClick(View view) {
            itemListener.onItemClick(NORMAL, this.getLayoutPosition());
        }
    }

    public class Item1Holder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView title;
        TextView subTitle;
        TextView time;
        TextView commentCount;
        ImageView newsImage;
        ImageView playImage;

        public Item1Holder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            title = (TextView) itemView.findViewById(R.id.title);
            subTitle = (TextView) itemView.findViewById(R.id.subtitle);
            time = (TextView) itemView.findViewById(R.id.postTime);
            commentCount = (TextView) itemView.findViewById(R.id.commentCount);
            newsImage = (ImageView) itemView.findViewById(R.id.newsImage);
            playImage = (ImageView) itemView.findViewById(R.id.play_image);
        }

        public void bind(NewsListBean.NewsListEntity entity) {
            title.setText(entity.title);
            subTitle.setText(entity.title2);
            time.setText(Utils.converTimeFrom1970(entity.publishTime));
            commentCount.setText(String.valueOf(entity.commentCount));
            Glide.with(mContext).load(entity.image).centerCrop().into(newsImage);
            Glide.with(mContext).load(R.drawable.ic_play).into(playImage);

        }

        @Override
        public void onClick(View view) {
            itemListener.onItemClick(NORMAL, this.getLayoutPosition());
        }
    }

    public class Item2Holder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title;
        TextView time;
        TextView commentCount;
        ImageView newsImage1;
        ImageView newsImage2;
        ImageView newsImage3;

        public Item2Holder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            title = (TextView) itemView.findViewById(R.id.title);
            time = (TextView) itemView.findViewById(R.id.postTime);
            commentCount = (TextView) itemView.findViewById(R.id.commentCount);
            newsImage1 = (ImageView) itemView.findViewById(R.id.image1);
            newsImage2 = (ImageView) itemView.findViewById(R.id.image2);
            newsImage3 = (ImageView) itemView.findViewById(R.id.image3);
        }

        //// TODO: 2016/9/9 bug：有些图片只有两张，数组越界异常
        public void bind(NewsListBean.NewsListEntity entity) {
            title.setText(entity.title);
            time.setText(Utils.converTimeFrom1970(entity.publishTime));
            commentCount.setText(String.valueOf(entity.commentCount));
            Glide.with(mContext).load(entity.images.get(0).url1).centerCrop().into(newsImage1);
            Glide.with(mContext).load(entity.images.get(1).url1).centerCrop().into(newsImage2);
            Glide.with(mContext).load(entity.images.get(2).url1).centerCrop().into(newsImage3);
        }

        @Override
        public void onClick(View view) {

        }
    }

    public interface OnItemClickListener {
        void onItemClick(int newsType, int position);
    }

    public class FooterViewHolder extends RecyclerView.ViewHolder {

        public FooterViewHolder(View view) {
            super(view);
        }

    }
}
