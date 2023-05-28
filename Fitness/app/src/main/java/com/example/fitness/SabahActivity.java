package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SabahActivity extends AppCompatActivity {

    Button btn_menu1;
    Button btn_menu2;
    Button btn_menu3;
    Button btn_menu4;
    Button btn_menu5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabah);

        btn_menu1=findViewById(R.id.btn_menuu1);

        btn_menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SabahActivity.this, Menu1Activity.class));
            }
        });

        btn_menu2=findViewById(R.id.menuu2);

        btn_menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SabahActivity.this, Menu2Activity.class));
            }
        });


        btn_menu3=findViewById(R.id.menuu3);

        btn_menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SabahActivity.this, Menu3Activity.class));
            }
        });

        btn_menu4=findViewById(R.id.menuu4);

        btn_menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SabahActivity.this, Menu4Activity.class));
            }
        });

        btn_menu5=findViewById(R.id.menuu5);

        btn_menu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SabahActivity.this, Menu5Activity.class));
            }
        });




    }
}