package com.example.quizizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myapplication2.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //sending data (EditText) to a new activity using intent (because there is only
    //one button in this activity), there is no need to define and find the button
    public void sendMessage(View view){

        EditText editText = findViewById(R.id.name);
        String message = editText.getText().toString();

        // Log.d("MainActivity", "knappen tryckt");
        Intent intent = new Intent(this,QuizTypes.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }


}
