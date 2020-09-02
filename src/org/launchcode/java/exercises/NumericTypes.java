package org.launchcode.java.exercises;

import java.util.Scanner;

public class NumericTypes {

        public static void main(String[] args){
            Double length;
            Double width;
            Scanner input;
            input = new Scanner(System.in);
            System.out.println("Hello, what is the length of your rectangle?: ");
            length = input.nextDouble();
            System.out.println("Hello, what is the width of your rectangle?: ");
            width = input.nextDouble();
            input.close();
            Double areaOfRectangle = length * width;
            System.out.println("The area of your rectangle is "+ areaOfRectangle + "!");
        }
    }

