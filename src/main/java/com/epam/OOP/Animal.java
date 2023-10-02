package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String pawOrPaws = "paws";
        if (this.numberOfPaws == 1) {
            pawOrPaws = "paw";
        }
        String aOrNoFur;
        if (this.hasFur) {
            aOrNoFur = "a";
        } else {
            aOrNoFur = "no";
        }
        return "This animal is mostly " + (this.color) + ". It has " + (this.numberOfPaws) + " " + pawOrPaws + " and " + aOrNoFur + " fur.";
    }
}
