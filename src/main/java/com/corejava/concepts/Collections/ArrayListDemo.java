package com.corejava.concepts.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> companies = new ArrayList<>();
        companies.add("IBM");
        companies.add("Google");
        companies.add("Infosys");
        //Collections.sort(companies);
        Collections.reverse(companies);
        Collections.shuffle(companies);
        System.out.println(companies);
    }
}
