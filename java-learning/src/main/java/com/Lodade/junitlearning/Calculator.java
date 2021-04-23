package com.Lodade.junitlearning;

public class Calculator {
    public double add(double num1, double num2){
        return num1 + num2;
    }

    public double multiply(double num1, double num2){
        return num1 * num2;
    }

    public double turnAbsolute(double num1){
        return Math.abs(num1);
    }

    public boolean isMultiple(double num1, double num2){
        if(num1 % num2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
