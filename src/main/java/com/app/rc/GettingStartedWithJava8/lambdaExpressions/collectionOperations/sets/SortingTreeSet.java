package com.app.rc.GettingStartedWithJava8.lambdaExpressions.collectionOperations.sets;

import java.util.Set;
import java.util.TreeSet;

/**
 * Sets are useful in situation where -You need to have non-duplicate values
 * only -Atleast one value can be NULL -Insertion Order is not necessary
 * 
 * @author ihspa
 *
 */
public class SortingTreeSet {

	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<Integer>();
		s.add(12);
		s.add(30);
		s.add(23);
		s.add(45);

		/*
		 * Default sorting order for TreeSet (until specified) is: - For Integer
		 * - Ascending - For String - Alphabetical Because it is a Tree, the
		 * data is always sorted by default.
		 */
		System.out.println("Before Sorting" + s);
	}
}
