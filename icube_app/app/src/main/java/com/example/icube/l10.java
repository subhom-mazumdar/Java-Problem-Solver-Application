package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class l10 extends AppCompatActivity {
    EditText ind,pow;
    TextView outp;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l10);
        ind=(EditText) findViewById(R.id.ind);
        pow=(EditText) findViewById(R.id.pow);
        outp=(TextView) findViewById(R.id.outp);
        submit=(Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(ind.getText().toString());
                int b=Integer.parseInt(pow.getText().toString());
                int c=(int)Math.pow(a,b);
                outp.setText(""+c);
            }
        });
    }
}