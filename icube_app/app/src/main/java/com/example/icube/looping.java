package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.os.Bundle;
import android.content.Intent;
public class looping extends AppCompatActivity {
    TextView l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_looping);
        l1=(TextView) findViewById(R.id.l1);
        l2=(TextView) findViewById(R.id.l2);
        l3=(TextView) findViewById(R.id.l3);
        l4=(TextView) findViewById(R.id.l4);
        l5=(TextView) findViewById(R.id.l5);
        l6=(TextView) findViewById(R.id.l6);
        l7=(TextView) findViewById(R.id.l7);
        l8=(TextView) findViewById(R.id.l8);
        l9=(TextView) findViewById(R.id.l9);
        l10=(TextView) findViewById(R.id.l10);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(looping.this,l1.class));
            }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(looping.this,l2.class));
            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(looping.this,l3.class));
            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(looping.this,l4.class));
            }
        });
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(looping.this,l5.class));
            }
        });
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(looping.this,l6.class));
            }
        });
        l7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(looping.this,l7.class));
            }
        });
        l8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(looping.this,l8.class));
            }
        });
        l9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(looping.this,l9.class));
            }
        });
        l10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(looping.this,l10.class));
            }
        });
    }
}