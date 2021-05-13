
package com.app.xio.jls.v8.defaultMethods;

public interface IDefaultMethodInInterface {

    /*
     * Default here is not the modifier but a keyword to
     * denote the following method is a concrete method and
     * whose implementation can be modified by overriding
     * later.
     */
    default void print ( ) {
        System.out.println ( "Interface::Default-Method" );
    }
}
