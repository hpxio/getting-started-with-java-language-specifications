package com.app.xio.jls.v8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMinMaxMethod {

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

        // Reverse Order Sorting - Using Stream //
        List<String> N = L.stream()
                .sorted((P, Q) -> Q.compareTo(P))
                .collect(Collectors.toList());
        System.out.println(N);

        // Get minimum with custom sorting order //
        String M = L.stream().min((P, Q) -> Q.compareTo(P))
                .get();
        /*
         * As per above observation, min always returns the
         * first member of the sorted collection. If the
         * comparator is passed to have a reverse sorting
         * then min will return the greatest value.
         */
        System.err.println(M);

        // Get maximum with natural sorting order //
        String W = L.stream().max((R, S) -> R.compareTo(S))
                .get();
        /*
         * As per above observation, max always returns the
         * last member of the sorted collection. If the
         * comparator is passed to have a reverse sorting
         * then max will return the smallest value.
         */
        System.out.println(W);

    }
}