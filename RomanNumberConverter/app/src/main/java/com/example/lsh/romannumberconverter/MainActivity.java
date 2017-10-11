package com.example.lsh.romannumberconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b_convertToRoman, b_convertToNumber;
    EditText et_number, et_romanInput;
    TextView tv_romanOutput, tv_numberOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_convertToNumber   = (Button)   findViewById(R.id.b_convertToNumber);
        b_convertToRoman    = (Button)   findViewById(R.id.b_convertToRoman);
        et_number           = (EditText) findViewById(R.id.et_number);
        et_romanInput       = (EditText) findViewById(R.id.et_romanInput);
        tv_romanOutput      = (TextView) findViewById(R.id.tv_RomanOutput);
        tv_numberOutput     = (TextView) findViewById(R.id.tv_NumberOutput);

        b_convertToNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NumberConverter rc = new NumberConverter();

                String theRoman;

                int theNumber;

                theRoman = et_romanInput.getText().toString();

                theNumber = rc.toNumber(theRoman);

                tv_numberOutput.setText(String.valueOf(theNumber));

                if(theNumber == -1)
                    tv_numberOutput.setText("Sorry, I can't do that");
            }
        });

        b_convertToRoman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NumberConverter nc = new NumberConverter();

                int theNumber;

                String theRoman;

                theNumber = Integer.parseInt(et_number.getText().toString());

                theRoman = nc.toRoman(theNumber);

                tv_romanOutput.setText(theRoman);
            }
        });

    }
}
