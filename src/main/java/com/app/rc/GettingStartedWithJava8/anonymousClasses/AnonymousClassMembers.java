
package com.app.rc.GettingStartedWithJava8.anonymousClasses;

/**
 * Functional Interface, whose implementation will be given
 * by Anonymous Inner Class
 * 
 * @author ihspa
 */
interface IYou {

    public void print ( );
}


/**
 * Main class implementation which shows how the variables
 * scopes are defined for Anonymous Inner Class
 * 
 * @author ihspa
 */
public class AnonymousClassMembers {

    private static int x = 888;

    // Implementing FI using Anonymous Inner Class.
    private static IYou i = new IYou ( ) {

        int x = 999;

        @Override
        public void print ( ) {
            System.out.println ( "A" + x ); // 999
            System.out.println ( "B" + this.x ); // 999
            System.out.println (
                    "C" + AnonymousClassMembers.x ); // 888
        }
    };

    // Same implementation using LE //
    private static IYou t = ( ) -> {
        int x = 777;
        System.out.println ( "E" + x ); // 777
    };

    public static void main ( String[] args ) {

        i.print ( );
        t.print ( );
        System.out.println ( "D" + x ); // 888
    }

}
