package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class l4 extends AppCompatActivity {
    EditText num;
    Button submit;
    TextView outp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l4);
        num=(EditText) findViewById(R.id.num);
        submit=(Button) findViewById(R.id.submit);
        outp=(TextView) findViewById(R.id.outp);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean chk=false;
                int a=Integer.parseInt(num.getText().toString());
                int b=a;
                int k=0;
                while(b!=0)
                {
                    int c=b%10;
                    k=(k*10)+c;
                    b=b/10;
                }
                if(a==k)
                    chk=true;
                if(chk)
                    outp.setText("Pallindrome");
                else
                    outp.setText("Not Pallindrome");
            }
        });
    }
}