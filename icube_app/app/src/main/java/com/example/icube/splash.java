package com.example.icube;

import androidx.appcompat.app.AppCompatActivity;
import android.content.*;
import android.widget.MediaController;
import android.net.Uri;
import android.widget.Toast;
import android.widget.VideoView;
import android.os.*;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(splash.this,"Developed by\nSubhom Mazumdar",Toast.LENGTH_LONG).show();
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run()
            {
                Intent intn=new Intent(splash.this, home.class);
                startActivity(intn);
                finish();
            }
        },4000);
    }
}