package com.example.marcoventuri.quizapphistory;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    // Question 1
    RadioButton q1_answer;
    // Question 2
    EditText q2_answer;
    // Question 3
    CheckBox q3_answer1;
    CheckBox q3_answer2;
    CheckBox q3_answer3;
    // Question 4
    EditText q4_answer;
    // Question 5
    RadioButton q5_answer2;
    // Question 6
    RadioButton q6_answer2;
    // Question 7
    RadioButton q7_answer1;
    // Question 8
    RadioButton q8_answer3;
    // Question 9
    CheckBox q9_answer1;
    CheckBox q9_answer2;
    CheckBox q9_answer3;
    // Question 10
    RadioButton q10_answer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswers(View view) {
        CharSequence resultsDisplay;
        Log.e(LOG_TAG, " " + this.findViewById(R.id.q6_answer3));
        int final_score= 0;


        /* Question 1 - Answer: September, 1st 1939 */

        Boolean answer1;

        q1_answer = (RadioButton) this.findViewById(R.id.q1_answer1);
        answer1 = q1_answer.isChecked();
        if (answer1) {
            final_score++;
        } else {
            final_score = final_score;
        }

        /* Question 2 - Answer: 1969 */

        String answer2;
        q2_answer = (EditText) this.findViewById(R.id.q2_answer);
        answer2 = q2_answer.getText().toString().trim();
        if (answer2.equals("1969")) {
            final_score++;
        } else {
            final_score = final_score;
        }

        /* Question 3 - Answers: Italy && France */

        Boolean answer3_choice1;
        Boolean answer3_choice2;
        Boolean answer3_choice3;
        q3_answer1 = (CheckBox) this.findViewById(R.id.q3_answer1);
        q3_answer2 = (CheckBox) this.findViewById(R.id.q3_answer2);
        q3_answer3 = (CheckBox) this.findViewById(R.id.q3_answer3);
        answer3_choice1 = q3_answer1.isChecked();
        answer3_choice2 = q3_answer2.isChecked();
        answer3_choice3 = q3_answer3.isChecked();
        if (answer3_choice1 && answer3_choice2 && !answer3_choice3) {
            final_score++;
        } else {
            final_score = final_score;
        }

        /* Question 4 - Answer: 1905 */

        String answer4;
        q4_answer = (EditText) this.findViewById(R.id.q4_answer);
        answer4 = q4_answer.getText().toString().trim();
        if (answer4.equals("1905")) {
            final_score++;
        } else {
            final_score = final_score;
        }

        /* Question 5 - Answer: the Normandy Landings */

        Boolean answer5;
        q5_answer2 = (RadioButton) this.findViewById(R.id.q5_answer2);
        answer5 = q5_answer2.isChecked();
        if (answer5) {
            final_score++;
        } else {
            final_score = final_score;
        }

        /* Question 6 - Answers: Franklin Delano Roosvelt  */

        Boolean answer6;
        q6_answer2 = (RadioButton) this.findViewById(R.id.q6_answer2);
        answer6 = q6_answer2.isChecked();
        if (answer6) {
            final_score++;
        } else {
            final_score = final_score;
        }

        /* Question 7 - Answer: Bonn */

        Boolean answer7;
        q7_answer1 = (RadioButton) this.findViewById(R.id.q7_answer1);
        answer7 = q7_answer1.isChecked();
        if (answer7) {
            final_score++;
        } else {
            final_score = final_score;
        }

        /* Question 8 - Answer: W.Churchill */

        Boolean answer8;
        q8_answer3 = (RadioButton) this.findViewById(R.id.q8_answer3);
        answer8 = q8_answer3.isChecked();
        if (answer8) {
            final_score++;
        } else {
            final_score = final_score;
        }

         /* Question 9 - Answers: France && Russia */

        Boolean answer9_choice1;
        Boolean answer9_choice2;
        Boolean answer9_choice3;
        q9_answer1 = (CheckBox) this.findViewById(R.id.q9_answer1);
        q9_answer2 = (CheckBox) this.findViewById(R.id.q9_answer2);
        q9_answer3 = (CheckBox) this.findViewById(R.id.q9_answer3);
        answer9_choice1 = q9_answer1.isChecked();
        answer9_choice2 = q9_answer2.isChecked();
        answer9_choice3 = q9_answer3.isChecked();

        if (answer9_choice1 && !answer9_choice2 && answer9_choice3) {
            final_score++;
        } else {
            final_score = final_score;
        }

         /* Question 10 - Answer: 1939 */
        Boolean answer10;
        q10_answer2 = (RadioButton) this.findViewById(R.id.q10_answer2);
        answer10 = q10_answer2.isChecked();
        if (answer10) {
            final_score++;
        } else {
            final_score = final_score;
        }


        /* Score */


        if (final_score == 10) {
            resultsDisplay = "Congrats! You\'re a History expert! 10 out of 10!";
        } else if (final_score > 7){
            resultsDisplay = "Awesome but you can do better than this! " + final_score + " out of 10.";
        } else if (final_score > 3){
            resultsDisplay = "You should study more! " + final_score + " out of 10.";
        } else{
            resultsDisplay = "Get a book and start studying! " + final_score + " out of 10.";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}

