package org.example;

import java.util.Scanner;

public class Calculator {

    public String action (double numberFirst, double numberSecond, String sign) {

        String result;

        switch(sign) {
            case "+":
                result = Double.toString(numberFirst+numberSecond);
                break;

            case "-":
                result = Double.toString(numberFirst-numberSecond);
                break;

            case "*":
                result = Double.toString(numberFirst*numberSecond);
                break;

            case "/":
                if (numberSecond==0) {
                    result = "You can`t divide by zero, use another number";
                }

                result = Double.toString(numberFirst/numberSecond);

                break;

            case "%":
                double res = (numberSecond*100)/numberFirst;
                if( res%2==0){
                    String resLikeString[] = Double.toString(res).split("\\.");
                    result = resLikeString[0] + " %";
                } else {
                    result = Double.toString(res) + " %";
                }
                break;

            default:
                result = "Error, try to in two numbers and sign like: '+','-', '/', '*', '%'";
        }
        return result;

    }
}
