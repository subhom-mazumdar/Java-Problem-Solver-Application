package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class if7 extends AppCompatActivity {
    TextView outp;
    EditText cp,sp;
    Button submit;
    public static int chk=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if7);
        outp=(TextView) findViewById(R.id.outp);
        cp=(EditText) findViewById(R.id.cp);
        sp=(EditText) findViewById(R.id.sp);
        submit=(Button) findViewById(R.id.submit);
//        public int chk = 0;
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String show="";
                int s=Integer.parseInt(sp.getText().toString());
                int c=Integer.parseInt(cp.getText().toString());
                int amt=Math.abs(s-c);
                if(s>c)
                   show="Profit of Rs."+amt;
                else
                    show="Loss of Rs."+amt;
                outp.setText(""+show);
            }
        });
    }
}