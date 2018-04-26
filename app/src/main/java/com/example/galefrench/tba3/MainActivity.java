package com.example.galefrench.tba3;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

// API-V3
import com.cpjd.main.TBA;
import com.cpjd.main.CTBA;
import com.cpjd.models.other.events.EventOPR;
import com.cpjd.models.simple.SEvent;
import com.cpjd.models.simple.SMatch;
import com.cpjd.models.simple.STeam;
import com.cpjd.models.standard.Event;
import com.cpjd.models.standard.Match;
import com.cpjd.models.standard.Team;

public class MainActivity extends AppCompatActivity {
    String TAG = "MainActivity";        // This CLASS name
    String TBA_AuthToken = "xgqQi9cACRSUt4xanOto70jLPxhz4lR2Mf83e2iikyR2vhOmr1Kvg1rDBlAQcOJg";
    String teamNumber = "";
    Team[] BAteams;
    public static int BAnumTeams = 0;                       // # of teams from Blue Alliance
    public String[] teamsRed;
    public String[] teamsBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "***  TBA3 MainActivity  ****");
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitNetwork().build(); StrictMode.setThreadPolicy(policy);

        TBA.setAuthToken(TBA_AuthToken);

        final TBA tba = new TBA();
//        Team team = tba.getTeam(5414);
//        System.out.println(team);
        System.out.println("********************************************************************************** \n");
        Event event = new TBA().getEvent("2018" + "CODE");
        Team[] teams = tba.getTeams(2018,1);
        System.out.println("********************************************************************************** \n");
        EventOPR[] opr = new TBA().getOprs("2018txpa");
        for(EventOPR o : opr) System.out.println(o);
//        Log.w(TAG, " Team array size = " + teams.length);
//        System.out.println("********************************************************************************** \n");
//        System.out.println(teams);
//        System.out.println("\n \n");

    }
}
