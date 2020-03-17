package com.example.chitest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button chapter1_button;

        // find the unique viewID for chapter1 button
        chapter1_button = findViewById(R.id.button);

        // setting an onClickListener that "listens" to the user event and then responds
        chapter1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, chapter1.class);
                startActivity(intent);
            }
        });
    }
}
