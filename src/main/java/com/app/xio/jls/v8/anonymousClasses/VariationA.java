
package com.app.xio.jls.v8.anonymousClasses;

/**
 * Variation-A Anonymous class that
 * extends a Concrete class.
 * 
 * @author ihspa
 */
public class VariationA {

    public static void main ( String[] args ) {
        TestA a = new TestA ( ) {

            @Override
            public void print ( ) {
                System.out.println ( "Anonymous" );
            }
        };
        a.print ( );
    }
}


class TestA {

    public void print ( ) {
        System.out.println ( "Parent" );
    }
}
