package com.example.testgitteam15_30;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private EditText nameText;
    private EditText surnameText;
    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = findViewById(R.id.nameText);
        surnameText = findViewById(R.id.surnameText);
        sendButton = findViewById(R.id.sendButton);

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("key_name", nameText.toString());
                intent.putExtra("key_surname", surnameText.toString());

                startActivity(intent);
            }
        });
    }
}