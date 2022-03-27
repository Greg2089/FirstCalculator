package com.hfad.firstcalculator;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements OnClickListener {
    private static final String TAG = "MyLog";
    protected String oldNumber;
    protected String number;
   boolean numberNew = true;
    TextView enter;
    TextView result;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonDiv;
    Button buttonDot;
    Button buttonMulty;
    Button buttonSumm;
    Button buttonSub;
    Button buttonEq;
    Button buttonCan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enter = (TextView) findViewById(R.id.enter);
        result = (TextView) findViewById(R.id.result);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonMulty = (Button) findViewById(R.id.buttonMulty);
        buttonSumm = (Button) findViewById(R.id.buttonSumm);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonEq = (Button) findViewById(R.id.buttonEq);
        buttonCan = (Button) findViewById(R.id.buttonCan);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
        buttonMulty.setOnClickListener(this);
        buttonSumm.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonEq.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (numberNew)
            enter.setText("");
        numberNew = false;
        number = enter.getText().toString();
        switch (v.getId()) {
            case R.id.button0:
                number = number + "0";
                break;
            case R.id.button1:
                number = number + "1";
                Log.d(TAG," Нажата 1" );
                break;
            case R.id.button2:
                number = number + "2";
                break;
            case R.id.button3:
                number = number + "3";
                break;
            case R.id.button4:
                number = number + "4";
                break;
            case R.id.button5:
                number = number + "5";
                break;
            case R.id.button6:
                number = number + "6";
                break;
            case R.id.button7:
                number = number + "7";
                break;
            case R.id.button8:
                number = number + "8";
                break;
            case R.id.button9:
                number = number + "9";
                break;
            case R.id.buttonDiv:
                number = number + "/";
                break;
            case R.id.buttonDot:
                number = number + ".";
                break;
            case R.id.buttonMulty:
                number = number + "*";
                break;
            case R.id.buttonSumm:
                number = number + "+";
                break;
            case R.id.buttonSub:
                number = number + "-";
                break;
            case R.id.buttonEq:
                number = number + "=";
                break;
        }
        oldNumber = number;//запись рнажатия цифры
        enter.setText(oldNumber);// вывод цифры на экран
    }
}