package com.example.uicitybazar.MyAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.uicitybazar.FamousMarket;
import com.example.uicitybazar.databinding.FamousMarketSingleUiBinding;

import java.util.ArrayList;

public class FamousMarketAdapter extends RecyclerView.Adapter<FamousMarketAdapter.FamousMarketViewHolder>
{
    Context context;
    ArrayList<FamousMarket> al;
    public FamousMarketAdapter(Context context,ArrayList<FamousMarket> al)
    {
        this.context=context;
        this.al=al;
    }

    @NonNull

    @Override
    public FamousMarketViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        FamousMarketSingleUiBinding binding = FamousMarketSingleUiBinding.inflate(LayoutInflater.from(context),parent,false);



        return new FamousMarketViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull FamousMarketAdapter.FamousMarketViewHolder holder, int position) {

        FamousMarket famousMarket = al.get(position);

        Glide.with(context).load(famousMarket.getMarketIamge()).into(holder.binding.marketIamge);
        holder.binding.tvMarketName.setText(famousMarket.getMarketName());


    }

    @Override
    public int getItemCount() {
        return al.size();
    }


    class FamousMarketViewHolder extends RecyclerView.ViewHolder
    {
        FamousMarketSingleUiBinding binding;

        public FamousMarketViewHolder(FamousMarketSingleUiBinding binding)
        {
            super(binding.getRoot());
            this.binding=binding;
        }




    }

}
