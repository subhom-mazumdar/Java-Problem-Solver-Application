package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    TextView bp1,bp2,bp1p1,bp4,bp5,bp6,bp7,bp8,bp9,bp10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bp1=(TextView) findViewById(R.id.bp1);
        bp2=(TextView) findViewById(R.id.bp2);
        bp1p1=(TextView) findViewById(R.id.bp3);
        bp4=(TextView) findViewById(R.id.bp4);
        bp5=(TextView) findViewById(R.id.bp5);
        bp6=(TextView) findViewById(R.id.bp6);
        bp7=(TextView) findViewById(R.id.bp7);
        bp8=(TextView) findViewById(R.id.bp8);
        bp9=(TextView) findViewById(R.id.bp9);
        bp10=(TextView) findViewById(R.id.bp10);
        bp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this,bp1.class);
                startActivity(intent1);
            }
        });
        bp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,bp2.class));
            }
        });
        bp1p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,bp1p1.class));
            }
        });
        bp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,bp4.class));
            }
        });
        bp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,bp5.class));
            }
        });
        bp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6=new Intent(MainActivity.this,bp6.class);
                startActivity(intent6);
            }
        });
        bp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7=new Intent(MainActivity.this,bp7.class);
                startActivity(intent7);
            }
        });
        bp8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8=new Intent(MainActivity.this,bp8.class);
                startActivity(intent8);
            }
        });
        bp9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9=new Intent(MainActivity.this,bp9.class);
                startActivity(intent9);
            }
        });
        bp10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10=new Intent(MainActivity.this,bp10.class);
                startActivity(intent10);
            }
        });
    }
}