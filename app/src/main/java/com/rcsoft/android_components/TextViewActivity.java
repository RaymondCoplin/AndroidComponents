package com.rcsoft.android_components;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TextViewActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        etMessage = findViewById(R.id.etMessage);
        findViewById(R.id.btnMessage).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(TextViewActivity.this, etMessage.getText(), Toast.LENGTH_SHORT).show();
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
