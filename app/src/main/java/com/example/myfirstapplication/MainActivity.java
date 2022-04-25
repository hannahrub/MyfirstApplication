package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) { // init activity
        super.onCreate(savedInstanceState); // gives former state (can be used to reestablish former state)
        setContentView(R.layout.activity_main); // make it the content of the activity
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) { // has to be void to be recognized by button as callable function, has to have view (rectangular interface building block) argument
        /*to use this function select the button object an set it in the "on click" property*/

        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class); //Intent is an object that provides runtime binding between separate components, such as two activities.
        // intent constructor takes two parameters, a Context and a Class.
        // The Class parameter of the app component, to which the system delivers the Intent, is, in this case, the activity to start.

        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String message = editText.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);
        // The putExtra() method adds the value of EditText to the intent. An Intent can carry data types as key-value pairs called extras.
        //Your key is a public constant EXTRA_MESSAGE because the next activity uses the key to retrieve the text value.
        // It's a good practice to define keys for intent extras with your app's package name as a prefix.
        // This ensures that the keys are unique, in case your app interacts with other apps.

        startActivity(intent);
        // The startActivity() method starts an instance of the DisplayMessageActivity that's specified by the Intent.
    }

    /** Called when the user taps the access slider button*/
    public void sliderMenu(View view) {
        // always remember to set the button.onClick to the corresponding activity!!!!
        Intent intent = new Intent(this, display_sliderActivity.class);
        startActivity(intent);
        }


}