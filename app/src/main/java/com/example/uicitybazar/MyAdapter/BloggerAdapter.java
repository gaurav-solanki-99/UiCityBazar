package com.example.uicitybazar.MyAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.uicitybazar.Model.Blogger;
import com.example.uicitybazar.databinding.BloggerSingleUiBinding;

import java.util.ArrayList;

public class BloggerAdapter  extends RecyclerView.Adapter<BloggerAdapter.BlogViewHolder> {

    Context context;
    ArrayList<Blogger> al;

    public BloggerAdapter(Context context,ArrayList<Blogger> al)
    {
        this.context=context;
        this.al = al;
    }

    @NonNull

    @Override
    public BlogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        BloggerSingleUiBinding binding = BloggerSingleUiBinding.inflate(LayoutInflater.from(context),parent,false);


        return new BlogViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull  BloggerAdapter.BlogViewHolder holder, int position) {

        Blogger blogger = al.get(position);

        Glide.with(context).load(blogger.getBloggerImage()).into(holder.binding.bloggerImage);
        holder.binding.tvbloggerName.setText(blogger.getBloggerName());

    }

    @Override
    public int getItemCount() {
        return al.size();
    }


    class  BlogViewHolder extends RecyclerView.ViewHolder
    {
        BloggerSingleUiBinding binding;

        BlogViewHolder(BloggerSingleUiBinding binding)
        {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
