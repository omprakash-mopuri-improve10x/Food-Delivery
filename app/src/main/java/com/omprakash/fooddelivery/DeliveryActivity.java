package com.omprakash.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.omprakash.fooddelivery.databinding.ActivityDeliveryBinding;

import java.util.ArrayList;

public class DeliveryActivity extends AppCompatActivity {

    private ActivityDeliveryBinding binding;
    private ArrayList<DeliveryItem> deliveryItems;
    private DeliveryItemsAdapter deliveryItemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDeliveryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setData();
        setupDeliveryItemsAdapter();
        setupDeliveryItemsRv();
    }

    private void setData() {
        deliveryItems = new ArrayList<>();
        DeliveryItem deliveryItem = new DeliveryItem("Omprakash", "Jaladurgam", "Monday 09", "11min", "4.5");
        deliveryItems.add(deliveryItem);
        deliveryItems.add(deliveryItem);
        deliveryItems.add(deliveryItem);
        deliveryItems.add(deliveryItem);
        deliveryItems.add(deliveryItem);
        deliveryItems.add(deliveryItem);
        deliveryItems.add(deliveryItem);
        deliveryItems.add(deliveryItem);
        deliveryItems.add(deliveryItem);
    }

    private void setupDeliveryItemsAdapter() {
        deliveryItemsAdapter = new DeliveryItemsAdapter();
        deliveryItemsAdapter.setData(deliveryItems);
    }

    private void setupDeliveryItemsRv() {
        binding.deliveryItemsRv.setLayoutManager(new LinearLayoutManager(this));
        binding.deliveryItemsRv.setAdapter(deliveryItemsAdapter);
    }
}