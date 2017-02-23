package lxacoder.okmovie.view.moviedetail.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import lxacoder.okmovie.R;
import lxacoder.okmovie.model.moviedetail.bean.MovieDetailBean;

/**
 * Created by lxacoder on 2016/10/12.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public class CastsRvAdapter extends RecyclerView.Adapter<CastsRvAdapter.CastsViewHolder> {

    private MovieDetailBean mDetailBean;
    private Context mContext;
    private int directorNum;
    private int writerNum;
    private int castsNum;

    public CastsRvAdapter(Context mContext, MovieDetailBean detailBean) {
        this.mDetailBean = detailBean;
        this.mContext = mContext;
        getNumber();
    }

    private void getNumber() {
        this.directorNum = mDetailBean.directors.size();
        this.writerNum = mDetailBean.writers.size();
        this.castsNum = mDetailBean.casts.size();
    }

    @Override
    public CastsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_castsrv, parent, false);
        return new CastsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CastsViewHolder holder, int position) {
        if (position < directorNum) {
            holder.mPosition.setText("导演");
            Glide.with(mContext).load(mDetailBean.directors.get(position).avatars.medium).into(holder.mCastsHeader);
            holder.mName.setText(mDetailBean.directors.get(position).name);
            holder.mNameEn.setText(mDetailBean.directors.get(position).nameEn);
        } else if (position >= directorNum && position < directorNum + writerNum) {
            holder.mPosition.setText("编剧");
            Glide.with(mContext).load(mDetailBean.writers.get(position-directorNum).avatars.medium).into(holder.mCastsHeader);
            holder.mName.setText(mDetailBean.writers.get(position-directorNum).name);
            holder.mName.setText(mDetailBean.writers.get(position-directorNum).nameEn);
        } else {
            Glide.with(mContext).load(mDetailBean.casts.get(position-directorNum-writerNum).avatars.medium).into(holder.mCastsHeader);
            holder.mPosition.setText("演员");
            holder.mName.setText(mDetailBean.casts.get(position-directorNum-writerNum).name);
            holder.mNameEn.setText(mDetailBean.casts.get(position-directorNum-writerNum).nameEn);
        }
    }

    @Override
    public int getItemCount() {
        return directorNum + writerNum + castsNum;
    }

    class CastsViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.castsHeader)
        de.hdodenhof.circleimageview.CircleImageView mCastsHeader;
        @BindView(R.id.name)
        TextView mName;
        @BindView(R.id.nameEn)
        TextView mNameEn;
        @BindView(R.id.position)
        TextView mPosition;

        public CastsViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
