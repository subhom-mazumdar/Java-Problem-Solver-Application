package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class if3 extends AppCompatActivity {
    TextView leap,notleap;
    EditText year;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if3);
        leap=(TextView) findViewById(R.id.leap);
        notleap=(TextView) findViewById(R.id.notleap);
        year=(EditText) findViewById(R.id.year);
        submit=(Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int yr=Integer.parseInt(year.getText().toString());
                if((yr%400==0)||(yr%4==0 && yr%100!=0)){
                    leap.setText("yes");
                    notleap.setText("");}
                else{
                    notleap.setText("yes");
                    leap.setText("");}
            }
        });
    }
}