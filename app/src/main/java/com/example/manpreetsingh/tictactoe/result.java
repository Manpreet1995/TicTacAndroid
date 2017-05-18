package com.example.manpreetsingh.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class result extends AppCompatActivity {

    Button menuBtn;
    Button mainBtn;

    TextView result;

    //ArrayList<String> names = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        menuBtn = (Button) findViewById(R.id.menubtn);
        mainBtn = (Button) findViewById(R.id.mainactbtn);
        result = (TextView) findViewById(R.id.result);

        result.setText(getIntent().getStringExtra("name1") + ": " + getIntent().getStringExtra("p1wins"));


        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(result.this, StartActivity.class));
            }
        });

        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(result.this, MainActivity.class);
                //i.putExtra("name1", p1.getText().toString());
                //i.putExtra("name2", p2.getText().toString());
                startActivity(i);            }
        });
    }
}