package org.launchcode.java.studios;

import java.util.HashMap;

public class CountingCharacters {

    public static void main(String[] args) {
        String text = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        HashMap<Character, Integer> counts = new HashMap<>();

        for(int i = 0; i < text.length(); i++) {
           char current = text.charAt(i); //get the character in the i-th position
        }
}}
