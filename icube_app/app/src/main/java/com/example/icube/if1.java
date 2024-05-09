package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class if1 extends AppCompatActivity {
    EditText num;
    TextView cat;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.if1);
        num=(EditText) findViewById(R.id.num);
        cat=(TextView) findViewById(R.id.cat);
        submit=(Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Num=Integer.parseInt(num.getText().toString());
                if(Num>0)
                    cat.setText("Positive");
                else if(Num<0)
                    cat.setText("Negative");
                else
                    cat.setText("Zero");
            }
        });
    }
}