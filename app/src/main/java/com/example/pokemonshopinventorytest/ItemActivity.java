package com.example.pokemonshopinventorytest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import com.example.pokemonshopinventorytest.databinding.ActivityItemBinding;

public class ItemActivity extends AppCompatActivity {

    ActivityItemBinding ui;

    int position;
    String name = "";
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ui = ActivityItemBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());


        position = getIntent().getIntExtra("position", 0);
        name = getIntent().getStringExtra("name");
        setTitle(name);
        ui.itemNameView.setText(name);
    }

    public void onReturnClicked(View view){
        Intent i = new Intent();
        i.putExtra("position", position);
        i.putExtra("name", name);
        setResult(RESULT_OK,i);
        finish();
    }

    public void onBuyClicked(View view){
        Intent intent = new Intent();
        intent.putExtra("position", position);
        intent.putExtra("name", name);
        setResult(RESULT_OK,intent);
        finish();

    }

}
