package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class bp5 extends AppCompatActivity {
    EditText len,width,area,perimeter;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bp5);
        len=(EditText) findViewById(R.id.len);
        width=(EditText) findViewById(R.id.width);
        area=(EditText) findViewById(R.id.area);
        perimeter=(EditText) findViewById(R.id.perimeter);
        send=(Button) findViewById(R.id.submit);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(len.getText().toString());
                int b=Integer.parseInt(width.getText().toString());
                area.setText(a*b);
                perimeter.setText(2*(a+b));
            }
        });
    }
}