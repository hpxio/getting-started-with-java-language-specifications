package com.app.xio.jls.v8.lambdaExpressions.collectionOperations.sets;

import java.util.Set;
import java.util.TreeSet;

/**
 * Sets are useful in situation where -You need to have non-duplicate values
 * only -Atleast one value can be NULL -Insertion Order is not necessary
 * 
 * @author ihspa
 *
 */
public class SortingTreeSetUsingLambda {

	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<Integer>((p, q) -> (p > q) ? (-1) : (p < q) ? 1 : 0);
		s.add(12);
		s.add(30);
		s.add(23);
		s.add(45);

		System.out.println("Before Sorting" + s);
	}
}
