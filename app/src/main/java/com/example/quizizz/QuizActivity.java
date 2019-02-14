package com.example.quizizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.media.CamcorderProfile.get;

public class QuizActivity extends AppCompatActivity {


    ArrayList<Question> geography = new ArrayList<>();
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geography_quiz);

        Intent intent = getIntent();
        String message = intent.getStringExtra(QuizTypesActivity.EXTRA_MESSAG);

        TextView displayMessageView = findViewById(R.id.transferred_name);
        displayMessageView.setText(message + "`s");


        pointsView = findViewById(R.id.points);
        countView = findViewById(R.id.question_number);
        questionView = findViewById(R.id.question);
        button1 = findViewById(R.id.first_choice);
        button2 = findViewById(R.id.second_choice);
        button3 = findViewById(R.id.third_choice);
        button4 = findViewById(R.id.forth_choice);





        Question question1 = new Question("Bucharest is the capital \n city of which country?",
                "Romania",
                "Ukraine",
                "Romania",
                "Belarus",
                "Moldova"

        );

        Question question2 = new Question("Of these oceans,  which \n is the largest?",
                "Atlantic",
                "Indian",
                "Southern",
                "Arctic",
                "Atlantic"
        );

        Question question3 = new Question("What is the world's longest \n above-ground mountain range?",
                "Andes",
                "Himalayas",
                "Andes",
                "Great Dividing Range",
                "Rocky Mountains"

        );

        Question question4 = new Question("What is the smallest \n country in the world?",
                "Vatican City",
                "Vatican City",
                "Monaco",
                "Nauru",
                "Maldives"
        );

        Question question5 = new Question("Which of the following countries \n is located nearest to the equator?",
                "Kenya",
                "Kenya",
                "Puerto Rico",
                "The Philippines",
                "Fiji"
        );


        geography.add(question1);
        geography.add(question2);
        geography.add(question3);
        geography.add(question4);
        geography.add(question5);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button1.getText().equals(answer)){
                    score = score + 1;
                    updateScore(score);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(QuizActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button2.getText().equals(answer)){
                    score = score + 1;
                    updateScore(score);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(QuizActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button3.getText().equals(answer)){
                    score = score + 1;
                    updateScore(score);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(QuizActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button4.getText().equals(answer)){
                    score = score + 1;
                    updateScore(score);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(QuizActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });


        updateQuestion();
    }

    private void updateQuestion() {

            questionView.setText(geography.get(count).getQuestion());
            button1.setText(geography.get(count).getChoice1());
            button2.setText(geography.get(count).getChoice2());
            button3.setText(geography.get(count).getChoice3());
            button4.setText(geography.get(count).getChoice4());

            answer = geography.get(count).getCorrectAnswer();
            count = count + 1;
            updateCount(count);

    }

    private void updateScore (int point){
        pointsView.setText("" + point);
    }

    private void updateCount (int questionCount){
        countView.setText("" + questionCount);
    }

}
