package com.rcsoft.android_components.AutoCompleteTextViewActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.rcsoft.android_components.R;

public class AutoCompleteTextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String[] data = { "Cat", "Dog", "Mouse" };
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        autoCompleteTextView.setAdapter(new ArrayAdapter<>(this, android.R.layout.select_dialog_item, data));
        //Number of Chars to Trigger Lookup
        autoCompleteTextView.setThreshold(1);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case android.R.id.home : finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
