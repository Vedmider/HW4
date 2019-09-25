package study.homework;

import java.text.ParseException;

public class PositiveToNegativeNumber {

    public static void main(String[] args) {

        convertFromPositiveToNegativeNumber(args[0]);
    }

    public static String convertFromPositiveToNegativeNumber(String number) {
        if (!isNumberParsable(number)) {
            return "Not number";
        }

        if (!isPositive(number)) {
            return  "Not positive number";
        }

        int a = Integer.parseInt(number);
        System.out.println("Input int is " + a);
        a = ~a;
        a += 0b1;
        System.out.println("Converted int is " + a);

        return "" + a;
    }

    private static boolean isNumberParsable(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isPositive(String number){
        if (Integer.parseInt(number) > 0){
            return true;
        } else {
            return false;
        }
    }

}
