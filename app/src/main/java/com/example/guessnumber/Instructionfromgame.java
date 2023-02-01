package com.example.guessnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Instructionfromgame extends AppCompatActivity {
    Button start;
    Button instructions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructionfromgame);
        start = findViewById(R.id.beginGame);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(Instructionfromgame.this,Game.class);
                startActivity(startIntent);
            }
        });

        instructions = findViewById(R.id.instructions);

        instructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent instructionIntent = new Intent(Instructionfromgame.this,MainActivity.class);
                startActivity(instructionIntent);
            }
        });
    }
}