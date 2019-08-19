
package com.app.rc.gettingStartedWithJava8.defaultMethods;

public class DefaultMethodInInterface {

    /*
     * Using default implementation from the Interface
     * itself. Here, since single method was present we can
     * use it in this format as well.
     */
    public static void main ( String[] args ) {
        new IDefaultMethodInInterface ( ) {
        }.print ( );
    }
}
