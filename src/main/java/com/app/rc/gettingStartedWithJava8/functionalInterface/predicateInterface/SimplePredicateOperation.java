
package com.app.rc.gettingStartedWithJava8.functionalInterface.predicateInterface;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;


/**
 * Predicate is a pre-defined Functional Interface having SAM named test(). This
 * assumes one condition to check as argument and returns true or false based on
 * the condition checking.
 * 
 * @author ihspa
 */
public class SimplePredicateOperation {

    public static void main ( String[] args ) {
        List< Integer > salary = new ArrayList<> ( );
        salary.add ( 10000 );
        salary.add ( 34000 );
        salary.add ( 56000 );
        salary.add ( 12000 );

        // typed predicate definition //
        Predicate< Integer > p = I -> I > 10000;

        // OR //
        @SuppressWarnings ( value = "unused" )
        Predicate< Integer > ps = new Predicate< Integer > ( ) {

            @Override
            public boolean test ( Integer t ) {
                return t > 12000 ? true : false;
            }
        };

        for ( Integer i : salary ) {
            if ( p.test ( i ) )
                System.out.println ( "OK" );
            else
                System.out.println ( "NOK" );
        }

        /*
         * Similarly we can check if a collection is empty or not or whether a linked
         * list is empty or not.
         */
        Predicate< Collection< Integer > > l = ( L ) -> L.isEmpty ( );
        System.out.println ( l.test ( salary ) );
    }
}
