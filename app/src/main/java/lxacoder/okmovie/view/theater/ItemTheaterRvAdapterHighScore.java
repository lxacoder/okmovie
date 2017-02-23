package lxacoder.okmovie.view.theater;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import lxacoder.okmovie.R;
import lxacoder.okmovie.model.theater.bean.WeeklyBean;

/**
 * Created by lxacoder on 2016/9/26.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public class ItemTheaterRvAdapterHighScore extends RecyclerView.Adapter<ItemTheaterRvAdapterHighScore.ItemHolder> {

    private Context mContext;
    private WeeklyBean mWeeklyBean;
    public ItemTheaterRvAdapterHighScore(Context context, WeeklyBean normalBean){
        mWeeklyBean = normalBean;
        mContext = context;
    }
    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ItemHolder(LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_theaterrv,parent,false));
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, int position) {
        WeeklyBean.SubjectsEntity.SubjectEntity entity = mWeeklyBean.subjects.get(position).subject;
        Glide.with(mContext).load(entity.images.large).into(holder.mImageView);
        holder.movieTitle.setText(entity.title);
    }

    @Override
    public int getItemCount() {
        return mWeeklyBean.subjects != null?mWeeklyBean.subjects.size():0;
    }

    public class ItemHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.cover)
        ImageView mImageView;
        @BindView(R.id.movieTitle)
        TextView movieTitle;

        public ItemHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
