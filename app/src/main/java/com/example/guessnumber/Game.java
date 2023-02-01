package com.example.guessnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Random;
import android.widget.Toast;

public class Game extends AppCompatActivity {
    Button instructions;
    Random rand = new Random();

    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int max = 11;
        result = rand.nextInt(max);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        instructions = findViewById(R.id.instructions);

        instructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent instructionIntent = new Intent(Game.this,Instructionfromgame.class);
                startActivity(instructionIntent);
            }
        });


    }

    public void makeToast(String str)
    {
        Toast.makeText(Game.this,str, Toast.LENGTH_LONG).show();
    }

    public void clickFunction(View view)
    {
        int userGuessing;

        EditText variable = findViewById(R.id.editId);
        userGuessing = Integer.parseInt(variable.getText().toString());
        if (userGuessing <= result - 2) {

            makeToast("Hint: The number is higher");
        }
        else if (userGuessing >= result +2) {
            makeToast("Hint: The number is lower");
        }
        else if (userGuessing == result +1) {
            makeToast("Hint: Almost There! Just a little higher");
        }
        else if (userGuessing == result -1) {
            makeToast("Hint: Almost There! Just a little lower");
        }
        else {
            makeToast("Congratulations!");
        }
    }


}