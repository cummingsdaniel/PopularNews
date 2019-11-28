package com.vogella.android.popularnews;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vogella.android.popularnews.models.Article;

import java.util.List;

public class Adapter extends RecyclerView.Adapter{
    private List<Article>articles;
    private Context context;
    private AdapterView.OnItemClickListener onItemClickListener;
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener {
    TextView title;
    TextView desc;
    TextView author;
    TextView published_ad;
    TextView source;
    TextView time;
    ImageView imageView;
    ProgressBar progressBar;
    OnItemClickListener onItemClickListener;
        public MyViewHolder(View itemView, OnItemClickListener onItemClickListener) {
            super(itemView);
            itemView.setOnClickListener(this);
            title= itemView.findViewById(R.id.title);
            desc = itemView.findViewById(R.id.desc);
            author = itemView.findViewById(R.id.author);
            published_ad = itemView.findViewById(R.id.publishedAt);
            source = itemView.findViewById(R.id.source);
            time = itemView.findViewById(R.id.time);
            imageView = itemView.findViewById(R.id.img);
            progressBar = itemView.findViewById(R.id.progress_load_photo);

            this.onItemClickListener = onItemClickListener;

        }
        @Override
        public void onClick(View v) {

        }
    }


}
