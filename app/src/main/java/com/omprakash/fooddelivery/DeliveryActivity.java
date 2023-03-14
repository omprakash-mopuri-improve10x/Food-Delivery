package com.omprakash.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.omprakash.fooddelivery.databinding.ActivityDeliveryBinding;

public class DeliveryActivity extends AppCompatActivity {

    private ActivityDeliveryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDeliveryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}