package com.week03.day02.practice;

public class practiceStringMethods {

    public static void main(String[] args) {

        String s = "word";
        String s1 = "MIGHTYword";

        System.out.println(s.toUpperCase());
        System.out.println(s1.toLowerCase());

//        We can use it as boolean values
//        s1.startsWith("MI");
//        s1.endsWith("rd");
//        s.equals(s1)          - We can check if the two strings are equal to each other
//        s.concat(s1);         - We can add to String to each other (or to itself)
//        s.charAt(2);          - We can ask which char is on the index
//        s.indexOf('r');       - We can get the index of the first match
//        s.lastIndexOf('r');   - We can get the index of last found character
//        s.substring(3, 8);    - We can cut out a part form a string, we have to give the first index
//                              we want to cut from and the last we want to cut
//        s.replace('r', 'l');  - We can replace characters (words, etc), or string fragments, first place the old char,
//                              then the new char
//        asdList.split(" ");   - We can split the string along given character,
//                              like we split the string after every whitespace
//        s.trim();             - Deletes whitespaces from the end and the beginning of the string


    }
}
