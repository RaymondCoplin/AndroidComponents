package com.rcsoft.android_components;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
    }

    public void validate(View v){
        RadioGroup rg = findViewById(R.id.rgs);
        int count = rg.getChildCount();

        for (int i=0; i<count; i++){
            View viewGroup = rg.getChildAt(i);
            if(viewGroup instanceof ViewGroup) {
                for (int j = 0; j < ((ViewGroup) viewGroup).getChildCount(); j++) {
                    View view = ((ViewGroup) viewGroup).getChildAt(j);
                    if(view instanceof RadioButton) {
                        if (v.getId() != view.getId()) {
                            ((RadioButton) view).setChecked(false);
                        }
                    }
                }
            }
        }
    }
}
