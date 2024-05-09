package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class bp1 extends AppCompatActivity {
    EditText a;
    EditText b;
    Button btn;
    EditText c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bp1);

        a=(EditText) findViewById(R.id.num1);
        b=(EditText) findViewById(R.id.num2);
        c=(EditText) findViewById(R.id.sum);
        btn=(Button) findViewById(R.id.submit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(a.getText().toString());
                int y=Integer.parseInt(b.getText().toString());
                int z=x+y;
                c.setText(" "+z);
            }
        });
    }
}