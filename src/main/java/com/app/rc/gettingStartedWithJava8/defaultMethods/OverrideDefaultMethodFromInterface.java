
package com.app.rc.gettingStartedWithJava8.defaultMethods;

public class OverrideDefaultMethodFromInterface {

    public static void main ( String[] args ) {
        IDefaultMethodInInterface d = new IDefaultMethodInInterface ( ) {

            @Override
            public void print ( ) {
                System.out.println (
                        "Override::Default-Method" );
            }
        };
        d.print ( );
    }

}
