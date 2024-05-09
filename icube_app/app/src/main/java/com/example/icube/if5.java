package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class if5 extends AppCompatActivity {
    TextView outp;
    EditText num;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if5);
        outp =(TextView) findViewById(R.id.outp);
        num=(EditText) findViewById(R.id.num);
        submit=(Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n=Integer.parseInt(num.getText().toString());
                if(n%10==7 && n%7==0)
                    outp.setText("Yes");
                else
                    outp.setText("No");
            }
        });
    }
}