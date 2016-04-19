package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {
    private TextView mStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_story);

        mStory = (TextView) findViewById(R.id.Story);

        Intent intent = getIntent();
        String Noun1 = intent.getStringExtra("Noun1");
        String Noun2 = intent.getStringExtra("Noun2");
        String Verb1 = intent.getStringExtra("Verb1");
        String Verb2 = intent.getStringExtra("Verb2");

        mStory.setText("There once was a " + Noun1 +" from Portland. He fancied himself a " + Noun2 + ". One day he went out " + Verb1 + " and he saw another "+ Noun1 + " . He was " + Verb2 +" to that " + Noun1 + " when, suddenly he felt ill and went home.");

    }
}
