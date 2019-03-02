package edu.gatech.buildgt.smudgebudge.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import edu.gatech.buildgt.smudgebudge.R;
import edu.gatech.buildgt.smudgebudge.model.Game;

public class GameActivity extends AppCompatActivity {

    private Game game;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        game = new Game();
    }

    public void onClickBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
    }
}
