package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        StringBuilder pattern = new StringBuilder();
        for (int i = 1; i <= cathetusLength; ++i) {
            if (i == 1) {
                pattern.append(1);
            } else {
                pattern.append(i).insert(0, i);
            }

            System.out.println(" ".repeat(cathetusLength - i) + pattern);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
