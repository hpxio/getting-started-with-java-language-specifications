
package com.app.rc.gettingStartedWithJava8.lambdaExpressions.collectionOperations.lists;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortingArrayListCustomClass {

    public static void main ( String[] args ) {
        Employee p, q;
        p = new Employee ( 93, "Adams" );
        q = new Employee ( 89, "Eve" );

        List< Employee > e = new ArrayList<> ( );
        e.add ( p );
        e.add ( q );

        System.out.println ( "Before Sorting: " + e );

        Collections.sort ( e, new EmployeeComparator ( ) );
        System.out.println ( "After Sorting: " + e );
    }

}


class Employee {

    private int id;

    private String name;

    public Employee ( ) {

    }

    public Employee ( int id, String name ) {
        this.id = id;
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId ( ) {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId ( int id ) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName ( ) {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName ( String name ) {
        this.name = name;
    }

    @Override
    public String toString ( ) {
        return "\nEmployee [id=" + id + ", name=" + name
                + "]";
    }
}


class EmployeeComparator implements Comparator< Employee > {

    /**
     * Ascending sorting order
     */
    @Override
    public int compare ( Employee o1, Employee o2 ) {
        return ( o1.getId ( ) < o2.getId ( ) )
                ? ( -1 )
                : ( o1.getId ( ) > o2.getId ( ) ) ? 1 : 0;
    }

}
