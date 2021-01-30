package com.group2.codigo;

import android.app.ActivityOptions;
import android.content.Intent;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton html;
    ImageButton css;
    ImageButton php;
    ImageButton mysql;

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        html = (ImageButton) findViewById(R.id.html);
        html.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Html.class);
                Pair pair = new Pair<View, String>(html, "HTML");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, pair);
                startActivity(intent, options.toBundle());
            }
        });

        css = (ImageButton) findViewById(R.id.css);
        css.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });

        php = (ImageButton) findViewById(R.id.php);
        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });

        mysql = (ImageButton) findViewById(R.id.mysql);
        mysql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });

    }
    public void openNewActivity(){
        int value = 404;
        Intent intent = new Intent(this, view.class);
        intent.putExtra("button_id", value);
        startActivity(intent);
    }
}