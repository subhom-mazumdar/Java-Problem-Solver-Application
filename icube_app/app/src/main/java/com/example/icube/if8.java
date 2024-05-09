package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class if8 extends AppCompatActivity {
    TextView outp;
    EditText ch;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if8);
        outp=(TextView) findViewById(R.id.outp);
        ch=(EditText) findViewById(R.id.ch);
        submit=(Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char c=Character.toUpperCase(ch.getText().toString().charAt(0));
                if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                    outp.setText("Vowel");
                else
                    outp.setText("Consonant");
            }
        });
    }
}