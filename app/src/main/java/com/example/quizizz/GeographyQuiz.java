package com.example.quizizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GeographyQuiz extends AppCompatActivity {

    private QuizLibrary quizLibrary = new QuizLibrary();
    private TextView pointsView;
    private TextView countView;
    private TextView questionView;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    private String answer;
    private int score = 0;
    private int count = 0;
    private int questionNum = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geography_quiz);

        Intent intent = getIntent();
        String message = intent.getStringExtra(QuizTypes.EXTRA_MESSAG);

        TextView displayMessageView = findViewById(R.id.transferred_name);
        displayMessageView.setText(message + "`s");


        pointsView = findViewById(R.id.points);
        countView = findViewById(R.id.question_number);
        questionView = findViewById(R.id.question);
        button1 = findViewById(R.id.first_choice);
        button2 = findViewById(R.id.second_choice);
        button3 = findViewById(R.id.third_choice);
        button4 = findViewById(R.id.forth_choice);
        updateQuestion();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button1.getText().equals(answer)){
                    score = score + 1;
                    updateScore(score);
                    updateQuestion();
                }
                else
                    updateQuestion();

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button2.getText().equals(answer)){
                    score = score + 1;
                    updateScore(score);
                    updateQuestion();
                }
                else
                    updateQuestion();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button3.getText().equals(answer)){
                    score = score + 1;
                    updateScore(score);
                    updateQuestion();
                }
                else
                    updateQuestion();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button4.getText().equals(answer)){
                    score = score + 1;
                    updateScore(score);
                    updateQuestion();
                }
                else
                    updateQuestion();
            }
        });
    }

    private void updateQuestion(){
        questionView.setText(quizLibrary.getQuestion(questionNum));
        button1.setText(quizLibrary.getChoice1(questionNum));
        button2.setText(quizLibrary.getChoice2(questionNum));
        button3.setText(quizLibrary.getChoice3(questionNum));
        button4.setText(quizLibrary.getChoice4(questionNum));

        answer = quizLibrary.getCorrectChoice(questionNum);
        count = count + 1;
        updateCount(count);
        questionNum ++;


    }

    private void updateScore (int point){
        pointsView.setText("" + point);
    }

    private void updateCount (int questionCount){
        countView.setText("" + questionCount);
    }

}
