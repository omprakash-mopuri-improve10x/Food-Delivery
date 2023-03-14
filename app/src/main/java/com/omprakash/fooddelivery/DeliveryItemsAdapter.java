package com.omprakash.fooddelivery;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.omprakash.fooddelivery.databinding.DeliveryItemBinding;

import java.util.ArrayList;

public class DeliveryItemsAdapter extends RecyclerView.Adapter<DeliveryItemViewHolder> {

    ArrayList<DeliveryItem> deliveryItems;

    void setData(ArrayList<DeliveryItem> deliveryItems) {
        this.deliveryItems = deliveryItems;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DeliveryItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        DeliveryItemBinding binding = DeliveryItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        DeliveryItemViewHolder deliveryItemViewHolder = new DeliveryItemViewHolder(binding);
        return deliveryItemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DeliveryItemViewHolder holder, int position) {
        DeliveryItem deliveryItem = deliveryItems.get(position);
        holder.binding.setDeliveryItem(deliveryItem);
    }

    @Override
    public int getItemCount() {
        return deliveryItems.size();
    }
}
