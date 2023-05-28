package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AksamActivity extends AppCompatActivity {

    Button btn_menu1aksam;
    Button btn_menu2aksam;
    Button btn_menu3aksam;
    Button btn_menu4aksam;
    Button btn_menu5aksam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aksam);

        btn_menu1aksam=findViewById(R.id.btn_menuaksam1);

        btn_menu1aksam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AksamActivity.this, MenuAksam1Activity.class));
            }
        });

        btn_menu2aksam=findViewById(R.id.menuaksam2);

        btn_menu2aksam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AksamActivity.this, MenuAksam2Activity.class));
            }
        });

        btn_menu3aksam=findViewById(R.id.menuaksam3);

        btn_menu3aksam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AksamActivity.this, MenuAksam3Activity.class));
            }
        });

        btn_menu4aksam=findViewById(R.id.menuaksam4);

        btn_menu4aksam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AksamActivity.this, MenuAksam4Activity.class));
            }
        });

        btn_menu5aksam=findViewById(R.id.menuaksam5);

        btn_menu5aksam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AksamActivity.this, MenuAksam5Activity.class));
            }
        });
    }
}