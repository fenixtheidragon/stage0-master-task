package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String numberStr = String.valueOf(number);
        String[] digits = numberStr.split("");
        StringBuilder reversedNumberSB = new StringBuilder();
        for (int a = digits.length - 1; a >= 0; a--) {
            reversedNumberSB.append(digits[a]);
        }
        String reversedNumberStr = reversedNumberSB.toString();
        int reversedNumber = Integer.parseInt(reversedNumberStr);
        System.out.println(reversedNumber);
    }

}
