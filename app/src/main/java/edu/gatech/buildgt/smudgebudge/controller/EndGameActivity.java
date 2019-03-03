package edu.gatech.buildgt.smudgebudge.controller;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import edu.gatech.buildgt.smudgebudge.R;

public class EndGameActivity extends AppCompatActivity {

    private TextView scoreTextView;
    private ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_game);

        scoreTextView = findViewById(R.id.scoreTextView);
        layout = findViewById(R.id.endGameLayout);

        Intent extrasIntent = getIntent();
        Bundle extras = extrasIntent.getExtras();
        int score = extras.getInt("score");
        scoreTextView.setText(String.valueOf(score));

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
