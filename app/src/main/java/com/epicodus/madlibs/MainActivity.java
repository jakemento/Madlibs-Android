package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mGo;
    private Button mClear;
    private EditText mNoun1;
    private EditText mNoun2;
    private EditText mVerb1;
    private EditText mVerb2;
    private EditText mAdjective1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mNoun1 = (EditText) findViewById(R.id.Story);
        mNoun2 = (EditText) findViewById(R.id.Noun2);
        mVerb1 = (EditText) findViewById(R.id.Verb1);
        mVerb2 = (EditText) findViewById(R.id.Verb2);
        mAdjective1 = (EditText) findViewById(R.id.Adjective1);


        mGo = (Button) findViewById(R.id.Go);
        mClear = (Button) findViewById(R.id.Clear);
        mClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mNoun1.setText("");
                mNoun2.setText("");
                mVerb1.setText("");
                mVerb2.setText("");
                mAdjective1.setText("");

            }
        });
        mGo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String Noun1 = mNoun1.getText().toString();
                String Noun2 = mNoun2.getText().toString();
                String Verb1 = mVerb1.getText().toString();
                String Verb2 = mVerb2.getText().toString();
                String Adjective1 = mAdjective1.getText().toString();
                Log.d(TAG, Noun1);


              Intent intent = new Intent(MainActivity.this, StoryActivity.class);
                intent.putExtra("Noun1", Noun1);
                intent.putExtra("Noun2", Noun2);
                intent.putExtra("Verb1", Verb1);
                intent.putExtra("Verb2", Verb2);
                intent.putExtra("Adjective1", Adjective1);
                startActivity(intent);


            }
        });
    }
}
