package com.epam.loops;

public class HalfPyramid {

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

    public void printHalfPyramid(int cathetusLength) {

        for (int a = 1; a <= cathetusLength; a++) {
            int count = cathetusLength;
            while (count <= cathetusLength && count >= 1) {
                if (count <= a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                count--;
            }
            System.out.println();
        }
    }
}
