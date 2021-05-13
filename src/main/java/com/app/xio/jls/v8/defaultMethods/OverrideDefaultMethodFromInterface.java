
package com.app.xio.jls.v8.defaultMethods;

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
