package com.corejava.concepts.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo{

    public static void main(String[] args) {
        Consumer<Integer> consumer =(integer -> System.out.println("Print input :"+integer));
        consumer.accept(10);
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        list.forEach(consumer);// forEach takes the Input Consumer and consumer.accept method is called internally
        list.forEach(t-> System.out.println(t));
    }
}
