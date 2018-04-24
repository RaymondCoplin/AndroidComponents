package com.rcsoft.android_components;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Date;

public class TimePickerActivity extends AppCompatActivity implements View.OnClickListener {

    private DatePicker mDatePicker;
    private TimePicker mTimePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        mTimePicker = findViewById(R.id.my_time_picker);
        mDatePicker = findViewById(R.id.my_date_picker);
        getSupportActionBar().setTitle(getIntent().getStringExtra("TITLE"));
        findViewById(R.id.my_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        StringBuilder sb = new StringBuilder();
        StringBuilder dateSb = new StringBuilder();
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            sb.append(mTimePicker.getHour());
        } else {
            //noinspection deprecation
            sb.append(mTimePicker.getCurrentHour());
        }
        sb.append(":");
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            sb.append(mTimePicker.getMinute());
        } else {
            //noinspection deprecation
            sb.append(mTimePicker.getCurrentMinute());
        }
        Toast.makeText(this, sb.toString(), Toast.LENGTH_SHORT).show();
        //Date Picker
        dateSb.append(mDatePicker.getDayOfMonth());
        dateSb.append("/");
        dateSb.append(mDatePicker.getMonth());
        dateSb.append("/");
        dateSb.append(mDatePicker.getYear());
        Toast.makeText(this, dateSb.toString(), Toast.LENGTH_SHORT).show();
    }
}
