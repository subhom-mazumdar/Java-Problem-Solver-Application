package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class bp4 extends AppCompatActivity {
    EditText vara,varb,outvara,outvarb;
    Button clr,submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bp4);
        vara=(EditText) findViewById(R.id.vara);
        varb=(EditText) findViewById(R.id.varb);
        clr=(Button) findViewById(R.id.clr);
        submit=(Button) findViewById(R.id.send);
        outvara=(EditText) findViewById(R.id.outvara);
        outvarb=(EditText) findViewById(R.id.outvarb);

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vara.setText("");
                varb.setText("");
                outvara.setText("");
                outvarb.setText("");
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(vara.getText().toString());
                int b=Integer.parseInt(varb.getText().toString());
                int c=0;
                c=a;
                a=b;
                b=c;
                outvara.setText(a);
                outvarb.setText(b);
            }
        });
    }
}