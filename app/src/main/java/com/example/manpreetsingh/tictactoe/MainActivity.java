package com.example.manpreetsingh.tictactoe;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
    //SharedPreferences.Editor editor = sharedPreferences.edit();

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;

    Button resultBtn;
    Button menuBtn;

    String nam1;
    String nam2;

    int tur;

    int p1Win;
    int p2Win;

    TextView Turn;
    /*TextView win1;
    TextView win2;
    TextView p1;
    TextView p2;*/

    boolean gameOver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nam1 = getIntent().getStringExtra("name1");
        nam2 = getIntent().getStringExtra("name2");

        tur = 1;

        p1Win = 0;
        p2Win = 0;

        gameOver = false;

        Turn = (TextView) findViewById(R.id.tur);
        /*win1 = (TextView) findViewById(R.id.p1wins);
        win2 = (TextView) findViewById(R.id.p2wins);
        p2 = (TextView) findViewById(R.id.p2);
        p1 = (TextView) findViewById(R.id.p1);*/

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        resultBtn = (Button) findViewById(R.id.resultbtn);
        menuBtn = (Button) findViewById(R.id.menubtn);

        Turn.setText("Tur: " + nam1);
        //win1.setText(nam1 + "   " + p1Win);
        //win2.setText(nam2 + "   " + p2Win);

        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, StartActivity.class));
            }
        });

        resultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this, result.class));
                Intent intent = new Intent(MainActivity.this, result.class);
                intent.putExtra("name1", nam1);
                intent.putExtra("name2", nam2);
                intent.putExtra("p1wins", Integer.toString(p1Win));
                System.out.print(p1Win);
                intent.putExtra("p2wins", p2Win);
                startActivity(intent);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn1.getText().toString().equals("")) {
                    if (tur == 1) {
                        tur = 2;
                        Turn.setText("Tur: " + nam2);
                        btn1.setText("X");
                    } else if (tur == 2) {
                        tur = 1;
                        Turn.setText("Tur: " + nam1);
                        btn1.setText("O");
                    }
                }
                finish();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn2.getText().toString().equals("")) {
                    if (tur == 1) {
                        tur = 2;
                        Turn.setText("Tur: " + nam2);
                        btn2.setText("X");
                    } else if (tur == 2) {
                        tur = 1;
                        Turn.setText("Tur: " + nam1);
                        btn2.setText("O");
                    }
                }
                finish();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn3.getText().toString().equals("")) {
                    if (tur == 1) {
                        tur = 2;
                        Turn.setText("Tur: " + nam2);
                        btn3.setText("X");
                    } else if (tur == 2) {
                        tur = 1;
                        Turn.setText("Tur: " + nam1);
                        btn3.setText("O");
                    }
                }
                finish();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn4.getText().toString().equals("")) {
                    if (tur == 1) {
                        tur = 2;
                        Turn.setText("Tur: " + nam2);
                        btn4.setText("X");
                    } else if (tur == 2) {
                        tur = 1;
                        Turn.setText("Tur: " + nam1);
                        btn4.setText("O");
                    }
                }
                finish();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn5.getText().toString().equals("")) {
                    if (tur == 1) {
                        tur = 2;
                        Turn.setText("Tur: " + nam2);
                        btn5.setText("X");
                    } else if (tur == 2) {
                        tur = 1;
                        Turn.setText("Tur: " + nam1);
                        btn5.setText("O");
                    }
                }
                finish();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn6.getText().toString().equals("")) {
                    if (tur == 1) {
                        tur = 2;
                        Turn.setText("Tur: " + nam2);
                        btn6.setText("X");
                    } else if (tur == 2) {
                        tur = 1;
                        Turn.setText("Tur: " + nam1);
                        btn6.setText("O");
                    }
                }
                finish();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn7.getText().toString().equals("")) {
                    if (tur == 1) {
                        tur = 2;
                        Turn.setText("Tur: " + nam2);
                        btn7.setText("X");
                    } else if (tur == 2) {
                        tur = 1;
                        Turn.setText("Tur: " + nam1);
                        btn7.setText("O");
                    }
                }
                finish();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn8.getText().toString().equals("")) {
                    if (tur == 1) {
                        tur = 2;
                        Turn.setText("Tur: " + nam2);
                        btn8.setText("X");
                    } else if (tur == 2) {
                        tur = 1;
                        Turn.setText("Tur: " + nam1);
                        btn8.setText("O");
                    }
                }
                finish();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn9.getText().toString().equals("")) {
                    if (tur == 1) {
                        tur = 2;
                        Turn.setText("Tur: " + nam2);
                        btn9.setText("X");
                    } else if (tur == 2) {
                        tur = 1;
                        Turn.setText("Tur: " + nam1);
                        btn9.setText("O");
                    }
                }
                finish();
            }
        });
    }

    public void clear(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
    }
    public void finish(){

        String a;
        String b;
        String c;
        String d;
        String e;
        String f;
        String g;
        String h;
        String i;

        a = btn1.getText().toString();
        b = btn2.getText().toString();
        c = btn3.getText().toString();
        d = btn4.getText().toString();
        e = btn5.getText().toString();
        f = btn6.getText().toString();
        g = btn7.getText().toString();
        h = btn8.getText().toString();
        i = btn9.getText().toString();

        //StartActivity start = new StartActivity();

        if(a.equals(b) && a.equals(c) && a.equals("X") ){
            //startActivity(new Intent(MainActivity.this, EndActivity.class));
            /*Intent intent = new Intent(MainActivity.this, EndActivity.class);
            intent.putExtra("name1", nam1);
            intent.putExtra("name2", nam2);
            startActivity(intent);*/
            p1Win = p1Win + 1;
            clear();
        }
        if(a.equals(e) && a.equals(i) && a.equals("X") ){
            p1Win = p1Win + 1;
            clear();
        }
        if(a.equals(d) && a.equals(g) && a.equals("X") ){
            p1Win = p1Win + 1;
            clear();
        }
        if(b.equals(e) && b.equals(h) && b.equals("X") ){
            p1Win = p1Win + 1;
            clear();
        }
        if(c.equals(e) && c.equals(g) && c.equals("X") ){
            p1Win = p1Win + 1;
            clear();
        }
        if(c.equals(f) && c.equals(i) && c.equals("X") ){
            p1Win = p1Win + 1;
            clear();
        }
        if(d.equals(e) && d.equals(f) && d.equals("X") ){
            p1Win = p1Win + 1;
            clear();
        }
        if(g.equals(h) && g.equals(i) && g.equals("X") ){
            p1Win = p1Win + 1;
            clear();
        }
        if(a.equals(b) && a.equals(c) && a.equals("O") ){
            p2Win = p2Win + 1;
            clear();
        }
        if(a.equals(e) && a.equals(i) && a.equals("O") ){
            p2Win = p2Win + 1;
            clear();
        }
        if(a.equals(d) && a.equals(g) && a.equals("O") ){
            p2Win = p2Win + 1;
            clear();
        }
        if(b.equals(e) && b.equals(h) && b.equals("O") ){
            p2Win = p2Win + 1;
            clear();
        }
        if(c.equals(e) && c.equals(g) && c.equals("O") ){
            p2Win = p2Win + 1;
            clear();
        }
        if(c.equals(f) && c.equals(i) && c.equals("O") ){
            p2Win = p2Win + 1;
            clear();
        }
        if(d.equals(e) && d.equals(f) && d.equals("O") ){
            p2Win = p2Win + 1;
            clear();
        }
        if(g.equals(h) && g.equals(i) && g.equals("O") ){
            p2Win = p2Win + 1;
            clear();
        }

        if(btn1.getText() != ""){
            if (btn2.getText() !=""){
                if (btn3.getText() !=""){
                    if (btn4.getText() !=""){
                        if (btn5.getText() !=""){
                            if (btn6.getText() !=""){
                                if (btn7.getText() !=""){
                                    if (btn8.getText() !=""){
                                        if (btn9.getText() !=""){
                                            clear();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

       // win1.setText(p1Win);
       // win2.setText(p2Win);

        /*if(p1Win > p2Win){
            win1.setText(nam1 + "               " + p1Win);
            win2.setText(nam2 + "               " + p2Win);
        }
        else if(p1Win < p2Win){
            win1.setText(nam2 + "               " + p2Win);
            win2.setText(nam1 + "               " + p1Win);
        }*/
    }
}
