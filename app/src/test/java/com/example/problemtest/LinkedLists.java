package com.example.problemtest;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Hello");
        list.add("World");
        list.add("This");
        list.add("Is");
        list.add("Jeselle");
        list.add("Making");
        list.add("A");
        list.add("List");

        // Get the 3rd element from the tail
        System.out.println( "3rd element from the tail of the list is " + list.get(list.size()-3));

        // Print the length of the linked list
        System.out.println( "List's size is " + list.size() );

    }
}
