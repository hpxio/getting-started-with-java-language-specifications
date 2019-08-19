package com.app.rc.gettingStartedWithJava8.functionalInterface.predicateInterface;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

/**
 * Print all the members of Set having their names starting with letter 'K'
 */
public class SimpleStringPredicate {

    public static <T> void exec(Predicate<T> p, Collection<T> c) {
        for (T t : c) {
            if (p.test(t)) {
                System.out.println(t);
            }
        }
    }

    public static void main(String[] args) {

        Set<String> s = new LinkedHashSet<>();
        s.add("Girish");
        s.add("Kiran");
        s.add("Harsh");
        s.add("Kusum");
        s.add("Kavita");
        s.add("Parul");
        s.add("Pratosh");
        s.add("Kiran");
        s.add("Preeti");

        System.out.println(s);

        // Get all the names starting with K using predicate //
        Predicate<String> isK = S -> S.startsWith("K");
        exec(isK, s);

        // Get all the names not starting with P using Predicate //
        Predicate<String> isP = S -> S.startsWith("P");
        exec(isP.negate(), s);

    }

}