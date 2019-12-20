package com.e.cafeorderingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity
{
    CheckBox chk1,chk2,chk3;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        chk1=findViewById(R.id.chk1);
        chk2=findViewById(R.id.chk2);
        chk3=findViewById(R.id.chk3);
        btn=findViewById(R.id.order);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                StringBuilder buider=new StringBuilder();
                buider.append("SELECTED ITEMS");
                String msg="";
                float amount=0;



                if(chk1.isChecked())
                {
                    buider.append("\n pizza rs.200");
                    amount+=200;
                }
                if(chk2.isChecked())
                {
                    buider.append("\n burger rs.120");
                    amount+=120;//amount=ampunt+120;
                }

                if(chk3.isChecked())
                {
                    buider.append("\n coffee rs.100");
                    amount+=100;
                }

                buider.append("\n Bill Generate:"+amount);

                Toast.makeText(Main3Activity.this, ""+buider.toString(), Toast.LENGTH_LONG).show();

                Intent i =new Intent(Main3Activity.this,Main4Activity.class);
                i.putExtra("Bill",buider.toString());
                startActivity(i);

            }
        });


    }
}
