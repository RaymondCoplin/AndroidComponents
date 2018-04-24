package com.rcsoft.android_components;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class LayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        int layoutId = getIntent().getIntExtra("layout", R.layout.activity_not_found);
        setContentView(layoutId);
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
