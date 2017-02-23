package lxacoder.okmovie.view.theater;

import android.content.Context;
import android.support.v7.widget.CardView;
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
import lxacoder.okmovie.model.theater.bean.DoubanNormalBean;

/**
 * Created by lxacoder on 2016/9/26.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public class ItemTheaterRvAdapter extends RecyclerView.Adapter<ItemTheaterRvAdapter.ItemHolder> {

    private Context mContext;
    public DoubanNormalBean mDoubanNormalBean;

    private OnItemClickListener itemClickListener;

    public ItemTheaterRvAdapter(Context context,DoubanNormalBean normalBean){
        mDoubanNormalBean = normalBean;
        mContext = context;
    }
    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ItemHolder(LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_theaterrv,parent,false));
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, final int position) {
        DoubanNormalBean.SubjectsEntity entity = mDoubanNormalBean.subjects.get(position);
        Glide.with(mContext).load(entity.images.large).into(holder.mImageView);
        holder.movieTitle.setText(entity.title);
        holder.mItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClick(mDoubanNormalBean.subjects.get(position).id);
            }
        });
    }

    public void setItemClickListener(OnItemClickListener listener){
        this.itemClickListener = listener;
    }

    @Override
    public int getItemCount() {
        return mDoubanNormalBean.subjects != null?mDoubanNormalBean.subjects.size():0;
    }

    public  interface OnItemClickListener{
        void onItemClick(String id);
    }


    public class ItemHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.cover)
        ImageView mImageView;
        @BindView(R.id.movieTitle)
        TextView movieTitle;
        @BindView(R.id.itemCard)
        CardView mItem;

        public ItemHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
