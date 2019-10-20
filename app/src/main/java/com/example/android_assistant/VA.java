package com.example.android_assistant;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class VA {

    public static String getAnswer(String question) {
        // VA.getAnswer("question") - how to call this code
        // this method takes only one argument


        ArrayList<String> answers = new ArrayList<>();




        question = question.toLowerCase();



        if (question.contains("hello")) {
            answers.add("Hello!");
        }

        if (question.contains("how are you")) {
            answers.add("I'm OK!");
        }

        if (question.contains("what are you doing")) {
            answers.add("Answering some questions!");
        }

        if (question.contains("what is your name")) {
            answers.add("I'm Varvara");
        }


        if (question.contains("what time is it now")) {
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            String time = timeFormat.format(new Date());
            answers.add("The precise time is:" + time);
        }

        if (question.contains("what day is it today")) {
            SimpleDateFormat dayFormat = new SimpleDateFormat("dd:MM:YYYY");
            String date = dayFormat.format(new Date());
            answers.add("Today is:" + date);
        }

        // "Is there life on mars?", “Who's the president of Russia” and “What is the color
        // of the sky?”.

        if (question.contains("is there life on mars")) {
            answers.add("Maybe! You could probably ask Elon Musk.");
        }

        if (question.contains("who is the president of russia")) {
            answers.add("I don't know.");
        }

        if (question.contains("what is the color of the sky")) {
            answers.add("Just look up!");
        }



        if (answers.size() == 0) {
            // no answers
            answers.add("I'm sorry, I don't understand you. Please, try again!");
        }



        String result = String.join(", ", answers);

        return result;
    }
}
