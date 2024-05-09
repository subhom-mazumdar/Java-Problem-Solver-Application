package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class l9 extends AppCompatActivity {
    Button submit;
    TextView outp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l9);
        submit=(Button) findViewById(R.id.submit);
        outp=(TextView) findViewById(R.id. outp);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outp.setText("2");
            }
        });
    }
}