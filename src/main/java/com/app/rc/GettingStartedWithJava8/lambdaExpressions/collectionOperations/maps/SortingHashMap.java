
package com.app.rc.GettingStartedWithJava8.lambdaExpressions.collectionOperations.maps;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


/**
 * Sorting of data using a HashMap is not possible because
 * it does not contain
 * the implementation of sort for HashMap<K,V>. Hence, to
 * store a data in sorted hash
 * map format we use TreeMap. Maps are useful if; - You
 * don't need to maintain
 * the insertion order - You don't want to put duplicate
 * values - You don't want
 * null keys (however repeated null values are allowed) -
 * You need to keep a
 * mapping pair of key and values.
 * Other ways to do this is to pick up the EntrySet and sort
 * them separately. But this will not effect/change the
 * original data structure.
 * 
 * @author ihspa
 */
public class SortingHashMap {

    public static void main ( String[] args ) {
        Map< Integer, String > m = new HashMap< Integer, String > ( );

        m.put ( 19, "Adams" );
        m.put ( 32, "Eve" );
        m.put ( 3, "Zoe" );
        m.put ( 49, "Zar" );
        m.put ( 95, "Tor" );

        System.out.println ( m );

        // Get Set of all entry pair and apply sorting //
        Set< Entry< Integer, String > > entries = m
                .entrySet ( );
        System.out.println ( entries );
    }
}
