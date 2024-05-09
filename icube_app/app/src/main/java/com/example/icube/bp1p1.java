package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class bp1p1 extends AppCompatActivity {
    EditText a;
    Button send;
    EditText b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bp1p1);
        a=(EditText) findViewById(R.id.nameinp);
        send=(Button) findViewById(R.id.submit);
        b=(EditText) findViewById(R.id.showname);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chk=a.getText().toString();
                b.setText(chk);
            }
        });
    }
}