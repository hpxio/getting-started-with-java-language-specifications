package com.app.rc.GettingStartedWithJava8.streams;

import java.util.LinkedHashSet;
import java.util.Set;

public class StreamToArrayMethod {

    public static void main(String[] args) {
        Set<Integer> S = new LinkedHashSet<>();

        S.add(10);
        S.add(20);
        S.add(30);
        S.add(40);
        S.add(50);
        S.add(60);

        /*
         * Get all the elements that are divisible by 3 into
         * an Integer array using Stream
         */
        Integer[] divBy3 = (Integer[]) S.stream()
                .filter(I -> I % 3 == 0).toArray();
        for (Integer i : divBy3) {
            System.out.println(i);
        }

    }
}