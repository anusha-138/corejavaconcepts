package com.corejava.concepts.basic;

import java.util.Arrays;
import java.util.List;

public class WildcardDemo
{
    /**Generics in Java allow wildcard constructs to denote a family of types. They can be categorized as follows:
     *
     * ? extends T - Upper-bounded wildcard which supports types that are T or its sub-types.
     *
     * ? super T - Lower-bounded wildcard which supports types that are T or its super-types.
     *
     * ? - Unbounded wildcard which supports all types.
     * Ref: https://www.geeksforgeeks.org/wildcards-in-java/
     */
    public static void main(String[] args)
    {

        //Upper Bounded Integer List
        List<Integer> list1= Arrays.asList(4,5,6,7);

        //printing the sum of elements in list
        System.out.println("Total sum is:"+sum(list1));

        //Double list
        List<Double> list2=Arrays.asList(4.1,5.1,6.1);

        //printing the sum of elements in list
        System.out.print("Total sum is:"+sum(list2));

        //Lower Bounded Integer List
        List<Integer> list3= Arrays.asList(4,5,6,7);

        //Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list3);

        //Number list
        List<Number> list4= Arrays.asList(4,5,6,7);

        //Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list4);
    }

    public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list)
    {
        //Lower bounded WildCard
        System.out.println(list);
    }

    private static double sum(List<? extends Number> list)
    {
        //Upper Bounded WildCard
        double sum=0.0;
        for (Number i: list)
        {
            sum+=i.doubleValue();
        }

        return sum;
    }
}
