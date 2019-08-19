
package com.app.rc.gettingStartedWithJava8.anonymousClasses;

/**
 * Variation B Anonymous class which
 * extends an Abstract Class having on
 * abstract method
 * 
 * @author ihspa
 */
public class VariationB {

    public static void main ( String[] args ) {
        TestB b = new TestB ( ) {

            @Override
            public void print ( ) {
                System.out.println ( "Anonymous" );
            }
        };
        b.print ( );
    }
}


abstract class TestB {

    abstract public void print ( );
}
