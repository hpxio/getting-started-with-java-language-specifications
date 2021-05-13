package com.app.xio.jls.v8.lambdaExpressions.collectionOperations.maps;

import java.util.Map;
import java.util.TreeMap;

/**
 * Sorting of data using a HashMap is not possible because it does not contain
 * the implementation for HashMap<K,V>. Hence, to store a data in sorted hash
 * map format we use TreeMap. Maps are useful if; - You don't need to maintain
 * the insertion order - You don't want to put duplicate values - You don't want
 * null keys (however repeated null values are allowed) - You need to keep a
 * mapping pair of key and values.
 * 
 * For sorted values of Maps we use TreeMap. The default scheme for TreeMap is
 * always - - For Integer is Ascending Order - For Strings is Alphabetical. Also
 * sorting is done on the basis of key and not the values.
 * 
 * @author ihspa
 *
 */
public class SortingTreeMapUsingLambda {
	public static void main(String[] args) {

		// This creates a Descending ordered sorting of values //
		Map<Integer, String> m = new TreeMap<Integer, String>(
				(p, q) -> (p > q) ? (-1) : (p < q) ? 1 : 0);

		m.put(19, "Adams");
		m.put(32, "Eve");
		m.put(3, "Zoe");
		m.put(49, "Zar");
		m.put(95, "Tor");

		System.out.println(m);
	}
}
