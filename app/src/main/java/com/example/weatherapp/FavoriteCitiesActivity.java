package com.example.weatherapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.weatherapp.adapter.CityAdapter;
import com.example.weatherapp.model.City;

import java.util.ArrayList;

public class FavoriteCitiesActivity extends AppCompatActivity {

    RecyclerView rvCitiesList;
    private CityAdapter cityAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_cities);

        rvCitiesList = findViewById(R.id.rvCitiesList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvCitiesList.setLayoutManager(linearLayoutManager);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        rvCitiesList.addItemDecoration(itemDecoration);

        cityAdapter = new CityAdapter(this, getListCity());
        rvCitiesList.setAdapter(cityAdapter);
        
    }

    private ArrayList<City> getListCity() {
        ArrayList<City> list = new ArrayList<>();
        list.add(new City("Hanoi"));
        list.add(new City("London"));
        list.add(new City("Tokyo"));

        return list;
    }
}