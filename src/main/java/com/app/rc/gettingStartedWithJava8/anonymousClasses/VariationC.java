
package com.app.rc.gettingStartedWithJava8.anonymousClasses;

/**
 * Variation-C Anonymous class that
 * implements an interface which has
 * n-number
 * of public abstract methods
 * 
 * @author ihspa
 */
public class VariationC {

    public static void main ( String[] args ) {
        TestC c = new TestC ( ) {

            @Override
            public void print ( ) {
                System.out.println ( "Anonymous::Print" );
            }

            @Override
            public void info ( ) {
                System.out.println ( "Anonymous::Info" );
            }
        };
        c.info ( );
        c.print ( );
    }
}


interface TestC {

    public void print ( );

    public void info ( );
}