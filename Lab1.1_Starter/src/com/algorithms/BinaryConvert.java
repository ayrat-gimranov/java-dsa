package com.algorithms;

public class BinaryConvert {
    public static void main(String[] args) {
        int number = convertFromBinary("100101");
        System.out.println("Number for binary 100101: " + number);
    }

    public static int convertFromBinary(String binary) {
        // TODO-Lab1.1: return calculated decimal value converted from String binary
        // loop the string from the bottom of the string
        // - get the last character, and check if it is 1 or not
        // - if it is 1, compute the value of that digit with the conversion
        //      - add it to the result
        // - change the conversion by the power of 2

        int result = 0;
        int conversion = 1;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int num = Integer.parseInt(String.valueOf(binary.charAt(i)));
            if (num == 1) {
                num = num * conversion;
                result = result + num;
            }
            conversion = conversion * 2;
        }

        return result;
    }

}

