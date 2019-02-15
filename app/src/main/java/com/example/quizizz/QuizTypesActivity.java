package com.example.quizizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizTypesActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAG = "com.example.myapplication2.MESSAG";
    public static final String EXTRA_MESSAG1 = "com.example.myapplication2.MESSAG1";

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_types);

        // receiving data from MainActivity
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView displayMessageView = findViewById(R.id.typed_name);
        displayMessageView.setText(message);

     //   init();
    }

    public void startQuiz(View v){



      //  Log.d("MainActivity", "knappen tryckt");

        TextView editText = findViewById(R.id.typed_name);
        String message = editText.getText().toString();



        Button button = (Button) v;
        Intent intent = new Intent(QuizTypesActivity.this, QuizActivity.class);

        intent.putExtra(EXTRA_MESSAG, message);
        intent.putExtra(EXTRA_MESSAG1, button.getText().toString());


        startActivity(intent);
    }





    //sending data while clicking on a specific button to the next activity
  //  public void init() {
    //  button.setOnClickListener(new View.OnClickListener() {
      //      @Override
        //    public void onClick(View v) {
          //      TextView editText = findViewById(R.id.typed_name);
            //    String message = editText.getText().toString();
             //   Intent intent = new Intent(QuizTypesActivity.this, QuizActivity.class);
             //   intent.putExtra(EXTRA_MESSAG, message);
            //    startActivity(intent);
     //       }
       // });
    //}
}
