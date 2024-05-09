package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class bp2 extends AppCompatActivity {
    EditText full_name;
    Button send;
    EditText line1;
    EditText line2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bp2);
        full_name=(EditText) findViewById(R.id.nameinp);
        send=(Button) findViewById(R.id.submit);
        line1=(EditText) findViewById(R.id.name1);
        line2=(EditText) findViewById(R.id.name2);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=full_name.getText().toString();
                String[] st=name.split(" ");
                line1.setText(" "+st[0]);
                line2.setText(" "+st[1]);
            }
        });
    }
}