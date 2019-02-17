package com.example.quizizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView result;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);



        Intent intent = getIntent();
        String message1 = intent.getStringExtra(QuizActivity.EXTRA_MESSAG2);
        TextView displayMessageView = findViewById(R.id.namee);
        displayMessageView.setText(message1 +" score:");

        int message = intent.getIntExtra(QuizActivity.SCORE, 0);
        result = findViewById(R.id.result_score);
        result.setText(message + "");


        button = findViewById(R.id.back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

    }

    public void openMainActivity(){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);

    }
  //  public void returnToQuiz (View v){
   //     Intent intent = new Intent (ResultActivity.this, MainActivity.class);
  //      startActivity(intent);
  //  }
}
