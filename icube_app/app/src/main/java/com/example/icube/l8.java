package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class l8 extends AppCompatActivity {
    TextView outp;
    Button submit;
    EditText num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l8);
        outp=(TextView) findViewById(R.id.outp);
        submit=(Button) findViewById(R.id.submit);
        num=(EditText) findViewById(R.id.num);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt=num.getText().toString();
                int sum=0;
                for(int i=1;i<txt.length();i++)
                {
                    if(txt.charAt(i)==' ')
                        sum=sum+i;
                }
                outp.setText(""+sum);
            }
        });
    }
}