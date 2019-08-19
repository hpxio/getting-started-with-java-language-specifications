
package com.app.rc.gettingStartedWithJava8.lambdaExpressions.collectionOperations.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayListUsingLambda {

	public static void main ( String[] args ) {
		List< Integer > roll = new ArrayList<> ( );
		roll.add ( 12 );
		roll.add ( 5 );
		roll.add ( 10 );
		roll.add ( 1 );

		System.out.println ( "Before Sorting::" + roll );

		// Descending Sorting //
		Collections.sort ( roll,
				( p, q ) -> ( p < q )
						? 1
						: ( p > q ) ? ( -1 ) : 0 );

		System.out.println ( "After Sorting::" + roll );
	}

}
