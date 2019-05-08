package com.app.rc.GettingStartedWithJava8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * You have a list of integers. We want to fetch a list
 * where all the members are doubled their values.
 * 
 * USed map() - Takes Function FI
 */
public class StreamMapMethod {

    public static void main(String[] args) {
        List<Integer> L = new ArrayList<>();
        L.add(5);
        L.add(10);
        L.add(15);
        L.add(20);
        L.add(25);
        L.add(30);
        L.add(35);

        // Using For loop //
        List<Integer> N = new ArrayList<>();
        for (Integer i : L) {
            N.add(i * 2);
        }
        System.out.println(N);

        // Using Streams //
        N = L.stream().map(I -> I * 2)
                .collect(Collectors.toList());
        System.out.println(N);
    }

}