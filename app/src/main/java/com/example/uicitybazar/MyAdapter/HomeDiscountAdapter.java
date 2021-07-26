package com.example.uicitybazar.MyAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uicitybazar.Model.HomeDiscount;
import com.example.uicitybazar.databinding.DiscountSingleUiHomeBinding;

import java.util.ArrayList;

public class HomeDiscountAdapter extends RecyclerView.Adapter<HomeDiscountAdapter.HomeViewHolder>
{
    Context context;
    ArrayList<HomeDiscount> al;

    public HomeDiscountAdapter(Context context, ArrayList<HomeDiscount> al) {
        this.context = context;
        this.al = al;
    }

    @NonNull

    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        DiscountSingleUiHomeBinding binding =DiscountSingleUiHomeBinding.inflate(LayoutInflater.from(context),parent,false);


        return new HomeViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeDiscountAdapter.HomeViewHolder holder, int position) {
      HomeDiscount homeDiscount = al.get(position);


      if(position!=0)
      {
          holder.binding.swipell.setVisibility(View.GONE);
      }
      holder.binding.tvDiscount.setText(""+homeDiscount.getDiscount());
    }

    @Override
    public int getItemCount() {
        return al.size();
    }

    class HomeViewHolder extends RecyclerView.ViewHolder
    {
        DiscountSingleUiHomeBinding binding;
        public HomeViewHolder(DiscountSingleUiHomeBinding binding)
        {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
