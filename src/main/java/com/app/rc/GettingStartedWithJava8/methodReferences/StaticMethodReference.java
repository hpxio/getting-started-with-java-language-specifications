
package com.app.rc.GettingStartedWithJava8.methodReferences;

/**
 * Method Reference is associated with LE. It simply states
 * that you can assign an existing method definition to the
 * Functional Interface SAM given that the signature is
 * similar. The name, return type, access modifiers and
 * static/final can change but argument list and type should
 * be same. It promotes Code Reusability. It is replacement
 * of LE for Functional Interfaces. Also emphasizes
 * Functional Programming.
 */
public class StaticMethodReference {

    public static void main ( String[] args ) {
        System.out.println ( "OK" );

        // Plain old conventional method - LE//
        Printer P = ( ) -> System.out
                .println ( "I am Printer!" );
        P.print ( );

        // Using Static Method Reference //
        Printer Pb = StaticMethodReference::info;
        Pb.print ( );

    }

    public static void info ( ) {
        System.out.println (
                "I am Static Method Reference to print()" );
    }

}


@FunctionalInterface
interface Printer {

    public void print ( );
}