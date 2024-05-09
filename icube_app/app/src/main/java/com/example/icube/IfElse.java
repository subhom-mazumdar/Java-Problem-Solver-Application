package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.content.Intent;
import android.os.Bundle;

import org.w3c.dom.Text;

public class IfElse extends AppCompatActivity {
    TextView if1,if2,if3,if4,if5,if6,if7,if8,if9,if10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if_else);
        if1=(TextView) findViewById(R.id.if1);
        if2=(TextView) findViewById(R.id.if2);
        if3=(TextView) findViewById(R.id.if3);
        if4=(TextView) findViewById(R.id.if4);
        if5=(TextView) findViewById(R.id.if5);
        if6=(TextView) findViewById(R.id.if6);
        if7=(TextView) findViewById(R.id.if7);
        if8=(TextView) findViewById(R.id.if8);
        if9=(TextView) findViewById(R.id.if9);
        if10=(TextView) findViewById(R.id.if10);
        if1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IfElse.this,if1.class));
            }
        });
        if2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IfElse.this,if2.class));
            }
        });
        if3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IfElse.this,if3.class));
            }
        });
        if4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IfElse.this,if4.class));
            }
        });
        if5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IfElse.this,if5.class));
            }
        });
        if6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IfElse.this,if6.class));
            }
        });
        if7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IfElse.this,if7.class));
            }
        });
        if8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IfElse.this,if8.class));
            }
        });
        if9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IfElse.this,if9.class));
            }
        });
        if10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IfElse.this,if10.class));
            }
        });
    }
}