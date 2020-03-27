package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    ScoreViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewModel = ViewModelProviders.of(this).get(ScoreViewModel.class);
        displayForTeamA(mViewModel.scoreTeamA);
        displayForTeamB(mViewModel.scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreViewA = findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreViewB = findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(score));
    }

    public void addThreePointsTeamA(View view) {
        mViewModel.scoreTeamA = mViewModel.scoreTeamA + 3;
        displayForTeamA(mViewModel.scoreTeamA);
    }

    public void addTwoPointsTeamA(View view) {
        mViewModel.scoreTeamA = mViewModel.scoreTeamA + 2;
        displayForTeamA(mViewModel.scoreTeamA);
    }

    public void addOnePointTeamA(View view){
        mViewModel.scoreTeamA = mViewModel.scoreTeamA + 1;
        displayForTeamA(mViewModel.scoreTeamA);
    }

    public void addThreePointsTeamB(View view) {
        mViewModel.scoreTeamB = mViewModel.scoreTeamB + 3;
        displayForTeamB(mViewModel.scoreTeamB);
    }

    public void addTwoPointsTeamB(View view) {
        mViewModel.scoreTeamB = mViewModel.scoreTeamB + 2;
        displayForTeamB(mViewModel.scoreTeamB);
    }

    public void addOnePointTeamB(View view) {
        mViewModel.scoreTeamB = mViewModel.scoreTeamB + 1;
        displayForTeamB(mViewModel.scoreTeamB);
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
}
