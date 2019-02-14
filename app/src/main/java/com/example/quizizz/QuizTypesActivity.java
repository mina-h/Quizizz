package com.example.quizizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizTypesActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAG = "com.example.myapplication2.MESSAG";
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

        init();
    }

    //sending data while clicking on a specific button to the next activity
    public void init() {
        button = (Button) findViewById(R.id.geography_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText = findViewById(R.id.typed_name);
                String message = editText.getText().toString();
                Intent intent = new Intent(QuizTypesActivity.this, QuizActivity.class);
                intent.putExtra(EXTRA_MESSAG, message);
                startActivity(intent);
            }
        });
    }
}
