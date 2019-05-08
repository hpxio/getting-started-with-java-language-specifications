
package com.app.rc.GettingStartedWithJava8.functionalInterface.functionInterface;

import java.util.function.Function;

/**
 * Write program using Function such that it take input
 * strings and removes any leading or trailing spaces and
 * convert input to Uppercase string. Do the vice-versa of
 * the same as well.
 */
public class FunctionWithStrings {

    public static void main ( String[] args ) {
        String input = "              anadearmas_^ ";

        Function< String, String > toUpper = S -> S
                .toUpperCase ( );

        Function< String, String > trim = S -> S.trim ( );

        System.out.println (
                toUpper.andThen ( trim ).apply ( input ) );

        /*
         * OR -> First trim all leading and trailing spaces
         * and then convert to upper case
         */
        System.out.println (
                toUpper.compose ( trim ).apply ( input ) );
    }
}