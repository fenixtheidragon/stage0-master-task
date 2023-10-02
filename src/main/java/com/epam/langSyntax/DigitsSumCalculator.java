package com.epam.langSyntax;
public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int numberCopy = number;
        int sum = 0;
        do {
            int remainder = numberCopy % 10;
            sum += remainder;
            numberCopy /= 10;
        } while (numberCopy % 10 != 0);

        System.out.println(sum);
    }

}
