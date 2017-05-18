package com.example.manpreetsingh.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class EndActivity2 extends AppCompatActivity {

    TextView winner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end2);

        //Bundle b;
        //b = getIntent().getExtras();
        winner = (TextView) findViewById(R.id.vinner);
        winner.setText(getIntent().getStringExtra("name2") + " vant");

        Button restartBtn1 = (Button) findViewById(R.id.restartBtn1);
        restartBtn1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick (View view){
                startActivity(new Intent(EndActivity2.this, MainActivity.class));
            }
        });

        Button restartBtn2 = (Button) findViewById(R.id.restartBtn2);
        restartBtn2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick (View view){
                startActivity(new Intent(EndActivity2.this, StartActivity.class));
            }
        });

    }
}
