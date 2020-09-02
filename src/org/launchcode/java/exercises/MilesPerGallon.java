package org.launchcode.java.exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Double miles;
        Double gallons;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("How many miles did you drive?: ");
        miles = input.nextDouble();
        System.out.println("How many gallons of gasoline did you use?: ");
        gallons = input.nextDouble();
        input.close();
        System.out.println("You drove "+ miles+ " miles and used "+gallons+" gallons of gasoline, and your MPG was " + miles/gallons+"!");
    }
}
