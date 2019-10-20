package com.example.android_assistant;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {



    TextView chat_window;
    EditText question_text;
    Button send_button;
    TextToSpeech tts;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // this line on code initiates upon an App start via "onCreate"

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // connects current Java code with UI in file activity_main

        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR)
                    tts.setLanguage(new Locale("eng"));
            }
        });

        chat_window = findViewById(R.id.chat_window); // find the necessary element by name
        question_text = findViewById(R.id.question_text); // the same statement as above
        send_button = findViewById(R.id.send_button); // the same as statement as above

        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code initiates upon click
                String question = question_text.getText().toString();
                chat_window.append(">>> " + question + "\n");

                String answer = VA.getAnswer(question);

                tts.speak(answer, TextToSpeech.QUEUE_FLUSH, null, null);

                chat_window.append("<<< " + answer + "\n");

                question_text.setText("");
            }
        }); // assign an action on click
    }
}
