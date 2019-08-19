package com.app.rc.gettingStartedWithJava8.streams;

import java.util.stream.Stream;

public class StreamOfMethod {

    public static void main(String[] args) {
        Stream<Integer> I = Stream.of(1, 2, 3, 4, 4, 5, 7);

        // Print all the odd numbers and sort the output to
        // reverse order

        I.filter(E -> E % 2 != 0)
                .sorted((P, Q) -> Q.compareTo(P))
                .forEach(System.err::println);

        // Stream of Strings //
        Stream<String> S = Stream.of("shdksjh987KH9aas",
                "398siduIUy283", "sdjhk323KJHkas",
                "iue78sdiuyIUY34ndSK");

        // Get password //
        S.map(A -> A.toUpperCase()).sorted()
                .forEach((A) -> System.out.println(A));

    }
}