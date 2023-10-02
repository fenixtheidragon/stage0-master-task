package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        StringBuilder table = new StringBuilder();
        for (int a = 1; a <= 10; a++) {
            String toAppend = a + " x " + numberTableToPrint + " = " + numberTableToPrint * a + "\n";
            table.append(toAppend);
        }
        String tableString = table.toString();
        System.out.print(tableString);
    }
}
