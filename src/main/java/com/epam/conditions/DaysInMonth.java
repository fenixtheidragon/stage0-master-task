package com.epam.conditions;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean leapOrNot = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        String result;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                result = "31";
                break;
            case 4, 6, 9, 11:
                result = "30";
                break;
            case 2:
                if (leapOrNot) {
                    result = "29";
                } else {
                    result = "28";
                }
                break;
            default:
                result = "invalid date";
        }
        System.out.println(result);
    }
}