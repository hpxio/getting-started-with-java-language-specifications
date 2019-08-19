
package com.app.rc.gettingStartedWithJava8.functionalInterface.functionInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Write a Function to fetch a list of employees who are
 * eligible for Increment based on the check that they must
 * be serving in the current role for more than 2 years and
 * current rating is above 3.
 */
public class FunctionOnList {

    /**
     * This is the prototype which needs to be converted
     * into equivalent Function FI.
     * 
     * @param <T>
     * @param p
     * @param c
     * @return
     */
    public static < T extends Employee > Collection< T > check (
            Predicate< Employee > p, Collection< T > c ) {

        Collection< T > n = new ArrayList<> ( );

        for ( T t : c ) {
            if ( p.test ( t ) ) {
                n.add ( t );
            }
        }
        return n;
    }

    public static void main ( String[] args ) {

        List< Employee > list = new ArrayList<> ( );

        list.add ( new Employee ( 3.5F, 1.8F ) );
        list.add ( new Employee ( 2.8F, 3.0F ) );
        list.add ( new Employee ( 3.0F, 3.0F ) );
        list.add ( new Employee ( 3.0F, 6.7F ) );
        list.add ( new Employee ( 5.0F, 5.2F ) );
        list.add ( new Employee ( 5.0F, 1.0F ) );
        list.add ( new Employee ( 1.0F, 1.0F ) );

        Predicate< Employee > isRatingOk = E -> E
                .getRating ( ) >= 3;
        Predicate< Employee > isServiceEnough = S -> S
                .getService ( ) >= 2;

        /*
         * Same implementation as check() but using Function
         * FI. This make code cleaner and pricely
         * emphasizing business logic. This is a very short
         * code and may not appear that helpful, but
         * consider situation where there are n-finite
         * filters and huge data.
         */
        Function< List< Employee >, List< Employee > > isRatingOkFunction = F -> {
            List< Employee > promoted = new ArrayList<> ( );

            for ( Employee e : F ) {
                if ( isRatingOk.and ( isServiceEnough )
                        .test ( e ) ) {
                    promoted.add ( e );
                }
            }
            return promoted;
        };

        System.out.println (
                isRatingOkFunction.apply ( list ) );

    }

}

/**
 * Employee class to perform operation on.
 */
class Employee {

    Float rating;

    Float service;

    public Employee ( ) {
    }

    public Employee ( Float rating, Float service ) {
        this.rating = rating;
        this.service = service;
    }

    /**
     * @return the rating
     */
    public Float getRating ( ) {
        return rating;
    }

    /**
     * @param rating
     *            the rating to set
     */
    public void setRating ( Float rating ) {
        this.rating = rating;
    }

    /**
     * @return the service
     */
    public Float getService ( ) {
        return service;
    }

    /**
     * @param service
     *            the service to set
     */
    public void setService ( Float service ) {
        this.service = service;
    }

    @Override
    public String toString ( ) {
        return "\nEmployee [rating=" + rating + ", service="
                + service + "]";
    }
}