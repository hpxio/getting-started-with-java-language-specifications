
package com.app.rc.gettingStartedWithJava8.functionalInterface.predicateInterface;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


/**
 * Remove NULL and Empty members from an Array List
 */
public class PredicateOnLists {

    public static void main ( String[] args ) {
        List< String > l = new ArrayList<> ( );
        List< String > m = new ArrayList<> ( );

        l.add ( "" );
        l.add ( "Rosch" );
        l.add ( "Gore" );
        l.add ( "" );
        l.add ( "" );
        l.add ( null );

        System.out.println ( l );

        // Remove all the empty and null members from list
        // //
        Predicate< String > P1 = S -> S == null
                || S.isEmpty ( );
        for ( String s : l ) {
            if ( !P1.test ( s ) ) {
                m.add ( s );
            }
        }

        System.out.println ( m );
    }

}