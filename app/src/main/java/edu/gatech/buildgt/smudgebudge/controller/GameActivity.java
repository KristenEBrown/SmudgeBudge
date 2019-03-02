package edu.gatech.buildgt.smudgebudge.controller;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import edu.gatech.buildgt.smudgebudge.R;
import edu.gatech.buildgt.smudgebudge.model.Game;

public class GameActivity extends AppCompatActivity {

    private Game game;
    private TextView scoreTextView;
    private TextView missesTextView;
    private ImageView correctImageView;
    private ImageView incorrectImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game);
        scoreTextView = findViewById(R.id.scoreTextView);
        missesTextView = findViewById(R.id.missesTextView);
        correctImageView = findViewById(R.id.correctImageView);
        incorrectImageView = findViewById(R.id.incorrectImageView);


        this.game = new Game();
        game.sendMessage();
    }

    private void endGame() {
        Intent intent = new Intent(this, EndGameActivity.class);
        intent.putExtra("score", game.getScore());
        startActivity(intent);
    }

    private void update() {
        scoreTextView.setText(String.valueOf(game.getScore()));
        missesTextView.setText(String.valueOf(game.getMisses()));
        game.setCurrentState();
        game.sendMessage();


    }

    private void displayCorrect() {
        correctImageView.setVisibility(View.VISIBLE);
        new CountDownTimer(2000, 1000) { // 5000 = 5 sec

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                correctImageView.setVisibility(View.INVISIBLE);
            }
        }.start();
    }

    private void displayIncorrect() {
        incorrectImageView.setVisibility(View.VISIBLE);
        new CountDownTimer(2000, 1000) { // 5000 = 5 sec

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                incorrectImageView.setVisibility(View.INVISIBLE);
            }
        }.start();
    }


    public void onClickBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void onClickLeftDorsal(View view) {
        if(game.getCurrentState() == 256) {
            displayCorrect();
            game.correctGuess();
            this.update();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            } else {
                displayIncorrect();
                this.update();
            }
        }
    }

    public void onClickRightDorsal(View view) {
        if(game.getCurrentState() == 1024) {
            displayCorrect();

            game.correctGuess();
            this.update();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            } else {
                displayIncorrect();
                this.update();
            }
        }
    }

    public void onClickMiddleDorsal(View view) {
        if(game.getCurrentState() == 512) {
            displayCorrect();

            game.correctGuess();
            this.update();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            } else {
                displayIncorrect();
                this.update();
            }
        }

    }

    public void onClickLeftWrist(View view) {
        if(game.getCurrentState() == 2048) {
            displayCorrect();

            game.correctGuess();
            this.update();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            } else {
                displayIncorrect();
                this.update();
            }
        }

    }

    public void onClickRightWrist(View view) {
        if(game.getCurrentState() == 4096) {
            displayCorrect();

            game.correctGuess();
            this.update();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            } else {
                displayIncorrect();
                this.update();
            }
        }
    }

    public void onClickTopPinky(View view) {
        if(game.getCurrentState() == 64) {
            displayCorrect();

            game.correctGuess();
            this.update();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            } else {
                displayIncorrect();
                this.update();
            }
        }
    }

    public void onClickBottomPinky(View view) {
        if(game.getCurrentState() == 128) {
            displayCorrect();

            game.correctGuess();
            this.update();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            } else {
                displayIncorrect();
                this.update();
            }
        }
    }

    public void onClickTopRing(View view) {
        if(game.getCurrentState() == 16) {
            displayCorrect();

            game.correctGuess();
            this.update();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            } else {
                displayIncorrect();
                this.update();
            }
        }
    }

    public void onClickBottomRing(View view) {
        if(game.getCurrentState() == 32) {
            displayCorrect();

            game.correctGuess();
            this.update();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            } else {
                displayIncorrect();
                this.update();
            }
        }
    }

    public void onClickTopMiddle(View view) {
        if(game.getCurrentState() == 4) {
            displayCorrect();

            game.correctGuess();
            this.update();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            } else {
                displayIncorrect();
                this.update();
            }
        }
    }

    public void onClickBottomMiddle(View view) {
        if(game.getCurrentState() == 8) {
            displayCorrect();

            game.correctGuess();
            this.update();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            } else {
                displayIncorrect();
                this.update();
            }
        }
    }

    public void onClickTopPointer(View view) {
        if(game.getCurrentState() == 1) {
            displayCorrect();
            game.correctGuess();
            this.update();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            } else {
                displayIncorrect();
                this.update();
            }
        }
    }

    public void onClickBottomPointer(View view) {
        if(game.getCurrentState() == 2) {
            displayCorrect();
            game.correctGuess();
            this.update();
        } else {
            if (game.incorrectGuess() >= 3) {
                this.endGame();
            } else {
                displayIncorrect();
                this.update();
            }
        }
    }
}
