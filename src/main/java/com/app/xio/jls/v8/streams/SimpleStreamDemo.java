
package com.app.xio.jls.v8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Used filter() - Takes a Predicate FI
 */
public class SimpleStreamDemo {

    public static void main(String[] args) {
        List<Integer> rollCall = new ArrayList<Integer>();
        rollCall.add(5);
        rollCall.add(10);
        rollCall.add(15);
        rollCall.add(20);
        rollCall.add(25);
        rollCall.add(30);
        rollCall.add(35);

        // Fetch all numbers that are even //
        List<Integer> even = rollCall.stream()
                .filter(I -> I % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(even);
    }

}
