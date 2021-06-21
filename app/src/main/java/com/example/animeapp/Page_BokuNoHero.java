package com.example.animeapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

public class Page_BokuNoHero extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_boku_no_hero);
        Toolbar toolbarReg = (Toolbar) findViewById(R.id.toolbarReg);

        toolbarReg.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);

        toolbarReg.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page_BokuNoHero.this, ListaFragment.class);
                startActivity(intent);
                finish();
            }
        });
    }
}