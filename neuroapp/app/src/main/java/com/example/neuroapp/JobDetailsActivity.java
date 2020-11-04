package com.example.neuroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class JobDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_details);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        Integer message = intent.getIntExtra(DashboardActivity.EXTRA_MESSAGE, -1);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView2);
        textView.setText(message.toString());
    }
}