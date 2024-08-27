package com.example.myapplicationidtest;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SubActivity extends AppCompatActivity {
    private TextView idTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);

        idTextView = findViewById(R.id.idTextView);

        // Get the ID from the Application class
        MyApplication app = (MyApplication) getApplicationContext();
        String id = app.getId();

        // Display the ID
        idTextView.setText(id);
    }
}