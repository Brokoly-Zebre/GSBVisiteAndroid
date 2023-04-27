package com.example.gsbvisite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.gsbvisite.databinding.ActivityUserBinding;

import retrofit2.Call;


public class Visiteurs_Activity extends AppCompatActivity {

    private ActivityUserBinding binding;
    private Token token;
    private String username;
    private Visiteurs visiteurs;
    private Visiteur visiteur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUserBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        binding.RecyclerViewP.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        binding.RecyclerViewP.setLayoutManager(layoutManager);
        binding.RecyclerViewP.setFocusable(false);



    }
}