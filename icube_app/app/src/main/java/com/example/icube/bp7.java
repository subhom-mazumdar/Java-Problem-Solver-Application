package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class bp7 extends AppCompatActivity {
    TextView square,cube;
    EditText num;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bp7);
        square=(TextView) findViewById(R.id.square);
        cube=(TextView) findViewById(R.id.cube);
        num=(EditText) findViewById(R.id.num);
        submit=(Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int k=Integer.parseInt(num.getText().toString());
                int sq=k*k;
                int cb=k*k*k;
                square.setText(""+sq);
                cube.setText(""+cb);
            }
        });
    }
}