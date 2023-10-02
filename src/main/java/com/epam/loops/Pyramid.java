package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int a = 1; a <= cathetusLength; a++) {
            int count = cathetusLength;
            while (count <= cathetusLength && count >= 1) {
                if (count <= a) {
                    System.out.print(count);
                } else {
                    System.out.print(" ");
                }
                count--;
            }
            count = 2;
            while (count >= 2 && count <= cathetusLength) {
                if (count <= a) {
                    System.out.print(count);
                }
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
