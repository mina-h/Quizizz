package com.example.quizizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView displayMessageView = findViewById(R.id.typed_name);
        displayMessageView.setText(message);
    }

    public void startQuiz(View v){
        TextView editText = findViewById(R.id.typed_name);
        String message = editText.getText().toString();

        Button button = (Button) v;
        Intent intent = new Intent(QuizTypesActivity.this, QuestionActivity.class);

        intent.putExtra(EXTRA_MESSAG, message);
        intent.putExtra(EXTRA_MESSAG1, button.getText().toString());
        startActivity(intent);
    }
}