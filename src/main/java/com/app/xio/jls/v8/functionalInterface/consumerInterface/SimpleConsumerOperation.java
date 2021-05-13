
package com.app.xio.jls.v8.functionalInterface.consumerInterface;

import java.util.function.Consumer;

public class SimpleConsumerOperation {

    public static void main ( String[] args ) {

        String inp = "Some Shitty String!!";
        Integer in = 12;

        Consumer< String > s = S -> System.out
                .println ( S );

        // Some random experiment //
        Consumer< String > c = C -> C = "asas";
        Consumer< Integer > i = I -> I = 21;

        s.accept ( "You're are the chosen one..." );

        // Some random experiment //
        c.accept ( inp );
        System.out.println ( inp );
        i.accept ( in );
        System.out.println ( in );
    }
}