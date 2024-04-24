package com.example.listview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    ArrayList<String> countryNames;
    ArrayList<Integer> countryImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.lv_countries);
        countryNames=new ArrayList<>();
        countryImages=new ArrayList<>();

        //add names of countries
        countryNames.add("Algerie");
        countryNames.add("Andorra");
        countryNames.add("Congo");
        countryNames.add("Egypte");
       // countryNames.add("Afrique du Sud");
        countryNames.add("Corée du Sud");
        countryNames.add("Espagne");

        //add images links
        countryImages.add(R.drawable.algeria);
        countryImages.add(R.drawable.andorra);
        countryImages.add(R.drawable.congo);
        countryImages.add(R.drawable.egypt);
       //countryImages.add(R.drawable.south_africa);
        countryImages.add(R.drawable.south_korea);
        countryImages.add(R.drawable.spain);

        CountryListAdapter countryListAdapter=new CountryListAdapter(MainActivity.this,countryNames,countryImages);
        listView.setAdapter(countryListAdapter);

     //   MyAdapter myAdapter=new MyAdapter(MainActivity.this,countryNames,countryImages);
      //  listView.setAdapter(myAdapter);
    }
}
