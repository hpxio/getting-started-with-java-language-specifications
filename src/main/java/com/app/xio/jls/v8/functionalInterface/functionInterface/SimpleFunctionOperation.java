
package com.app.xio.jls.v8.functionalInterface.functionInterface;


import java.util.function.Function;


public class SimpleFunctionOperation {

    public static void main ( String[] args ) {

        // Function to return Square of Given Number //
        Function< Integer, Integer > sqr = S -> S * S;
        System.out.println ( sqr.apply ( 2 ) );

        // Function to return String length //
        Function< String, Integer > len = L -> L.length ( );
        System.out.println ( len.apply ( "Welcome" ) );
    }
}