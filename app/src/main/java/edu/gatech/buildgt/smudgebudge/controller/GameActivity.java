package edu.gatech.buildgt.smudgebudge.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import edu.gatech.buildgt.smudgebudge.R;
import edu.gatech.buildgt.smudgebudge.model.Game;

public class GameActivity extends AppCompatActivity {

    private Game game;
    private TextView scoreTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        scoreTextView = findViewById(R.id.scoreTextView);

        this.game = new Game();
    }

    private void endGame() {

    }

    private void update() {
        scoreTextView.setText("Score: " + game.getScore());
        //TODO: UPDATE THE NUMBER OF MISSES

    }

    public void onClickBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickLeftDorsal(View view) {
        if(game.getCurrentState() == 256) {
            game.correctGuess();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            }
        }
        this.update();
    }

    public void onClickRightDorsal(View view) {
        if(game.getCurrentState() == 1024) {
            game.correctGuess();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            }
        }
        this.update();
    }

    public void onClickMiddleDorsal(View view) {
        if(game.getCurrentState() == 512) {
            game.correctGuess();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            }
        }
        this.update();
    }

    public void onClickLeftWrist(View view) {
        if(game.getCurrentState() == 2048) {
            game.correctGuess();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            }
        }
        this.update();
    }

    public void onClickRightWrist(View view) {
        if(game.getCurrentState() == 4096) {
            game.correctGuess();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            }
        }
        this.update();
    }

    public void onClickTopPinky(View view) {
        if(game.getCurrentState() == 64) {
            game.correctGuess();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            }
        }
        this.update();
    }

    public void onClickBottomPinky(View view) {
        if(game.getCurrentState() == 128) {
            game.correctGuess();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            }
        }
        this.update();
    }

    public void onClickTopRing(View view) {
        if(game.getCurrentState() == 16) {
            game.correctGuess();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            }
        }
        this.update();
    }

    public void onClickBottomRing(View view) {
        if(game.getCurrentState() == 32) {
            game.correctGuess();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            }
        }
        this.update();
    }
    public void onClickTopMiddle(View view) {
        if(game.getCurrentState() == 4) {
            game.correctGuess();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            }
        }
        this.update();
    }

    public void onClickBottomMiddle(View view) {
        if(game.getCurrentState() == 8) {
            game.correctGuess();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            }
        }
        this.update();
    }

    public void onClickTopPointer(View view) {
        if(game.getCurrentState() == 1) {
            game.correctGuess();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            }
        }
        this.update();
    }

    public void onClickBottomPointer(View view) {
        if(game.getCurrentState() == 2) {
            game.correctGuess();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            }
        }
        this.update();
    }
}
