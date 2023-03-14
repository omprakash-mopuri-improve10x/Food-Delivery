package com.omprakash.fooddelivery;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.omprakash.fooddelivery.databinding.DeliveryItemBinding;

public class DeliveryItemViewHolder extends RecyclerView.ViewHolder {

    DeliveryItemBinding binding;

    public DeliveryItemViewHolder(DeliveryItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
