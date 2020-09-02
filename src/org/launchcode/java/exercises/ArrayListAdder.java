package org.launchcode.java.exercises;

import java.util.ArrayList;

public class ArrayListAdder {

    public static ArrayList<Integer> sumArrayList(ArrayList<Integer> first, ArrayList<Integer> second) {
//        declare variables that I think I need--
//        --make an array list to hold the result
        ArrayList<Integer> result = new ArrayList<>();
//        check the lengths of the arrayLists, figure out which is longer
        if(first.size() > second.size()){
            //        for each element in the longer arrayList
            for(int i = 0; i < first.size(); i++){
//        if I haven't run out of ints from the shorter arrayList--
                if(i < second.size()) {
                    Integer sum = first.get(i) + second.get(i);
                    /*
        --add the two ints together
        else
*/
                    result.add(sum);
                }else {
                    //        just keep the value from the longer list
                    result.add(first.get(i));
                    }


                    }

                }


        return result;
    }
public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>();
        first.add(3);
        first.add(4);
        first.add(5);
        first.add(1);

        ArrayList<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(6);

        ArrayList<Integer> result = sumArrayList(first, second);
    System.out.println(result);
}
    }

