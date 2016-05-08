package com.widiarifki.courtcounter;

import android.content.res.Configuration;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointTeamA;
    int pointTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pointTeamA = pointTeamB = 0;
    }

    public void addPointTeamA(View v){
        int addpoint = Integer.parseInt(v.getTag().toString());
        addPoint("A", addpoint);
        displayPoint((TextView) findViewById(R.id.score_team_a), pointTeamA);
    }

    public void addPointTeamB(View v){
        int addpoint = Integer.parseInt(v.getTag().toString());
        addPoint("B", addpoint);
        displayPoint((TextView) findViewById(R.id.score_team_b), pointTeamB);
    }

    public void addPoint(String team, int addpoint){
        switch (team){
            case "A":
                pointTeamA += addpoint;
                break;
            case "B":
                pointTeamB += addpoint;
                break;
        }
    }

    public void displayPoint(TextView scoreView, int point){
        scoreView.setText(""+point);
    }

    public void resetPoint(View v){
        pointTeamA = pointTeamB = 0;
        displayPoint((TextView) findViewById(R.id.score_team_a), pointTeamA);
        displayPoint((TextView) findViewById(R.id.score_team_b), pointTeamB);
    }

}
