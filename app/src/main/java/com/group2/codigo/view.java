package com.group2.codigo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class view extends AppCompatActivity implements View.OnClickListener{

FloatingActionButton btnNext;
FloatingActionButton btnPrev;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        btnNext = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        btnPrev = (FloatingActionButton) findViewById(R.id.floatingActionButton1);
        btnNext.setOnClickListener(this);
        btnPrev.setOnClickListener(this);

        Intent mint = getIntent();
        Integer value = mint.getIntExtra("button_id", 0);
        WebView webView = findViewById(R.id.show);
        webView.setPadding(0, 0, 0, 0);
        switch (value) {
            case 1:
                btnPrev.setVisibility(View.GONE);
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlIntro.html");
                break;
            case 2:
                btnPrev.setVisibility(View.VISIBLE);
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlEditor.html");
                break;
            case 3:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlBasic.html");
                break;
            case 4:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlElem.html");
                break;
            case 5:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlAttrib.html");
                break;
            case 6:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlHeader.html");
                break;
            case 7:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlPara.html");
                break;
            case 8:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlStyles.html");
                break;
            case 9:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlFormat.html");
                break;
            case 10:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlQout.html");
                break;
            case 11:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlComment.html");
                break;
            case 12:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlColor.html");
                break;
            case 13:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlCss.html");
                break;
            case 14:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlLink.html");
                btnNext.setVisibility(View.VISIBLE);
                break;
            case 15:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlImage.html");
                btnNext.setVisibility(View.GONE);
                break;
            case 404:
                webView.loadUrl("file:///android_asset/err404.html");
                btnPrev.setVisibility(View.GONE);
                btnNext.setVisibility(View.GONE);
                break;
            default:
                webView.loadUrl("file:///android_asset/error.html");
                break;
        }

    }
    int x = 0;
    @Override
    public void onClick(View v) {
        int y = 0;
        Intent mint1 = getIntent();
        Integer value1 = mint1.getIntExtra("button_id", 0);
        WebView webView = findViewById(R.id.show);
        webView.setPadding(0, 0, 0, 0);
        switch (v.getId()){
            case R.id.floatingActionButton:
                x++;
                y = value1 + x;
                break;
            case R.id.floatingActionButton1:
                x--;
                y = value1 + x;
                break;
        }
        switch (y) {
            case 1:
                btnPrev.setVisibility(View.GONE);
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlIntro.html");
                break;
            case 2:
                btnPrev.setVisibility(View.VISIBLE);
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlEditor.html");
                break;
            case 3:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlBasic.html");
                break;
            case 4:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlElem.html");
                break;
            case 5:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlAttrib.html");
                break;
            case 6:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlHeader.html");
                break;
            case 7:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlPara.html");
                break;
            case 8:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlStyles.html");
                break;
            case 9:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlFormat.html");
                break;
            case 10:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlQout.html");
                break;
            case 11:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlComment.html");
                break;
            case 12:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlColor.html");
                break;
            case 13:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlCss.html");
                break;
            case 14:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlLink.html");
                btnNext.setVisibility(View.VISIBLE);
                break;
            case 15:
                webView.loadUrl("file:///android_asset/html/htmlTutorial/htmlImage.html");
                btnNext.setVisibility(View.GONE);
                break;
            default:
                webView.loadUrl("file:///android_asset/error.html");
                break;
        }

    }
}