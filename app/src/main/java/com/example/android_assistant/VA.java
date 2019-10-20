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

        // "Is there life on mars?", “Do you love video games?” and “What is the color
        // of the sky?”, "Do you like to read books?"

        if (question.contains("is there life on mars")) {
            answers.add("Maybe! You could probably ask Elon Musk.");
        }

        if (question.contains("do you love video games")) {
            answers.add("Sure, I do! For example, for favorite ones are Overwatch, StarCraft, Half-Life and the Witcher.");
        }

        if (question.contains("what is the color of the sky")) {
            answers.add("Just look up!");

        }

        if (question.contains("do you like to read books")) {
            answers.add("Yep. I'm a fan of Arthur Clark and Issac Asimov." +
                    "Oh, and, I've got to tell that HAL-9000 is my hero. LOL.");

        }




        if (answers.size() == 0) {
            // no answers
            answers.add("I'm sorry, I don't understand you. Please, try again!");
        }



        String result = String.join(", ", answers);

        return result;
    }
}
