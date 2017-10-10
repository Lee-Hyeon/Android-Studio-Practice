package com.example.lsh.myjoke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b_toast1, b_toast2, b_toast3, b_msg1, b_msg2, b_msg3, b_msg4;
    TextView tv_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_toast1 = (Button) findViewById(R.id.b_toast1);
        b_toast2 = (Button) findViewById(R.id.b_toast2);
        b_toast3 = (Button) findViewById(R.id.b_toast3);
        b_msg1 = (Button) findViewById(R.id.b_msg1);
        b_msg2 = (Button) findViewById(R.id.b_msg2);
        b_msg3 = (Button) findViewById(R.id.b_msg3);
        b_msg4 = (Button) findViewById(R.id.b_msg4);
        tv_msg = (TextView) findViewById(R.id.tv_msg);

        b_toast1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.Answer1, Toast.LENGTH_LONG).show();
            }
        });

        b_toast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.Answer2, Toast.LENGTH_LONG).show();
            }
        });

        b_toast3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.Answer3, Toast.LENGTH_LONG).show();
            }
        });

        b_msg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_msg.setText(R.string.Answer4);
            }
        });

        b_msg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_msg.setText(R.string.Answer5);
            }
        });

        b_msg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_msg.setText(R.string.Answer6);
            }
        });

        b_msg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_msg.setText(R.string.Answer7);
            }
        });
    }
}
