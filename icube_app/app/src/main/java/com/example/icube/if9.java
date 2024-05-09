package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class if9 extends AppCompatActivity {
    EditText num1,num2;
    RadioButton add,diff,mul,div;
    Button submit;
    TextView result;
//    static String stream="";
//    static String oper="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if9);
        num1=(EditText) findViewById(R.id.num1);
        num2=(EditText) findViewById(R.id.num2);
        submit=(Button) findViewById(R.id.submit);
        result=(TextView) findViewById(R.id.result);
        add=(RadioButton) findViewById(R.id.add);
        diff=(RadioButton) findViewById(R.id.diff);
        mul=(RadioButton) findViewById(R.id.mul);
        div=(RadioButton) findViewById(R.id.div);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int a=Integer.parseInt(num1.getText().toString());
               int b=Integer.parseInt(num2.getText().toString());
               if(add.isChecked())
               {
                   int c=a+b;
                   result.setText(""+c);
               }
               else if(diff.isChecked())
               {
                   int c=a-b;
                   result.setText(""+c);
               }
               else if(mul.isChecked())
               {
                   int c=a*b;
                   result.setText(""+c);
               }
               else if(div.isChecked())
               {
                   double c=a/b;
                   result.setText(String.format("%.2f",c));
               }
            }
        });
    }
}