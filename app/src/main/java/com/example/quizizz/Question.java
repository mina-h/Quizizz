package com.example.quizizz;

public class Question {
    private String question;
    private String correctAnswer;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;


    public Question(String question, String correctAnswer, String choice1,
                    String choice2, String choice3, String choice4){
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
        this.choice4 = choice4;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getChoice1() {
        return choice1;
    }

    public String getChoice2() {
        return choice2;
    }

    public String getChoice3() {
        return choice3;
    }

    public String getChoice4() {
        return choice4;
    }
}
