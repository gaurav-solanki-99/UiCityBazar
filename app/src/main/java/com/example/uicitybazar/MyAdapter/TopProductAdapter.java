package com.example.uicitybazar.MyAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.uicitybazar.Model.TopProduct;
import com.example.uicitybazar.databinding.TopProductSingleUiBinding;

import java.util.ArrayList;

public class TopProductAdapter extends RecyclerView.Adapter<TopProductAdapter.TopProductAdapterViewHolder>
{
    Context context;
    ArrayList<TopProduct> al;

    public TopProductAdapter(Context context,ArrayList<TopProduct> al)
    {
        this.context=context;
        this.al=al;

    }

    @NonNull

    @Override
    public TopProductAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        TopProductSingleUiBinding binding=TopProductSingleUiBinding.inflate(LayoutInflater.from(context),parent,false);

        return new TopProductAdapterViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull  TopProductAdapter.TopProductAdapterViewHolder holder, int position)
    {
        TopProduct topProduct=al.get(position);

        holder.binding.price.setText(topProduct.getProductPrice());
        holder.binding.productName.setText(topProduct.getProductNAme());
        holder.binding.tvoffper.setText(topProduct.getOffPer());

        Glide.with(context).load(topProduct.getProductImage()).into(holder.binding.productImage);
    }

    @Override
    public int getItemCount() {
        return al.size();
    }


    class TopProductAdapterViewHolder extends RecyclerView.ViewHolder
    {
        TopProductSingleUiBinding binding;
        public TopProductAdapterViewHolder(TopProductSingleUiBinding binding)
        {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
