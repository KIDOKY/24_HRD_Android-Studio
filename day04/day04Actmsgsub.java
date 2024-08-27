package com.example.myapplicationactmsg;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);

        TextView textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();    // 전달된 데이터를 수신한다.
        String msg = intent.getStringExtra(MainActivity.TAG_MSG);    // 데이터 추출
        textView.setText(msg);
    }
}