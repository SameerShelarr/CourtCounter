package com.example.courtcounter;

import androidx.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {

    public int scoreTeamA = 0;

    public int scoreTeamB = 0;

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
