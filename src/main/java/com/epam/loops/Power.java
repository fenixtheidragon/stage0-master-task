package com.epam.loops;

public class Power {

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

    public void printPower(int numberToPrint, int power) {
        int number = numberToPrint;
        for (int a = 2; a <= power; a++) {
            number *= numberToPrint;
        }
        System.out.println(number);
    }

}
