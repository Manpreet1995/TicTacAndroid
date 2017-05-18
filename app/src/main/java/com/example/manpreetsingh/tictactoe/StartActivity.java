package com.example.manpreetsingh.tictactoe;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    EditText p1;
    EditText p2;

    //Context c;

    protected EndActivity context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        p1 = (EditText) findViewById(R.id.p1name);
        p2 = (EditText) findViewById(R.id.p2name);

        Button startBtn = (Button) findViewById(R.id.startBtn);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick (View view){
                if(p1.getText().toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(), "Feltene må fylles ut", Toast.LENGTH_SHORT).show();
                }
                else if(p2.getText().toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(), "Feltene må fylles ut", Toast.LENGTH_SHORT).show();
                }
                else {
                    //startActivity(new Intent(StartActivity.this, MainActivity.class));
                    Intent i = new Intent(StartActivity.this, MainActivity.class);
                    i.putExtra("name1", p1.getText().toString());
                    i.putExtra("name2", p2.getText().toString());
                    startActivity(i);
                }
            }
        });
    }
}
