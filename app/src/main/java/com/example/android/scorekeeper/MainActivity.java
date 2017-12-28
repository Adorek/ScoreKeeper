package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final String STATE_SCORETEAMA = "scorePlayerOne";
    static final String STATE_SCORETEAMB = "scorePlayerTwo";

    int scorePlayerOne = 0;
    int scorePlayerTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current score state
        savedInstanceState.putInt(STATE_SCORETEAMA, scorePlayerOne);
        savedInstanceState.putInt(STATE_SCORETEAMB, scorePlayerTwo);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);

        // Restore state members from saved instance
        scorePlayerOne = savedInstanceState.getInt(STATE_SCORETEAMA);
        scorePlayerTwo = savedInstanceState.getInt(STATE_SCORETEAMB);

        displayForPlayerOne(scorePlayerOne);
        displayForPlayerTwo(scorePlayerTwo);
    }


    /**
     * Displays the given score for Player One.
     */
    public void displayForPlayerOne(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_one_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Player Two.
     */
    public void displayForPlayerTwo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_two_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the score for Player One by 1 points.
     */
    public void addOneForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 1;
        displayForPlayerOne(scorePlayerOne);
    }
    /**
     * Increase the score for Player One by 2 points.
     */
    public void addTwoForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 2;
        displayForPlayerOne(scorePlayerOne);
    }
    /**
     * Increase the score for Player One by 3 points.
     */
    public void addThreeForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 3;
        displayForPlayerOne(scorePlayerOne);
    }
    /**
     * Increase the score for Player One by 4 points.
     */
    public void addFourForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 4;
        displayForPlayerOne(scorePlayerOne);
    }
    /**
     * Increase the score for Player One by 5 points.
     */
    public void addFiveForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 5;
        displayForPlayerOne(scorePlayerOne);
    }
    /**
     * Increase the score for Player One by 6 points.
     */
    public void addSixForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 6;
        displayForPlayerOne(scorePlayerOne);
    }
    /**
     * Increase the score for Player Two by 1 points.
     */
    public void addOneForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 1;
        displayForPlayerTwo(scorePlayerTwo);
    }
    /**
     * Increase the score for Player Two by 2 points.
     */
    public void addTwoForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 2;
        displayForPlayerTwo(scorePlayerTwo);
    }
    /**
     * Increase the score for Player Two by 3 points.
     */
    public void addThreeForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 3;
        displayForPlayerTwo(scorePlayerTwo);
    }
    /**
     * Increase the score for Player Two by 4 points.
     */
    public void addFourForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 4;
        displayForPlayerTwo(scorePlayerTwo);
    }
    /**
     * Increase the score for Player Two by 5 points.
     */
    public void addFiveForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 5;
        displayForPlayerTwo(scorePlayerTwo);
    }
    /**
     * Increase the score for Player Two by 6 points.
     */
    public void addSixForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 6;
        displayForPlayerTwo(scorePlayerTwo);
    }
    /**
     * Reset the score.
     */
    public void resetScore(View v) {
        scorePlayerOne = 0;
        scorePlayerTwo = 0;
        displayForPlayerOne(scorePlayerOne);
        displayForPlayerTwo(scorePlayerTwo);
    }
}
