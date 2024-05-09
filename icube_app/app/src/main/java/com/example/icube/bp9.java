package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class bp9 extends AppCompatActivity {
    TextView area,hypo,perimeter;
    EditText base,height;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bp9);
        area=(TextView) findViewById(R.id.area);
        hypo=(TextView) findViewById(R.id.hypo);
        perimeter=(TextView) findViewById(R.id.perimeter);
        base=(EditText) findViewById(R.id.base);
        height=(EditText) findViewById(R.id.height);
        submit=(Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int b=Integer.parseInt(base.getText().toString());
                int h=Integer.parseInt(height.getText().toString());
                double aarea=0.5*b*h;
                double hhypo=Math.sqrt(Math.pow(b,2)+Math.pow(h,2));
                double pperimeter=b+h+hhypo;
                area.setText(""+aarea);
                hypo.setText(""+hhypo);
                perimeter.setText(""+pperimeter);
            }
        });
    }
}