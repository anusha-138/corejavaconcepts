package com.corejava.concepts.basic;

public class GenericMethod {
    public static void main(String[] args) {
        String[] cities ={"mysore","bangalore"};
        GenericMethod.display(cities);// type casting String data type
        Integer [] num={1,2,3,4};
        GenericMethod.display(num); //generic class execute irrespective of input data type
        Integer[] arrInteger = { 10, 20, 30, 40, 50, 60 };
        GenericMethod.display(arrInteger);
        Character[] arrChar = { 'I', 'N', 'F', 'O', 'S', 'Y', 'S' };
        GenericMethod.display(arrChar);
        Double[] arrDouble = { 100.1, 200.1, 300.1, 400.1, 500.1, 600.1 };
        GenericMethod.display(arrDouble);
        // generics doesn't work for primitive data type
    }
    public static <E> void display(E[] list){
        for (E e : list) {
            System.out.println(e + " , ");
        }
    }
}



