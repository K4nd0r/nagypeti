package com.week02.day02.lists;

import java.lang.reflect.Array;
import java.util.*;

public class elementFinder {

    public static String containsSeven (ArrayList inputList) {

        String toReturn= "";

        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i).equals(7)){
                toReturn = "Hoorray";
            } else {
                toReturn = "Noooooo";
            }
        }
        return toReturn;
    }

//    public static String containsSeven1 (ArrayList inputList) {
//        if (inputList.indexOf(7) >= 0) {
//            return "Hoorray";
//        } else {
//            return "Noooooo";
//        }
//    }

//    public static String containsSeven2 (ArrayList inputList){
//        if (inputList.contains(7)) {
//            return "Hoorray";
//        } else {
//            return "Noooooo";
//        }
//    }

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!

    }
}
