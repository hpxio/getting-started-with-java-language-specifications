
package com.app.rc.GettingStartedWithJava8.functionalInterface.functionInterface;


import java.util.function.Function;


public class FindAndReplaceFunction {

    // Define a Function to Find a given sub-string and replace with another //
    public static void main ( String[] args ) {
        String input = "Hello, this is a simple Predicate Functional Interface demo.";
        String find = "Predicate";
        String replace = "Function";

        Function< String, String > findAndReplace = S -> S.replaceAll ( find, replace );
        System.out.println ( "Before Replace : " + input );
        System.out.println ( "After Replace : " + findAndReplace.apply ( input ) );
    }

}