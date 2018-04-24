package com.rcsoft.android_components;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity implements View.OnClickListener {

    private ToggleButton toggleButton;
    private Switch switchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
        toggleButton = findViewById(R.id.toggleButton);
        switchButton = findViewById(R.id.switchButton);
        toggleButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switchButton.setChecked(toggleButton.isChecked());
        Toast.makeText(this,
                                toggleButton.isChecked() ? toggleButton.getTextOn() : toggleButton.getTextOff(),
                                Toast.LENGTH_SHORT).show();
    }
}
