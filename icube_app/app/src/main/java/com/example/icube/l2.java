package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class l2 extends AppCompatActivity {
    TextView outp;
    Button submit;
    EditText num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l2);
        outp=(TextView) findViewById(R.id.outp);
        submit=(Button) findViewById(R.id.submit);
        num=(EditText) findViewById(R.id.num);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(num.getText().toString());
                int k=1;
                for(int i=1;i<=a;i++)
                {
                    k=k*i;
                }
                outp.setText(""+k);
            }
        });
    }
}