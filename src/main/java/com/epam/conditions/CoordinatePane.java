package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        String result;
        if (x > 0 && y > 0) result = "first";
        else if (x < 0 && y > 0) result = "second";
        else if (x < 0 && y < 0) result = "third";
        else if (x > 0 && y < 0) result = "fourth";
        else result = "zero";
        System.out.println(result);
    }

}

