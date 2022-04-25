package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;

public class display_slider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_slider);

        /*this sets the max value for the seekbar*/
        SeekBar simpleSeekBar=(SeekBar) findViewById(R.id.first_seekBar); // initiate the Seekbar
        simpleSeekBar.setMax(150); // 150 maximum value for the Seek bar
    }

    // This listener method will be invoked if any change is made in the SeekBar.
    public void onProgressChanged (SeekBar seekBar, int progresValue, boolean fromUser) {
    }

    // This listener method will be invoked at the start of user’s touch event.
    // Whenever a user touch the thumb for dragging this method will automatically called.
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    // This listener method will be invoked at the end of user touch event.
    // Whenever a user stop dragging the thump this method will be automatically called.
    public void onStopTrackingTouch(SeekBar seekBar) {
    }



}