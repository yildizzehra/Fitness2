package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnaSayfaActivity extends AppCompatActivity {

    Button btn_sabah;
    Button btn_aksam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_sayfa);

        btn_sabah=findViewById(R.id.btn_sabahogunu);
        btn_aksam=findViewById(R.id.btn_aksamogunu);

        btn_sabah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AnaSayfaActivity.this, SabahActivity.class));
            }
        });
        btn_aksam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AnaSayfaActivity.this, AksamActivity.class));
            }
        });

    }
}