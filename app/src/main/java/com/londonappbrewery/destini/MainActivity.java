package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView storyTextView;
    private Button topButton;
    private Button bottomButton;
    private Button restartGameButton;
    private int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = (TextView) findViewById(R.id.storyTextView);
        topButton = (Button) findViewById(R.id.buttonTop);
        bottomButton = (Button) findViewById(R.id.buttonBottom);
        restartGameButton = (Button) findViewById(R.id.buttonRestartGame);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStoryIndex) {
                    case 1:
                        gameStoryOneAnswerOne();
                        break;
                    case 2:
                        gameStoryTwoAnswerOne();
                        break;
                    case 3:
                        gameStoryThreeAnswerOne();
                        break;
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStoryIndex) {
                    case 1:
                        gameStoryOneAnswerTwo();
                        break;
                    case 2:
                        gamestoryTwoAnswerTwo();
                        break;
                    case 3:
                        gameStoryThreeAnswerTwo();
                        break;
                }
            }
        });

        restartGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameStoryRestartGame();
            }
        });


    }

    // GAME STORY METHODS

    private void gameStoryOneAnswerOne() {
        storyTextView.setText(R.string.T3_Story);
        topButton.setText(R.string.T3_Ans1);
        bottomButton.setText(R.string.T3_Ans2);
        mStoryIndex = 3;
    }

    private void gameStoryOneAnswerTwo() {
        storyTextView.setText(R.string.T2_Story);
        topButton.setText(R.string.T2_Ans1);
        bottomButton.setText(R.string.T2_Ans2);
        mStoryIndex = 2;
    }

    private void gameStoryTwoAnswerOne() {
        storyTextView.setText(R.string.T3_Story);
        topButton.setText(R.string.T3_Ans1);
        bottomButton.setText(R.string.T3_Ans2);
        mStoryIndex = 3;
    }

    private void gamestoryTwoAnswerTwo() {
        storyTextView.setText(R.string.T4_End);
        topButton.setVisibility(View.GONE);
        bottomButton.setVisibility(View.GONE);
        restartGameButton.setVisibility(View.VISIBLE);
    }

    private void gameStoryThreeAnswerOne() {
        storyTextView.setText(R.string.T6_End);
        topButton.setVisibility(View.GONE);
        bottomButton.setVisibility(View.GONE);
        restartGameButton.setVisibility(View.VISIBLE);
    }

    private void gameStoryThreeAnswerTwo() {
        storyTextView.setText(R.string.T5_End);
        topButton.setVisibility(View.GONE);
        bottomButton.setVisibility(View.GONE);
        restartGameButton.setVisibility(View.VISIBLE);
    }

    private void gameStoryRestartGame() {

        mStoryIndex = 1;

        storyTextView.setText(R.string.T1_Story);
        topButton.setText(R.string.T1_Ans1);
        bottomButton.setText(R.string.T1_Ans2);

        restartGameButton.setVisibility(View.GONE);
        topButton.setVisibility(View.VISIBLE);
        bottomButton.setVisibility(View.VISIBLE);
    }
}
