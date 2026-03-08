package com.example.testgitteam15_30;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        resultTextView = findViewById(R.id.textViewResult);

        Intent intent = getIntent();
        String name = intent.getStringExtra("key_name");
        String surname = intent.getStringExtra("key_surname");

        if (name != null && surname != null)
        {
            resultTextView.setText("Имя: " + name + " Фамилия: " + surname);
        } else
        {
            resultTextView.setText("Данные не получены");
        }
    }
}