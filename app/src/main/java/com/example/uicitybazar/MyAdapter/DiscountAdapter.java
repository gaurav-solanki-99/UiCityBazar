package com.example.uicitybazar.MyAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uicitybazar.Model.DiscountPer;
import com.example.uicitybazar.databinding.DiscountSingleUiBinding;

import java.util.ArrayList;

public class DiscountAdapter  extends RecyclerView.Adapter<DiscountAdapter.DiscountViewHolder>
{
    Context context;
    ArrayList<DiscountPer> al;

    public DiscountAdapter(Context context,ArrayList<DiscountPer> al)
    {
        this.context=context;
        this.al=al;
    }

    @NonNull

    @Override
    public DiscountViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        DiscountSingleUiBinding binding=DiscountSingleUiBinding.inflate(LayoutInflater.from(context),parent,false);

        return new DiscountViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull  DiscountAdapter.DiscountViewHolder holder, int position) {

         DiscountPer discountPer = al.get(position);

         holder.binding.tvPercentage.setText(""+discountPer.getPercentage());
    }

    @Override
    public int getItemCount() {
        return al.size();
    }

    class DiscountViewHolder extends RecyclerView.ViewHolder
    {
        DiscountSingleUiBinding binding;
        public DiscountViewHolder(DiscountSingleUiBinding binding)
        {
            super(binding.getRoot());
            this.binding=binding;
        }
    }

}
