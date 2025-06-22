// Java program to demonstrate java LinkedList

package com.list;

import java.util.LinkedList;
import java.util.List;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating LinkedList
        List<String> list = new LinkedList<>();

        // Adding elements to the list
        list.add("Adidas");
        list.add("Nike");
        list.add("Tschibo");
        list.add("Colistar");
        list.add("Chanel");
        list.add("Sisly");
        list.add("Elizabeth Arden");
        list.add("Victoria's Secret");
        list.add("Skiny");
        list.add("Snipet");
        list.add("Marc O'Polo");
        list.add("Michael Kors");
        list.add("Starbucks");

        // Printing the list to console
        System.out.println(list);

        // Checking if list contains Victoria's Secret
        System.out.println("Is there Victoria's Secret: " + list.contains("Victoria's Secret"));

        // Checking if list contains Volvo
        System.out.println("Is there Victoria's Volvo: " + list.contains("Volvo"));

        // Remove elemnt Michael Kors
        list.remove("Michael Kors");

        // Printing the list to console
        System.out.println(list);

        // Remove elemnt Tschibo
        list.remove("Tschibo");

        // Printing the list to console
        System.out.println(list);

        // Checking if list contains Tschibo
        System.out.println("Is there Tschibo: " + list.contains("Tschibo"));
    }
}
