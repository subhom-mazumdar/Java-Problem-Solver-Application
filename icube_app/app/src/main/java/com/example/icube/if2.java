package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class if2 extends AppCompatActivity {
    TextView cat;
    Button submit;
    EditText num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if2);
        cat=(TextView) findViewById(R.id.cat);
        submit=(Button) findViewById(R.id.submit);
        num=(EditText) findViewById(R.id.num);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int input=Integer.parseInt(num.getText().toString());
                String setout="";
                if(input%2==0)
                    setout="Even";
                else
                    setout="Odd";
                cat.setText(""+setout);
            }
        });
    }
}