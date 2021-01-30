package com.group2.codigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class Html extends AppCompatActivity {
    Button button2;
    Button htmlIntro;
    Button htmlEditor;
    Button html3;
    Button html4;
    Button html5;
    Button html6;
    Button html7;
    Button html8;
    Button html9;
    Button html10;
    Button html11;
    Button html12;
    Button html13;
    Button html14;
    Integer value;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 1;
                openTut();
            }
        });

        htmlIntro = (Button) findViewById(R.id.htmlIntro);
        htmlIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 1;
                openTut();
            }
        });

        htmlEditor = (Button) findViewById(R.id.htmlEditor);
        htmlEditor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 2;
                openTut();
            }
        });
        html3 = (Button) findViewById(R.id.html3);
        html3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 3;
                openTut();
            }
        });
        html4 = (Button) findViewById(R.id.html4);
        html4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 4;
                openTut();
            }
        });
        html5 = (Button) findViewById(R.id.html5);
        html5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 5;
                openTut();
            }
        });
        html6 = (Button) findViewById(R.id.html6);
        html6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 6;
                openTut();
            }
        });
        html7 = (Button) findViewById(R.id.html7);
        html7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 7;
                openTut();
            }
        });
        html8 = (Button) findViewById(R.id.html8);
        html8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 8;
                openTut();
            }
        });
        html9 = (Button) findViewById(R.id.html9);
        html9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 9;
                openTut();
            }
        });
        html10 = (Button) findViewById(R.id.html10);
        html10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 10;
                openTut();
            }
        });
        html11 = (Button) findViewById(R.id.html11);
        html11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 11;
                openTut();
            }
        });
        html12 = (Button) findViewById(R.id.html12);
        html12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 12;
                openTut();
            }
        });
        html13 = (Button) findViewById(R.id.html13);
        html13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 13;
                openTut();
            }
        });
        html14 = (Button) findViewById(R.id.html14);
        html14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = 14;
                openTut();
            }
        });
    }
    public void openTut(){
        Intent intent = new Intent(this, view.class);
        intent.putExtra("button_id", value);
        startActivity(intent);
    }

}