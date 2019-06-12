package com.tfllab.calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Display extends AppCompatActivity {
    String ans;
    TextView dis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        dis = findViewById(R.id.disp);
        Intent intent = getIntent();
        ans = intent.getStringExtra("data");
        dis.setText(ans);
    }
}
