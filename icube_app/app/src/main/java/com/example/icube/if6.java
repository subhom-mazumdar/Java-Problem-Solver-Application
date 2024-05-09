package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.os.Bundle;

import org.w3c.dom.Text;

public class if6 extends AppCompatActivity {
    TextView outp;
    EditText a1,a2,a3;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if6);
        outp=(TextView) findViewById(R.id.outp);
        a1=(EditText) findViewById(R.id.a1);
        a2=(EditText) findViewById(R.id.a2);
        a3=(EditText) findViewById(R.id.a3);
        submit=(Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int an1=Integer.parseInt(a1.getText().toString());
                int an2=Integer.parseInt(a2.getText().toString());
                int an3=Integer.parseInt(a3.getText().toString());
                if(an1+an2+an3==180)
                {
                    if(an1==60 && an2==60 && an3==60)
                        outp.setText("Equilateral");
                    else if(an1!=an2 && an2!=an3 && an3!=an1)
                        outp.setText("Scalene");
                    else
                        outp.setText("Isosceles");
                }
                else
                    outp.setText("Invalid Inputs");
            }
        });
    }
}