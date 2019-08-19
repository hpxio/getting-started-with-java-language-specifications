package com.app.rc.gettingStartedWithJava8.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedMethod {

    public static void main(String[] args) {

        List<String> L = new ArrayList<>();

        L.add("Arushi");
        L.add("Farheen");
        L.add("Aabha");
        L.add("Yamini");
        L.add("Pragati");
        L.add("Deepika");

        // Before Sorting //
        System.err.println(L);

        // Traditional - Natural sorder sorting //
        Collections.sort(L);
        System.out.println(L);

        // Natural Order Sorting - Using Stream //
        List<String> M = L.stream().sorted()
                .collect(Collectors.toList());
        System.out.println(M);

        // Reverse Order Sorting - Using Stream //
        List<String> N = L.stream()
                .sorted((P, Q) -> Q.compareTo(P))
                .collect(Collectors.toList());
        System.out.println(N);

    }
}