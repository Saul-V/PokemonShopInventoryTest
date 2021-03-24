package com.example.pokemonshopinventorytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.pokemonshopinventorytest.databinding.ActivityMainBinding;

import java.util.ArrayList;

import me.sargunvohra.lib.pokekotlin.client.PokeApi;
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding ui;

    //ArrayAdapter adapterArray = null;
    ItemAdapter adapterArray;
    ArrayList<Item> itemsList = new ArrayList<>();
    ListView listView;
    PokeApi pokeApi = new PokeApiClient();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());

        listView = findViewById(R.id.listObjects);



        Item first = new Item("Potion","");
        Item second = new Item("Super Potion","");
        Item third = new Item("Hyper Potion","");
        Item fourth = new Item("X Attack","");
        Item fifth = new Item("X Defend","");
        Item sixth = new Item("X Sp. Atk","");
        Item seventh = new Item("X Sp. Def","");
        Item eighth = new Item("X Speed","");
        Item ninth = new Item("Expert Belt","");
        Item tenth = new Item("Oran Berry","");
        Item eleventh = new Item("Sitrus Berry","");

        itemsList.add(first);
        itemsList.add(second);
        itemsList.add(third);
        itemsList.add(fourth);
        itemsList.add(fifth);
        itemsList.add(sixth);
        itemsList.add(seventh);
        itemsList.add(eighth);
        itemsList.add(ninth);
        itemsList.add(tenth);
        itemsList.add(eleventh);

//        itemsList.add("Super Potion");
//        itemsList.add("Hyper Potion");
//        itemsList.add("X Attack");
//        itemsList.add("X Defend");
//        itemsList.add("X Sp. Atk");
//        itemsList.add("X Sp. Def");
//        itemsList.add("X Speed");
//        itemsList.add("Revive");
//        itemsList.add("Ether");
//        itemsList.add("Elixer");
//        itemsList.add("PP UP");

        adapterArray = new ItemAdapter(this, R.layout.list_object_layout, itemsList);



        listView.setAdapter(adapterArray);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ItemActivity.class);
                Item existingItem = itemsList.get(position);
                intent.putExtra("position",position);
                intent.putExtra("name",existingItem.getName());
                startActivityForResult(intent,1);
            }
        });




    }

    public void setItemImage(){

    }

}