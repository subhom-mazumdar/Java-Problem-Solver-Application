package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;

public class home extends AppCompatActivity {
    TextView basic,cond,loop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        basic=(TextView) findViewById(R.id.basic);
        cond=(TextView) findViewById(R.id.cond);
        loop=(TextView) findViewById(R.id.loop);
        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this, MainActivity.class));
            }
        });
        cond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this, IfElse.class));
            }
        });
        loop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this, looping.class));
            }
        });
    }
}