package com.app.rc.gettingStartedWithJava8.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamForEachMethod {

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

        // Use forEach //
        L.stream().forEach(S -> System.out
                .println("Hi, I am " + S.toUpperCase()));

        // Print revered list //
        L.stream().sorted((P, Q) -> P.compareTo(Q))
                .forEach(System.err::println);

    }
}