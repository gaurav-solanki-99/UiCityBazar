package com.example.uicitybazar.MyAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.uicitybazar.Model.Category;
import com.example.uicitybazar.databinding.CategorySingleUiBinding;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>
{

    Context context;
    ArrayList<Category> al;

    public CategoryAdapter(Context context,ArrayList<Category> al)
    {
        this.context=context;
        this.al=al;
    }

    @NonNull

    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       CategorySingleUiBinding binding=CategorySingleUiBinding.inflate(LayoutInflater.from(context),parent,false);


        return new CategoryViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull  CategoryAdapter.CategoryViewHolder holder, int position) {

        Category category = al.get(position);

        holder.binding.tvCategory.setText(category.getName());

        Glide.with(context).load(category.getImage()).into(holder.binding.categoryImage);

    }

    @Override
    public int getItemCount() {
        return al.size();
    }


    class CategoryViewHolder extends RecyclerView.ViewHolder
    {
        CategorySingleUiBinding binding;

        public CategoryViewHolder(CategorySingleUiBinding binding)
        {
            super(binding.getRoot());
            this.binding=binding;
        }
    }

}
