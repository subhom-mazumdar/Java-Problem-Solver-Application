package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class l1 extends AppCompatActivity {
    EditText num;
    TextView outp;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l1);
        num=(EditText) findViewById(R.id.num);
        outp=(TextView) findViewById(R.id.outp);
        submit=(Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(num.getText().toString());
                String uno="";
                for(int i=1;i<=a;i++)
                {
                    if(a%i==0)
                    {
                        uno=uno+i+" ";
                        outp.setText(""+uno);
                    }
                }
            }
        });
    }
}