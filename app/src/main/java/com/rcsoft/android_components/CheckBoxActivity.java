package com.rcsoft.android_components;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox ckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        ckBox = findViewById(R.id.ckBox);
        findViewById(R.id.ckBox).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, ckBox.isChecked() ? "Checked" : "Not Checked", Toast.LENGTH_SHORT).show();
    }
}
