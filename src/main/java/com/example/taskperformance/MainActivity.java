package com.example.taskperformance;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private Button buttonSwap, buttonCompare;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        buttonSwap = findViewById(R.id.btnSwap);
        buttonCompare = findViewById(R.id.btnCheck);

        buttonSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swapTexts();
            }
        });

        buttonCompare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compareTexts();
            }
        });
    }

    private void swapTexts() {
        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();

        editText1.setText(text2);
        editText2.setText(text1);
    }

    private void compareTexts() {
        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();

        Intent intent = new Intent(MainActivity.this, MyMessage.class);
        intent.putExtra("text1", text1);
        intent.putExtra("text2", text2);
        startActivity(intent);
    }
}

