package com.app.rc.gettingStartedWithJava8.defaultMethods;


public interface IRight {

    default void print ( ) {
        System.out.println ( "I am Right" );
    }
}
