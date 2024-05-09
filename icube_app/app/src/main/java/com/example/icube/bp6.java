package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;
import java.math.*;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class bp6 extends AppCompatActivity {
    TextView interest1,interest2,interest3;
    EditText principal;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bp6);
        principal=(EditText) findViewById(R.id.principal);
        submit=(Button) findViewById(R.id.submit);
        interest1=(TextView) findViewById(R.id.interest1);
        interest2=(TextView) findViewById(R.id.interest2);
        interest3=(TextView) findViewById(R.id.interest3);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int p=Integer.parseInt(principal.getText().toString());
                double int1=p*1.05;
                double int2=p*Math.pow(1.05,2);
                double int3=p*Math.pow(1.05,3);
                interest1.setText(""+int1);
                interest2.setText(""+int2);
                interest3.setText(""+int3);
            }
        });
    }
}