package com.e.cafeorderingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity
{
    EditText edt1,edt2;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edt1=findViewById(R.id.edt1);
        edt2=findViewById(R.id.edt2);
        btn1=findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String name=edt1.getText().toString();
                String pass=edt2.getText().toString();


                if(name.length()==0&&pass.length()==0)
                {
                    edt1.setError("plz enter name");
                    edt2.setError("plz enter password");
                }
                else if(name.length()==0)
                {
                    edt1.setError("plz enter name");
                }
                else if(pass.length()==0)
                {
                    edt2.setError("plz enter password");
                }
                else
                {
                    Intent i =new Intent(Main2Activity.this,Main3Activity.class);
                    startActivity(i);
                }
            }
        });

    }
}
