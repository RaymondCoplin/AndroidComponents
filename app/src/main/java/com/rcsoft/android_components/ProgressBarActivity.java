package com.rcsoft.android_components;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class ProgressBarActivity extends AppCompatActivity implements View.OnClickListener {

    ProgressBar progressBarHorizontal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        findViewById(R.id.progressBarStartBtn).setOnClickListener(this);
        progressBarHorizontal = findViewById(R.id.progressBarHorizontal);
    }

    @Override
    public void onClick(View v) {
        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(1000);
                progressBarHorizontal.setProgress(i);
            }
        }
        catch(Exception e){

        }
    }
}
