package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class if4 extends AppCompatActivity {
    TextView outp;
    EditText num1,num2;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if4);
        outp=(TextView) findViewById(R.id.outp);
        num1=(EditText) findViewById(R.id.num1);
        num2=(EditText) findViewById(R.id.num2);
        submit=(Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(num1.getText().toString());
                int n2=Integer.parseInt(num2.getText().toString());
                if(n1>n2)
                    outp.setText("Number 1");
                else if(n1<n2)
                    outp.setText("Number 2");
                else
                    outp.setText("Biased Opinion Alert");
            }
        });
    }
}