package com.rcsoft.android_components;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateTimePickerActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mDateDisplay, mTimeDisplay, mDateTimeDisplay;
    private DatePickerDialog mDatePicker;
    private TimePickerDialog mTimePicker;
    private Calendar mCalendar;
    private SimpleDateFormat mDateFormat, mTimeFormat, mDateTimeFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time_picker);
        getSupportActionBar().setTitle(getIntent().getStringExtra("TITLE"));

        findViewById(R.id.date_pick).setOnClickListener(this);
        findViewById(R.id.time_pick).setOnClickListener(this);
        mDateDisplay = findViewById(R.id.date_display);
        mTimeDisplay = findViewById(R.id.time_display);
        mDateTimeDisplay = findViewById(R.id.date_time_display);

        mCalendar = Calendar.getInstance();
        mDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        mTimeFormat = new SimpleDateFormat("hh:mm", Locale.getDefault());
        mDateTimeFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm a", Locale.getDefault());

        mDatePicker = new DatePickerDialog(this, mDatePickerListener,
                mCalendar.get(Calendar.YEAR),
                mCalendar.get(Calendar.MONTH),
                mCalendar.get(Calendar.DATE));

        mTimePicker = new TimePickerDialog(this, mTimePickerListener,
                mCalendar.get(Calendar.HOUR_OF_DAY),
                mCalendar.get(Calendar.MINUTE),
                false);
    }

    private TimePickerDialog.OnTimeSetListener mTimePickerListener = new TimePickerDialog.OnTimeSetListener(){

        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            mCalendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
            mCalendar.set(Calendar.MINUTE, minute);
            refreshDisplays();
        }
    };

    private DatePickerDialog.OnDateSetListener mDatePickerListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            mCalendar.set(Calendar.YEAR, year);
            mCalendar.set(Calendar.MONTH, month);
            mCalendar.set(Calendar.DATE, dayOfMonth);
            refreshDisplays();
        }
    };

    private void refreshDisplays() {
        mDateDisplay.setText(mDateFormat.format(mCalendar.getTime()));
        mTimeDisplay.setText(mTimeFormat.format(mCalendar.getTime()));
        mDateTimeDisplay.setText(mDateTimeFormat.format(mCalendar.getTime()));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.date_pick:
                mDatePicker.show();
                break;
            case R.id.time_pick:
                mTimePicker.show();
                break;
        }
    }
}
