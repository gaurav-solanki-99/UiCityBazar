package com.example.uicitybazar.MyAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.uicitybazar.Model.TopShopes;
import com.example.uicitybazar.databinding.TopShopSingleUi2Binding;

import java.util.ArrayList;

public class TopShopAdapter extends RecyclerView.Adapter<TopShopAdapter.TopShopHolder>
{
    Context context;
    ArrayList<TopShopes> al;

    public TopShopAdapter(Context context,ArrayList<TopShopes> al)
    {
      this.context=context;
      this.al=al;
    }

    @NonNull

    @Override
    public TopShopHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

     TopShopSingleUi2Binding binding= TopShopSingleUi2Binding.inflate(LayoutInflater.from(context),parent,false);



        return new TopShopHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull  TopShopAdapter.TopShopHolder holder, int position) {

        TopShopes topShopes = al.get(position);

        holder.binding.tvAddress.setText(topShopes.getShopeAdd());
        holder.binding.tvshopName.setText(topShopes.getShopeName());
        holder.binding.MyRating.setRating(topShopes.getShopeRate());
        holder.binding.tvrates.setText(""+topShopes.getShopeRate());
        holder.binding.tvdistance.setText(topShopes.getShopeDistance()+"km");

        Glide.with(context).load(topShopes.getShopeImage()).into(holder.binding.shopeimage);



    }

    @Override
    public int getItemCount() {
        return al.size();
    }


    class TopShopHolder extends RecyclerView.ViewHolder
    {
        TopShopSingleUi2Binding binding;
        public TopShopHolder(TopShopSingleUi2Binding binding)
        {
            super(binding.getRoot());
            this.binding=binding;


        }
    }
}
