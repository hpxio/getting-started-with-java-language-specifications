package com.app.rc.gettingStartedWithJava8.streams;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCountMethod {
    public static void main(String[] args) {
        Map<Integer, String> M = new Hashtable<>();

        M.put(1, "Nivetha");
        M.put(2, "Rakulpreet");
        M.put(3, "Parineeti");
        M.put(4, "Priyanka");
        M.put(5, "Tabbu");
        M.put(6, "Rekha");
        M.put(7, "Katrina");

        System.out.println(M);

        // Count all members whose name contain ar or e //
        List<String> L = M.values().stream().filter(
                S -> S.contains("ar") || S.contains("e"))
                .collect(Collectors.toList());

        System.out.println(L);

        // To get the count instead we use //
        long c = M.values().stream()
                .filter(S -> S.length() > 6).count();

        System.out.println(c);
    }
}