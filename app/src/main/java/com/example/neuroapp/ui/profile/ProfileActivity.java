package com.example.neuroapp.ui.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.neuroapp.R;
import com.example.neuroapp.ui.dashboard.DashboardActivity;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void displayGuide(View view) {
        Intent intent = new Intent(this, AutismSupportGuide.class);
        this.startActivity(intent);
    }

    public void displayCv(View view) {
        Intent intent = new Intent(this, Cv.class);
        this.startActivity(intent);
    }

    public void goToDashboard(View view) {
        Intent intent = new Intent(this, DashboardActivity.class);
        this.startActivity(intent);
    }

}
