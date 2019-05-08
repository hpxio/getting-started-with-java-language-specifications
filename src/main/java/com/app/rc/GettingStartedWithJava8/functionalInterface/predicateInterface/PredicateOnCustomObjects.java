
package com.app.rc.GettingStartedWithJava8.functionalInterface.predicateInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateOnCustomObjects {

    public static < T > void check ( Predicate< T > p,
            Collection< T > c ) {
        for ( T t : c ) {
            if ( p.test ( t ) ) {
                System.out.println ( t );
            }
        }
    }

    public static void main ( String[] args ) {
        Employee E1 = new Employee ( 1, 24, true, 23000 );
        Employee E5 = new Employee ( 5, 33, false, 67000 );
        Employee E2 = new Employee ( 2, 28, true, 50000 );
        Employee E3 = new Employee ( 3, 25, false, 28000 );
        Employee E4 = new Employee ( 4, 29, true, 50000 );
        List< Employee > list = new ArrayList<> ( );
        list.add ( E1 );
        list.add ( E2 );
        list.add ( E3 );
        list.add ( E4 );
        list.add ( E5 );
        for ( Employee e : list ) {
            System.out.println ( e );
        }
        // Get all employees who are older than 28 years //
        Predicate< Employee > gtAge28 = E -> E
                .getAge ( ) >= 28;
        System.out
                .println ( "\nEmployees Greater Than 28" );
        check ( gtAge28, list );
        // Get all the employeed who are older than 28 and
        // earn more than 50k //
        System.out.println (
                "\nEmployees Greater than 28 and Earn more than 50K" );
        check ( gtAge28.and (
                E -> E.getSalary ( ) > 50000 ), list );
        // Get all the employees who are female //
        Predicate< Employee > isMale = F -> F.isGender ( );
        System.out.println ( "\nEmployees who are Female" );
        check ( isMale.negate ( ), list );
        // Get all the employee who are not female or earn
        // more than 30k //
        System.out.println (
                "\nEmployees who are either Male or Earn More than 30K" );
        check ( isMale.or ( D -> D.getSalary ( ) >= 30000 ),
                list );
    }
}
class Employee {

    private Integer id;
    private int age;
    private int salary;
    // True == Male
    private boolean gender;

    public Employee ( ) {
    }

    public Employee ( int id, int age, boolean gender,
            int salary ) {
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    @Override
    public String toString ( ) {
        return "Employee [age=" + age + ", gender=" + gender
                + ", id=" + id + ", salary=" + salary + "]";
    }

    /**
     * @return the id
     */
    public Integer getId ( ) {
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
     * @return the age
     */
    public int getAge ( ) {
        return age;
    }

    /**
     * @param age
     *            the age to set
     */
    public void setAge ( int age ) {
        this.age = age;
    }

    /**
     * @return the salary
     */
    public int getSalary ( ) {
        return salary;
    }

    /**
     * @param salary
     *            the salary to set
     */
    public void setSalary ( int salary ) {
        this.salary = salary;
    }

    /**
     * @return the gender
     */
    public boolean isGender ( ) {
        return gender;
    }

    /**
     * @param gender
     *            the gender to set
     */
    public void setGender ( boolean gender ) {
        this.gender = gender;
    }
}