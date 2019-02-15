package com.example.quizizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.media.CamcorderProfile.get;

public class QuizActivity extends AppCompatActivity {


    ArrayList<Question> quiz;
    ArrayList<Question> gQuiz = new ArrayList<>();
    ArrayList<Question> hQuiz = new ArrayList<>();
    ArrayList<Question> sQuiz = new ArrayList<>();

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
        String quizCategory = intent.getStringExtra(QuizTypesActivity.EXTRA_MESSAG1);
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

        Question question6 = new Question("World War I began in which year?",
                "1914",
                "1928",
                "1938",
                "1917",
                "1914"
        );

        Question question7 = new Question("Adolf Hitler was born in which country?",
                "Austria",
                "France",
                "Germany",
                "Austria",
                "Hungary"
        );

        Question question8 = new Question("The disease that ravaged and killed a third \n " +
                "of Europe's population in the 14th \n century is known as:",
                "The Bubonic Plague",
                "The White Death",
                "The Black Plague",
                "Smallpox",
                "The Bubonic Plague"
        );

        Question question9 = new Question("The gas usually filled in the electric bulb is:",
                "nitrogen",
                "hydrogen",
                "carbon dioxide",
                "oxygen",
                "nitrogen"
        );
        Question question10 = new Question("Which planet is known as the Red Planet?",
                "Mars",
                "Mercury",
                "Mars",
                " Earth",
                "Jupiter"
        );

        Question question11 = new Question("Which of the following is necessary for \n burning (combustion)?",
                "nitrogen",
                "petrol",
                "carbon",
                "Oxygen",
                "nitrogen"
        );



        gQuiz.add(question1); // 1-5 Geography
        gQuiz.add(question2);
        gQuiz.add(question3);
        gQuiz.add(question4);
        gQuiz.add(question5);
        hQuiz.add(question6); // 6-8 History
        hQuiz.add(question7);
        hQuiz.add(question8);
        sQuiz.add(question9);  // 9-11 Science
        sQuiz.add(question10);
        sQuiz.add(question11);



        if (quizCategory.equals(getString(R.string.geography_quiz))){
            quiz= gQuiz;
        }
        else if (quizCategory.equals(getString(R.string.history_quiz))){
            quiz = hQuiz; }
        else if (quizCategory.equals(getString(R.string.science_quiz))){
           quiz = sQuiz ;
        }





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

            questionView.setText(quiz.get(count).getQuestion());
            button1.setText(quiz.get(count).getChoice1());
            button2.setText(quiz.get(count).getChoice2());
            button3.setText(quiz.get(count).getChoice3());
            button4.setText(quiz.get(count).getChoice4());

            answer = quiz.get(count).getCorrectAnswer();
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
