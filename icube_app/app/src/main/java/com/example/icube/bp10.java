package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class bp10 extends AppCompatActivity {
    EditText p,r,t;
    TextView si;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bp10);
        p=(EditText) findViewById(R.id.p);
        r=(EditText) findViewById(R.id.r);
        t=(EditText) findViewById(R.id.t);
        si=(TextView) findViewById(R.id.si);
        submit=(Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int P=Integer.parseInt(p.getText().toString());
                int R=Integer.parseInt(r.getText().toString());
                int T=Integer.parseInt(t.getText().toString());
                int SI=(P*R*T)/100;
                si.setText("Rs. "+SI);
            }
        });
    }
}