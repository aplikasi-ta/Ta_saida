package com.example.ari.saidata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class q1 extends AppCompatActivity {
Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        btn2 = (Button) findViewById(R.id.txt_next);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(q1.this, q2.class);
                startActivity(intent2);
            }
        });
    }
}
