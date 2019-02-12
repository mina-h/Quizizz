package com.example.quizizz;

public class QuizLibrary {

    private String questions [] = {
            "Bucharest is the capital \n city of which country?",
            "Of these oceans,  which \n is the largest?",
            "What is the world's longest \n above-ground mountain range?",
            "What is the smallest \n country in the world?",
            "Which of the following countries \n is located nearest to the equator?"
    };
    private String choices [][] = {
            {"Ukraine", "Romania", "Belarus", "Moldova"},
            {"Indian", "Southern", "Atlantic", "Arctic"},
            {"Himalayas", "Rocky Mountains", "Andes", "Great Dividing Range"},
            {"Vatican City", "Monaco", "Nauru", "Maldives"},
            {"The Philippines", "Kenya", "Puerto Rico", "Fiji"}
    };

    private String correctChoices[] = {
            "Romania","Atlantic","Andes","Vatican City","Kenya"
    };


    public String getQuestion (int a){
        String question = questions [a];
        return question;
    }

    public String getChoice1 (int a){
        String choice1 = choices[a][0];
        return choice1;
    }
    public String getChoice2 (int a){
        String choice2 = choices[a][1];
        return choice2;
    }
    public String getChoice3 (int a){
        String choice3 = choices[a][2];
        return choice3;
    }
    public String getChoice4 (int a){
        String choice4 = choices[a][3];
        return choice4;
    }

    public String getCorrectChoice (int a){
        String correctChoice = correctChoices[a];
        return correctChoice;
    }
}
