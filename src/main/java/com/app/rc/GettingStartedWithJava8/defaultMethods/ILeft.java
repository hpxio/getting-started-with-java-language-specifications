package com.app.rc.GettingStartedWithJava8.defaultMethods;


public interface ILeft {

    default void print ( ) {
        System.out.println ( "I am Left" );
    }

}
