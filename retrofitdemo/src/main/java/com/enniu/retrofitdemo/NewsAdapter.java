package com.enniu.retrofitdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.enniu.retrofitdemo.model.NewsResult;

import java.util.List;

/**
 * @Author: 王立
 * @Date: 2019/5/5 19:40
 * @Desc:
 */
public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    private Context mContext;
    private List<NewsResult.ResultBean.DataBean> datas;

    public NewsAdapter(Context context, List<NewsResult.ResultBean.DataBean> datas) {
        mContext = context;
        this.datas = datas;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_news_layout, viewGroup, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder newsViewHolder, int i) {
        newsViewHolder.tvTitle.setText(datas.get(i).getTitle());
        Glide.with(mContext)
                .load(datas.get(i).getThumbnailPicS())
                .into(newsViewHolder.ivCover);
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    static class NewsViewHolder extends RecyclerView.ViewHolder {

        TextView tvTitle;
        ImageView ivCover;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.tvTitle);
            ivCover = itemView.findViewById(R.id.ivCover);

        }
    }
}
