package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.text.*;
import android.os.Bundle;

public class if10 extends AppCompatActivity {
    EditText daynum;
    Button submit;
    TextView outp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if10);
        daynum=(EditText) findViewById(R.id.daynum);
        submit=(Button) findViewById(R.id.submit);
        outp=(TextView) findViewById(R.id.outp);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n=Integer.parseInt(daynum.getText().toString());
                switch(n)
                {
                    case 1: outp.setText("Monday");
                            break;
                    case 2: outp.setText("Tueday");
                        break;
                    case 3: outp.setText("Wednesday");
                        break;
                    case 4: outp.setText("Thursday");
                        break;
                    case 5: outp.setText("Friday");
                        break;
                    case 6: outp.setText("Saturday");
                        break;
                    case 7: outp.setText("Sunday");
                        break;
                }
            }
        });
    }
}