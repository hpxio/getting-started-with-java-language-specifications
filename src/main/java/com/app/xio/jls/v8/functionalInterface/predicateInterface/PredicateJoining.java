
package com.app.xio.jls.v8.functionalInterface.predicateInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/**
 * Pipelining the Predicate check for Negation, Logical AND & Logical OR.
 * 
 * @author ihspa
 */
public class PredicateJoining {

    /**
     * 
     * @param p
     * @param c
     */
    public static void exec(Predicate<Integer> p, Collection<Integer> c) {

        for (Integer i : c) {
            // System.out.println(p.test(i));
            if (p.test(i))
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Predicate<Integer> P1 = T -> T > 67000;
        Predicate<Integer> P2 = T -> T % 2 == 0;
        Predicate<Integer> P3 = T -> T % 2 != 0;

        List<Integer> salary = new ArrayList<>();
        salary.add(89000); // > 67000
        salary.add(12004); // < 67000
        salary.add(67001); // > 67000
        salary.add(56891); // < 67000

        // Check if salary is not greater than 67000 //
        System.out.println("Negation");
        exec(P1.negate(), salary);
        /*
         * Check if salary is greater than 67000 and even figure
         */
        System.out.println("Logical AND");
        exec(P1.and(P2), salary);

        /*
         * Check if salary is either greater tha 67000 or an ODD number salary
         */
        System.out.println("Logical OR");
        exec(P1.or(P3), salary);
    }
}
