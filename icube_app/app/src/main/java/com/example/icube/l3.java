package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class l3 extends AppCompatActivity {
    TextView outp;
    Button submit;
    EditText num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l3);
        outp=(TextView) findViewById(R.id.outp);
        submit=(Button) findViewById(R.id.submit);
        num=(EditText) findViewById(R.id.num);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(num.getText().toString());
                int rev=0;
                while(a!=0)
                {
                    int c=a%10;
                    rev=(rev*10)+c;
                    a=a/10;
                }
                outp.setText(""+rev);
            }
        });
    }
}