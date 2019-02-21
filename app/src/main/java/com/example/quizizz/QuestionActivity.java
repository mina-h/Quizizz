package com.example.quizizz;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

import static android.media.CamcorderProfile.get;

public class QuestionActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAG2 = "com.example.myapplication2.MESSAG2";
    public static final String SCORE = "com.example.myapplication2.SCORE";
    private static final long COUNTDOWN_IN_MILLIS = 20000;

    ArrayList<Question> quiz;
    ArrayList<Question> gQuiz = new ArrayList<>();
    ArrayList<Question> hQuiz = new ArrayList<>();
    ArrayList<Question> sQuiz = new ArrayList<>();
    ArrayList<Question> mQuiz = new ArrayList<>();


    private TextView pointsView;
    private TextView countView;
    private TextView questionView;
    private TextView questionNumbers;
    private TextView timerView;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    private String answer;
    private int score = 0;
    private int count = 0;

    private ColorStateList textColorDefaultCd;
    private CountDownTimer countDownTimer;
    private long timeLeftInMillis;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        Intent intent = getIntent();
        String message = intent.getStringExtra(QuizTypesActivity.EXTRA_MESSAG);
        String quizCategory = intent.getStringExtra(QuizTypesActivity.EXTRA_MESSAG1);
        TextView displayMessageView = findViewById(R.id.transferred_name);
        displayMessageView.setText(message + "`s");


        pointsView = findViewById(R.id.points);
        countView = findViewById(R.id.question_number);
        questionNumbers = findViewById(R.id.question_number_description);
        questionView = findViewById(R.id.question);
        timerView = findViewById(R.id.timer);
        button1 = findViewById(R.id.first_choice);
        button2 = findViewById(R.id.second_choice);
        button3 = findViewById(R.id.third_choice);
        button4 = findViewById(R.id.forth_choice);

        textColorDefaultCd = timerView.getTextColors();

        Question question1 = new Question(getString(R.string.q1),
                getString(R.string.q1Answer),
                getString(R.string.q1Choice1),
                getString(R.string.q1Choice2),
                getString(R.string.q1Choice3),
                getString(R.string.q1Choice4)
        );

        Question question2 = new Question(getString(R.string.q2),
                getString(R.string.q2Answer),
                getString(R.string.q2Choice1),
                getString(R.string.q2Choice2),
                getString(R.string.q2Choice3),
                getString(R.string.q2Choice4)
        );

        Question question3 = new Question(getString(R.string.q3),
                getString(R.string.q3Answer),
                getString(R.string.q3Choice1),
                getString(R.string.q3Choice2),
                getString(R.string.q3Choice3),
                getString(R.string.q3Choice4)

        );

        Question question4 = new Question(getString(R.string.q4),
                getString(R.string.q4Answer),
                getString(R.string.q4Choice1),
                getString(R.string.q4Choice2),
                getString(R.string.q4Choice3),
                getString(R.string.q4Choice4)
        );

        Question question5 = new Question(getString(R.string.q5),
                getString(R.string.q5Answer),
                getString(R.string.q5Choice1),
                getString(R.string.q5Choice2),
                getString(R.string.q5Choice3),
                getString(R.string.q5Choice4)
        );

        Question question6 = new Question(getString(R.string.q6),
                getString(R.string.q6Answer),
                getString(R.string.q6Choice1),
                getString(R.string.q6Choice2),
                getString(R.string.q6Choice3),
                getString(R.string.q6Choice4)
        );

        Question question7 = new Question(getString(R.string.q7),
                getString(R.string.q7Answer),
                getString(R.string.q7Choice1),
                getString(R.string.q7Choice2),
                getString(R.string.q7Choice3),
                getString(R.string.q7Choice4)
        );

        Question question8 = new Question(getString(R.string.q8),
                getString(R.string.q8Answer),
                getString(R.string.q8Choice1),
                getString(R.string.q8Choice2),
                getString(R.string.q8Choice3),
                getString(R.string.q8Choice4)
        );

        Question question9 = new Question(getString(R.string.q9),
                getString(R.string.q9Answer),
                getString(R.string.q9Choice1),
                getString(R.string.q9Choice2),
                getString(R.string.q9Choice3),
                getString(R.string.q9Choice4)
        );

        Question question10 = new Question(getString(R.string.q10),
                getString(R.string.q10Answer),
                getString(R.string.q10Choice1),
                getString(R.string.q10Choice2),
                getString(R.string.q10Choice3),
                getString(R.string.q10Choice4)
        );

        Question question11 = new Question(getString(R.string.q11),
                getString(R.string.q11Answer),
                getString(R.string.q11Choice1),
                getString(R.string.q11Choice2),
                getString(R.string.q11Choice3),
                getString(R.string.q11Choice4)
        );

        Question question12 = new Question(getString(R.string.q12),
                getString(R.string.q12Answer),
                getString(R.string.q12Choice1),
                getString(R.string.q12Choice2),
                getString(R.string.q12Choice3),
                getString(R.string.q12Choice4)
        );

        Question question13 = new Question(getString(R.string.q13),
                getString(R.string.q13Answer),
                getString(R.string.q13Choice1),
                getString(R.string.q13Choice2),
                getString(R.string.q13Choice3),
                getString(R.string.q13Choice4)
        );

        Question question14 = new Question(getString(R.string.q14),
                getString(R.string.q14Answer),
                getString(R.string.q14Choice1),
                getString(R.string.q14Choice2),
                getString(R.string.q14Choice3),
                getString(R.string.q14Choice4)
        );

        Question question15 = new Question(getString(R.string.q15),
                getString(R.string.q15Answer),
                getString(R.string.q15Choice1),
                getString(R.string.q15Choice2),
                getString(R.string.q15Choice3),
                getString(R.string.q15Choice4)
        );


        gQuiz.add(question1); // 1-5 Geography
        gQuiz.add(question2);
        gQuiz.add(question3);
        gQuiz.add(question4);
        gQuiz.add(question5);
        hQuiz.add(question6); // 6-10 History
        hQuiz.add(question7);
        hQuiz.add(question8);
        hQuiz.add(question9);
        hQuiz.add(question10);
        sQuiz.add(question11);// 11-15 Science
        sQuiz.add(question12);
        sQuiz.add(question13);
        sQuiz.add(question14);
        sQuiz.add(question15);
        mQuiz.add(question1);  // mixed quiz
        mQuiz.add(question2);
        mQuiz.add(question3);
        mQuiz.add(question4);
        mQuiz.add(question5);
        mQuiz.add(question6);
        mQuiz.add(question7);
        mQuiz.add(question8);
        mQuiz.add(question9);
        mQuiz.add(question10);
        mQuiz.add(question11);
        mQuiz.add(question12);
        mQuiz.add(question13);
        mQuiz.add(question14);
        mQuiz.add(question15);





        if (quizCategory.equals(getString(R.string.geography_quiz))) {
            quiz = gQuiz;
        } else if (quizCategory.equals(getString(R.string.history_quiz))) {
            quiz = hQuiz;
        } else if (quizCategory.equals(getString(R.string.science_quiz))) {
            quiz = sQuiz;
        } else if (quizCategory.equals(getString(R.string.mixed_quiz))) {
            quiz = mQuiz;
        }
        Collections.shuffle(quiz);
        questionNumbers.setText("/" + quiz.size());


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();

                if (button1.getText().equals(answer)) {
                    score = score + 10;
                    updateScore(score);
                    Toast.makeText(QuestionActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                    if (count == quiz.size()) {
                        TextView text = findViewById(R.id.transferred_name);
                        String message = text.getText().toString();
                        Intent intent1 = new Intent(QuestionActivity.this, ResultActivity.class);
                        intent1.putExtra(SCORE, score);
                        intent1.putExtra(EXTRA_MESSAG2, message);
                        startActivity(intent1);
                    }
                    else {
                        updateQuestion();
                    }

                } else {
                    Toast.makeText(QuestionActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    if (count == quiz.size()) {
                        TextView text = findViewById(R.id.transferred_name);
                        String message = text.getText().toString();
                        Intent intent1 = new Intent(QuestionActivity.this, ResultActivity.class);
                        intent1.putExtra(SCORE, score);
                        intent1.putExtra(EXTRA_MESSAG2, message);

                        startActivity(intent1);

                    } else
                    updateQuestion();
                }
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();

                if (button2.getText().equals(answer)) {
                    score = score + 10;
                    updateScore(score);
                    Toast.makeText(QuestionActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                    if (count == quiz.size()) {
                        TextView text = findViewById(R.id.transferred_name);
                        String message = text.getText().toString();
                        Intent intent1 = new Intent(QuestionActivity.this, ResultActivity.class);
                        intent1.putExtra(SCORE, score);
                        intent1.putExtra(EXTRA_MESSAG2, message);

                        startActivity(intent1);
                    }
                    else
                        updateQuestion();
                } else {
                    Toast.makeText(QuestionActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    if (count == quiz.size()) {
                        TextView text = findViewById(R.id.transferred_name);
                        String message = text.getText().toString();
                        Intent intent1 = new Intent(QuestionActivity.this, ResultActivity.class);
                        intent1.putExtra(SCORE, score);
                        intent1.putExtra(EXTRA_MESSAG2, message);

                        startActivity(intent1);

                    } else
                        updateQuestion();
                }

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();

                if (button3.getText().equals(answer)) {
                    score = score + 10;
                    updateScore(score);
                    Toast.makeText(QuestionActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                    if (count == quiz.size()) {
                        TextView text = findViewById(R.id.transferred_name);
                        String message = text.getText().toString();
                        Intent intent1 = new Intent(QuestionActivity.this, ResultActivity.class);
                        intent1.putExtra(SCORE, score);
                        intent1.putExtra(EXTRA_MESSAG2, message);

                        startActivity(intent1);
                    }
                    else
                        updateQuestion();
                } else {
                    Toast.makeText(QuestionActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    if (count == quiz.size()) {
                        TextView text = findViewById(R.id.transferred_name);
                        String message = text.getText().toString();
                        Intent intent1 = new Intent(QuestionActivity.this, ResultActivity.class);
                        intent1.putExtra(SCORE, score);
                        intent1.putExtra(EXTRA_MESSAG2, message);

                        startActivity(intent1);

                    } else
                        updateQuestion();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();

                if (button4.getText().equals(answer)) {
                    score = score + 10;
                    updateScore(score);
                    Toast.makeText(QuestionActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                    if (count == quiz.size()) {
                        TextView text = findViewById(R.id.transferred_name);
                        String message = text.getText().toString();
                        Intent intent1 = new Intent(QuestionActivity.this, ResultActivity.class);
                        intent1.putExtra(SCORE, score);
                        intent1.putExtra(EXTRA_MESSAG2, message);

                        startActivity(intent1);
                    }
                    else
                        updateQuestion();
                } else {
                    Toast.makeText(QuestionActivity.this, "Wrong", Toast.LENGTH_SHORT).show();

                    if (count == quiz.size()) {
                        TextView text = findViewById(R.id.transferred_name);
                        String message = text.getText().toString();
                        Intent intent1 = new Intent(QuestionActivity.this, ResultActivity.class);
                        intent1.putExtra(SCORE, score);
                        intent1.putExtra(EXTRA_MESSAG2, message);

                        startActivity(intent1);

                    } else
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

            timeLeftInMillis = COUNTDOWN_IN_MILLIS;
            startCountDown();

    }

    private void startCountDown(){
        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                timeLeftInMillis = 0;
                updateCountDownText();

                Toast.makeText(QuestionActivity.this, "Time is up!", Toast.LENGTH_SHORT).show();
                if (count == quiz.size()) {
                    TextView text = findViewById(R.id.transferred_name);
                    String message = text.getText().toString();
                    Intent intent1 = new Intent(QuestionActivity.this, ResultActivity.class);
                    intent1.putExtra(SCORE, score);
                    intent1.putExtra(EXTRA_MESSAG2, message);

                    startActivity(intent1);

                } else {
                    updateQuestion();

                }
            }
        }.start();
    }

    private void updateCountDownText(){
        int minutes = (int) (timeLeftInMillis/ 1000) / 60;
        int seconds = (int) (timeLeftInMillis/ 1000) % 60;

        String timeFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        timerView.setText(timeFormatted);

        if (timeLeftInMillis < 10000){
            timerView.setTextColor(Color.RED);
        } else  {
            timerView.setTextColor(textColorDefaultCd);
        }
    }

    private void updateScore (int point){
        pointsView.setText("" + point);
    }

    private void updateCount (int questionCount){
        countView.setText("" + questionCount);
    }
     @Override
    protected void onDestroy(){
        super.onDestroy();
        if (countDownTimer != null){
            countDownTimer.cancel();
        }
     }
}