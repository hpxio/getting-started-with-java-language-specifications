
package com.app.rc.gettingStartedWithJava8.anonymousClasses;

/**
 * Variation-D Anonymous class which
 * implements an interface having SAM
 * and
 * expressed using LE. Note that not all
 * Anonymous classes can be replaced
 * with
 * LE but all LE can be expressed
 * instead with Anonymous classes. Hence
 * Anon
 * classes are more powerful concept
 * than LE. Care should be taken when
 * Anon.
 * Classes can be used and when LE.
 * 
 * @author ihspa
 */
public class VariationD {

    public static void main ( String[] args ) {
        TestD d = ( ) -> System.out
                .println ( "Anonymous::With-LE" );
        d.print ( );
    }
}


interface TestD {

    public void print ( );
}