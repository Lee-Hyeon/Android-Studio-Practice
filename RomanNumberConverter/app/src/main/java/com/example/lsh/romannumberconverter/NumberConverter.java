package com.example.lsh.romannumberconverter;

/**
 * Created by LSH on 2017. 10. 10..
 */

public class NumberConverter {
    public String  toRoman(int numberInput) {

        if(numberInput <0 || numberInput >=10000) {
            return "Sorry. I can't do that";
        }

        String returnValue = "";

        while(numberInput >= 1000) {
            returnValue += "M";
            numberInput = numberInput -1000;
        }

        while(numberInput >= 900) {
            returnValue += "CM";
            numberInput = numberInput -900;
        }

        while(numberInput >= 500) {
            returnValue += "D";
            numberInput = numberInput -500;
        }

        while(numberInput >= 400) {
            returnValue += "CD";
            numberInput = numberInput -400;
        }

        while(numberInput >= 100) {
            returnValue += "C";
            numberInput = numberInput -100;
        }

        while(numberInput >= 90) {
            returnValue += "XC";
            numberInput = numberInput -90;
        }

        while(numberInput >= 50) {
            returnValue += "L";
            numberInput = numberInput -50;
        }

        while(numberInput >= 40) {
            returnValue += "XL";
            numberInput = numberInput -40;
        }

        while(numberInput >= 10) {
            returnValue += "X";
            numberInput = numberInput -10;
        }

        while(numberInput >= 9) {
            returnValue += "IX";
            numberInput = numberInput -9;
        }

        while(numberInput >= 5) {
            returnValue += "V";
            numberInput = numberInput -5;
        }

        while(numberInput >= 4) {
            returnValue += "IV";
            numberInput = numberInput -4;
        }

        while(numberInput >= 1) {
            returnValue += "I";
            numberInput = numberInput -1;
        }
        return returnValue;
    }

    public int toNumber(String numeral) {
        if(numeral.isEmpty()) {
            return 0;
        }

        int returnValue = 0;

        while(numeral.startsWith("M")) {
            returnValue += 1000;
            numeral = numeral.substring(1);
        }

        while(numeral.startsWith("CM")) {
            returnValue += 900;
            numeral = numeral.substring(2);
        }

        while(numeral.startsWith("D")) {
            returnValue += 500;
            numeral = numeral.substring(1);
        }

        while(numeral.startsWith("CD")) {
            returnValue += 400;
            numeral = numeral.substring(2);
        }

        while(numeral.startsWith("C")) {
            returnValue += 100;
            numeral = numeral.substring(1);
        }
        while(numeral.startsWith("XC")) {
            returnValue += 90;
            numeral = numeral.substring(2);
        }

        while(numeral.startsWith("L")) {
            returnValue += 50;
            numeral = numeral.substring(1);
        }

        while(numeral.startsWith("XL")) {
            returnValue += 40;
            numeral = numeral.substring(2);
        }

        while(numeral.startsWith("X")) {
            returnValue += 10;
            numeral = numeral.substring(1);
        }

        while(numeral.startsWith("IX")) {
            returnValue += 9;
            numeral = numeral.substring(2);
        }

        while(numeral.startsWith("V")) {
            returnValue += 5;
            numeral = numeral.substring(1);
        }

        while(numeral.startsWith("IV")) {
            returnValue += 4;
            numeral = numeral.substring(2);
        }

        while(numeral.startsWith("I")) {
            returnValue += 1;
            numeral = numeral.substring(1);
        }

        if(!numeral.isEmpty())
            return -1;

        return returnValue;
    }
}
