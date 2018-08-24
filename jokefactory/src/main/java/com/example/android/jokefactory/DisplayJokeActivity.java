package com.example.android.jokefactory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {
   TextView displayJokeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        displayJokeTextView =(TextView) findViewById(R.id.display_joke_tv);
        // Retrieve the joke from the intent extras
        String jokeResult = null;
        // the intent that startes
        Intent intent = getIntent();
        jokeResult = intent.getStringExtra(getString(R.string.jokeEnvelope));
        if(jokeResult != null){
            displayJokeTextView.setText(jokeResult);
        }else {
            displayJokeTextView.setText("Dig deeped, we gotta find the joke");

        }
    }
}
