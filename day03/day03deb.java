package com.example.myapplicationdeb;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);

        int result = 0;
        int a = 2;
        int b = 3;
        int c = 5;
        result = a << 2;    // result = 8
        result += b;        //result = 8 + 3 = 11
        result = (result + c) >> 1; //result = 8
        result = add(result,3);  //result = 11
        textView.setText(String.valueOf(result));
    }
    int add(int a, int b) {
        int sum = 0;
        sum = a;
        sum += b;
        return sum;
    }
}