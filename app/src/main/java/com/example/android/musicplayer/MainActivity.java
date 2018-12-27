package com.example.android.musicplayer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the numbers category
        TextView favorites = (TextView) findViewById(R.id.favorites);
        // Set a click listener on that View
        favorites.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent favoritesIntent = new Intent(MainActivity.this, FavoritesActivity.class);
                // Start the new activity
                startActivity(favoritesIntent);
            }
        });

        // Find the View that shows the pop category
        TextView pop = (TextView) findViewById(R.id.pop);

        // Set a click listener on that View
        pop.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent popIntent = new Intent(MainActivity.this, PopActivity.class);

                // Start the new activity
                startActivity(popIntent);
            }
        });

        // Find the View that shows the country category
        TextView country = (TextView) findViewById(R.id.country);

        // Set a click listener on that View
        pop.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent countryIntent = new Intent(MainActivity.this, CountryActivity.class);

                // Start the new activity
                startActivity(countryIntent);
            }
        });

        // Find the View that shows the family category
        TextView jazz = (TextView) findViewById(R.id.jazz);

        // Set a click listener on that View
        pop.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent jazzIntent = new Intent(MainActivity.this, JazzActivity.class);

                // Start the new activity
                startActivity(jazzIntent);
            }
        });

        // Find the View that shows the rb category
        TextView rb = (TextView) findViewById(R.id.rb);

        // Set a click listener on that View
        rb.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent rbIntent = new Intent(MainActivity.this, RbActivity.class);

                // Start the new activity
                startActivity(rbIntent);
            }
        });

        // Find the View that shows the classic category
        TextView classic = (TextView) findViewById(R.id.classic);

        // Set a click listener on that View
        classic.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent classicIntent = new Intent(MainActivity.this, ClassicActivity.class);

                // Start the new activity
                startActivity(classicIntent);
            }
        });

        // Find the View that shows the rock category
        TextView rock = (TextView) findViewById(R.id.rock);

        // Set a click listener on that View
        rock.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);

                // Start the new activity
                startActivity(rockIntent);
            }
        });
    }
}


