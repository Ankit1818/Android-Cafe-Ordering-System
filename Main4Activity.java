package com.e.cafeorderingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {


    TextView txt33,txt44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        txt33=findViewById(R.id.txt33);
        txt44=findViewById(R.id.txt44);

        Intent i=getIntent();
        txt44.setText(i.getStringExtra("Bill"));


    }
}
