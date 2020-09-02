package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {

    public static double getArea(double radius) {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a value for the radius: ");

        while (!in.hasNextDouble()) {
            System.out.println("Please enter a positive value");
            in.nextLine();
        }
        double input = in.nextDouble();
        System.out.println(getArea(input));
    }
}
