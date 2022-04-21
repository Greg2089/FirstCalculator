package com.hfad.firstcalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements OnClickListener {
    Сalculator сalculator = new Сalculator();
    private static final String CALCULATOR = "CALCULATOR";
    String oldNumber;
    String number;
    boolean numberNew = true;
    private TextView enter;
    private TextView result;
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonDiv;
    private Button buttonDot;
    private Button buttonMulty;
    private Button buttonSumm;
    private Button buttonSub;
    private Button buttonEq;
    private Button buttonCan;
    boolean isNew = true;

    //создал поля кнопок и вьюх
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Сalculator сalculator;
        if (savedInstanceState != null) {
            сalculator = (Сalculator) savedInstanceState.get(CALCULATOR);
        }
        showResult();
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
        buttonCan.setOnClickListener(this);
    }

    //обработал нажатия кнопок через интерфейс OnClickListener
    @Override
    public void onClick(View v) {
        if (isNew) {
            result.setText("");
        }
        isNew = false;
        TextView result = findViewById(R.id.result);
        number = enter.getText().toString();
        switch (v.getId()) {
            case R.id.button0:
                сalculator.stringBuilder.append("0");
                break;
            case R.id.button1:
                сalculator.stringBuilder.append("1");
                //Log.d(TAG," Нажата 1" );
                break;
            case R.id.button2:
                сalculator.stringBuilder.append("2");
                break;
            case R.id.button3:
                сalculator.stringBuilder.append("3");
                break;
            case R.id.button4:
                сalculator.stringBuilder.append("4");
                break;
            case R.id.button5:
                сalculator.stringBuilder.append("5");
                break;
            case R.id.button6:
                сalculator.stringBuilder.append("6");
                break;
            case R.id.button7:
                сalculator.stringBuilder.append("7");
                break;
            case R.id.button8:
                сalculator.stringBuilder.append("8");
                break;
            case R.id.button9:
                сalculator.stringBuilder.append("9");
                break;
            case R.id.buttonDiv:
                сalculator.stringBuilder.append("/");
                break;
            case R.id.buttonDot:
                сalculator.stringBuilder.append(".");
                break;
            case R.id.buttonMulty:
                сalculator.stringBuilder.append("*");
                break;
            case R.id.buttonSumm:
                сalculator.stringBuilder.append("+");
                break;
            case R.id.buttonSub:
                сalculator.stringBuilder.append("-");
                break;
            case R.id.buttonEq:
                сalculator.stringBuilder.append("=");
                break;
            case R.id.buttonCan:
                if (сalculator.stringBuilder != null){
                    сalculator.stringBuilder = new StringBuilder();
                }
                break;
        }
        // oldNumber = number;//запись нажатия цифры
        result.setText(сalculator.stringBuilder.toString());
        enter.setText(oldNumber);// вывод цифры на экран
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable(CALCULATOR, сalculator);
    }

    public void showResult() {
        TextView textView = findViewById(R.id.result);
        textView.setText(сalculator.stringBuilder.toString());
    }
}