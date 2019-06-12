package com.tfllab.calc;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    TextView t1;
    Button b1 ,b2;
    RadioButton r1,r2,r3,r4;
    float op1,op2,sol=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        e1=findViewById(R.id.x);
        e2=findViewById(R.id.y);
        t1=findViewById(R.id.ans);
        b1=findViewById(R.id.sb);
        b2=findViewById(R.id.rsb);
        r1=findViewById(R.id.add);
        r2=findViewById(R.id.sub);
        r3=findViewById(R.id.mul);
        r4=findViewById(R.id.div);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals(""))
                {
                    e1.setError("Reqd");
                }
                else if(e2.getText().toString().equals(""))
                {
                    e2.setError("Reqd");
                }
                else
                {
                    op1 = Float.parseFloat(e1.getText().toString());
                    op2 = Float.parseFloat(e2.getText().toString());
                }
                if (r1.isChecked())
                    sol=op1+op2;
                else if (r2.isChecked())
                    sol=op1-op2;
                else if (r3.isChecked())
                    sol=op1*op2;
                else if (r4.isChecked())
                    sol=op1/op2;
                sol = Float.parseFloat(String.format("%.4f",sol));

                Intent intent = new Intent(MainActivity.this,Display.class);
                intent.putExtra("data","Answer: "+sol);
                startActivity(intent);
                // t1.setText(""+sol);
                }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
                e2.setText("");
                t1.setText("");
            }
        });

    }


}
