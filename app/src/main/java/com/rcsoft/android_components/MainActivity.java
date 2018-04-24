package com.rcsoft.android_components;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.rcsoft.android_components.AutoCompleteTextViewActivity.AutoCompleteTextViewActivity;

public class MainActivity extends AppCompatActivity  {

    private EditText etMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void goActivity(android.view.View view) {

        int layoutId = 0;
        Intent intent = new android.content.Intent(MainActivity.this, LayoutActivity.class);

        switch(view.getId()){
            case (R.id.textViewBtn):
                intent = new android.content.Intent(MainActivity.this, TextViewActivity.class);
                layoutId = R.layout.activity_text_view;
                break;
            case (R.id.autoCompleteTextViewBtn):
                intent = new android.content.Intent(MainActivity.this, AutoCompleteTextViewActivity.class);
                layoutId = R.layout.activity_auto_complete_text_view;
                break;
            case (R.id.alertDialogBtn):
                intent = new android.content.Intent(MainActivity.this, AlertDialogActivity.class);
                layoutId = R.layout.activity_alert_dialog;
                break;
            case (R.id.checkBoxBtn):
                intent = new android.content.Intent(MainActivity.this, CheckBoxActivity.class);
                layoutId = R.layout.activity_check_box;
                break;
            case (R.id.toggleBtn):
                intent = new android.content.Intent(MainActivity.this, ToggleButtonActivity.class);
                layoutId = R.layout.activity_check_box;
                break;
            case (R.id.radioGroupBtn):
                intent = new android.content.Intent(MainActivity.this, RadioButtonActivity.class);
                layoutId = R.layout.activity_radio_button;
                break;
            case (R.id.progressBarBtn):
                intent = new android.content.Intent(MainActivity.this, ProgressBarActivity.class);
                layoutId = R.layout.activity_radio_button;
                break;
            case (R.id.spinnerBtn):
                intent = new android.content.Intent(MainActivity.this, SpinnerActivity.class);
                layoutId = R.layout.activity_spinner;
                break;
            case (R.id.timePickerBtn):
                intent = new android.content.Intent(MainActivity.this, TimePickerActivity.class);
                intent.putExtra("TITLE", "Date Picker & Time Picker");
                layoutId = R.layout.activity_time_picker;
                break;
            case (R.id.dateTimePickerDialogBtn):
                intent = new android.content.Intent(MainActivity.this, DateTimePickerActivity.class);
                intent.putExtra("TITLE", "Date Picker & Time Picker Dialog");
                layoutId = R.layout.activity_time_picker;
                break;
            default:
                layoutId = R.layout.activity_not_found;
        }

        intent.putExtra("layout", layoutId);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
}
