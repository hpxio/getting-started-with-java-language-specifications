
package com.app.xio.jls.v8.lambdaExpressions.collectionOperations.lists;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * List interface is useful when -You may add duplicate
 * values -You may want to
 * maintain insertion order
 * 
 * @author ihspa
 */
public class SortingArrayList {

    public static void main ( String[] args ) {
        List< Integer > roll = new ArrayList< Integer > ( );
        roll.add ( 10 );
        roll.add ( 12 );
        roll.add ( 5 );
        roll.add ( 8 );
        roll.add ( 21 );

        System.out.println ( "Before Sorting::" + roll );

        // For Descending //
        Collections.sort ( roll, new myComparator ( ) );
        System.out
                .println ( "Descending Sorting::" + roll );

        // OR for Ascending //
        Collections.sort ( roll, new CompareInteger ( ) );
        System.out.println ( "Ascending Sorting::" + roll );
    }
}


/**
 * Descending order sorting implementation. Using
 * traditional approach by using
 * Comparator interface.
 * 
 * @author ihspa
 */
class myComparator implements Comparator< Integer > {

    @Override
    public int compare ( Integer arg0, Integer arg1 ) {
        return ( ( arg0 < arg1 )
                ? 1
                : ( arg0 > arg1 ) ? ( -1 ) : 0 );
    }
}


/**
 * Following implementation is possible only for the Wrapper
 * type classes.
 * 
 * @author ihspa
 */
class CompareInteger implements Comparator< Integer > {

    @Override
    public int compare ( Integer I, Integer U ) {
        return I.compareTo ( U );
    }
}