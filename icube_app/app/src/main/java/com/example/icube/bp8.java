package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class bp8 extends AppCompatActivity {
    TextView ascii;
    EditText c;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bp8);
        ascii=(TextView) findViewById(R.id.ascii);
        c=(EditText) findViewById(R.id.c);
        submit=(Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=c.getText().toString();
                int asc=0;
                char oper;
                if(a.length()>1)
                    ascii.setText("Invalid Input found");
                else
                {
                    oper=a.charAt(0);
                    asc=(int)oper;
                    ascii.setText(""+asc);
                }
            }
        });
    }
}