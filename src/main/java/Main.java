import task1.AverageOfListOfIntegers;
import task2.FilterStrings;
import task3.FilterPalindromes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String []args){
        /*
            Task1
                Write a method that returns average of list of Numbers
         */
        AverageOfListOfIntegers TASK1 = new AverageOfListOfIntegers();
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(15);
        System.out.println("Task1:::\n" + TASK1.getAverage(list) + "\n\n");

        /*
            Task2
                Write a method that returns list of Strings following
                these two criteria
                1. starts with 'a'
                2.length = 3

         */
        FilterStrings TASK2 = new FilterStrings();
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Subham");
        listOfStrings.add("abc");
        listOfStrings.add("aaaaaaaaaaaaaaaa");
        listOfStrings.add("AaaaAAaaaAAA");
        listOfStrings.add("aza");
        System.out.println("Task2:::\n" + TASK2.filterAllStrings(listOfStrings) + "\n\n");

        /*
            Task3
                Write a method that returns list of Palindromes from a given
                list of strings
         */

        FilterPalindromes TASK3 = new FilterPalindromes();
        List<String> listOfStrings2 = new ArrayList<>();
        listOfStrings2.add("dad");
        listOfStrings2.add("abc");
        listOfStrings2.add("maam");
        listOfStrings2.add("AaaaA");
        listOfStrings2.add("ada");
        System.out.println("Task3:::\n" + TASK3.filterPalindromes(listOfStrings2));
    }
}
