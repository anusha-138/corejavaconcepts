package com.corejava.concepts.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate=t->t%2==0;// returns true or false
        System.out.println(predicate.test(4));
        List<Integer> list= Arrays.asList(1,23,4,56,3);
        list.stream().filter(predicate).forEach(t-> System.out.println("After filtering :" +t)); //method 1
        list.stream().filter(t->t%2==0).forEach(t-> System.out.println("Even num :"+t)); //method two
    }
}
