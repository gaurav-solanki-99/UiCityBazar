package com.example.uicitybazar.MyAdapter;

import android.content.Context;
import android.text.method.SingleLineTransformationMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.uicitybazar.Banner;
import com.example.uicitybazar.R;
import com.example.uicitybazar.databinding.BannerSingleUiBinding;

import java.util.ArrayList;

public class Baneradapter extends RecyclerView.Adapter<Baneradapter.BannerViewHolder>
{

     Context context;
      ArrayList<Banner> al;

      public Baneradapter(Context context,ArrayList<Banner> al)
      {
          this.context=context;
          this.al=al;
      }

    @NonNull
    @Override
    public BannerViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType)
    {
        BannerSingleUiBinding binding = BannerSingleUiBinding.inflate(LayoutInflater.from(context),parent,false);

        return new BannerViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull  Baneradapter.BannerViewHolder holder, int position) {

          Banner banner = al.get(position);



        Glide.with(context).load(banner.getBannerUrl()).into(holder.binding.bannerImae);



    }

    @Override
    public int getItemCount() {
        return al.size();
    }


    class BannerViewHolder extends RecyclerView.ViewHolder
    {
        BannerSingleUiBinding binding;
        public BannerViewHolder(BannerSingleUiBinding binding)
        {
            super(binding.getRoot());
            this.binding=binding;

        }
    }
}
