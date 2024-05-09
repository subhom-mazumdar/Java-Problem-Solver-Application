package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class l5 extends AppCompatActivity {
    TextView outp;
    Button submit;
    EditText num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l5);
        outp=(TextView) findViewById(R.id.outp);
        submit=(Button) findViewById(R.id.submit);
        num=(EditText) findViewById(R.id.num);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(num.getText().toString());
                int prod=1,sum=0;
                while(a!=0)
                {
                    int c=a%10;
                    prod=prod*c;
                    sum=sum+c;
                    a=a/10;
                }
                if(prod==sum)
                    outp.setText("Spy Number");
                else
                    outp.setText("Not a spy number");
            }
        });
    }
}