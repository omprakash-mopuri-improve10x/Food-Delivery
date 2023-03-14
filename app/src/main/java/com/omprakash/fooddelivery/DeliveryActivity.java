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
        DeliveryItem deliveryItem1 = new DeliveryItem("https://www.archanaskitchen.com/images/archanaskitchen/World_Mediterranean/Lebanese_Falafel_Chickpea_Recipe_400.jpg", "Omprakash", "Jaladurgam", "Monday 09", "11min", "4.5");
        deliveryItems.add(deliveryItem1);
        DeliveryItem deliveryItem = new DeliveryItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSmwukWRfnD7Ori3abS83wWYhDgS_rdpJAEmQ&usqp=CAU", "Omprakash", "Jaladurgam", "Monday 09", "11min", "4.5");
        deliveryItems.add(deliveryItem);
        deliveryItems.add(deliveryItem1);
        deliveryItems.add(deliveryItem);
        deliveryItems.add(deliveryItem1);
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