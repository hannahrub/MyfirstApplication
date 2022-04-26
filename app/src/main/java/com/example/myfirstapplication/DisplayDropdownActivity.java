package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DisplayDropdownActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_dropdown2);

        Spinner dropdownMenu = findViewById(R.id.spinner_dropdown);

        // Create an ArrayAdapter using the string array and a default spinner layout
        // simple_spinner_item layout is provided by the platform and is the default layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.menuItemsArray, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        //setDropDownViewResource(int) specifies the layout the adapter should use to display the list of spinner choices
        // simple_spinner_dropdown_item is another standard layout defined by the platform.
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        dropdownMenu.setAdapter(adapter);

    }
}