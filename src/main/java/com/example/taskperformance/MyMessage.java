package com.example.taskperformance;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MyMessage extends AppCompatActivity {

    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_message);

        textResult = findViewById(R.id.textResult);

        String entText1 = getIntent().getStringExtra("entText1");
        String entText2 = getIntent().getStringExtra("entText2");

        if (entText1.equals(entText2)) {
            textResult.setText("SAME");
        } else {
            textResult.setText("NOT THE SAME");
        }
    }
}
