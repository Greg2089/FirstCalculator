package com.hfad.firstcalculator;

import java.io.Serializable;

public class Сalculator implements Serializable {
    private double result;
    protected double number1;
    protected double number2;
   StringBuilder stringBuilder = new StringBuilder ();
    void div (double number1, double number2) {
        if (number2!=0) {
        double result = number1/number2;
        }
    }
    void multy (double number1, double number2) {
        double result = number1*number2;
    }
    void sub (double number1, double number2) {
        double result = number1-number2;
    }
}
