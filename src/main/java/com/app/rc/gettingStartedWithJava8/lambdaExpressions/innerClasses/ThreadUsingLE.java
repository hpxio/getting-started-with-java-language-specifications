
package com.app.rc.gettingStartedWithJava8.lambdaExpressions.innerClasses;

/**
 * Wherever there is Anonymous Inner class present, there
 * may be a possibility
 * to replace it with a LE. It improves readability of the
 * code and makes code
 * precise.
 * 
 * @author ihspa
 */
public class ThreadUsingLE {

    // Strictly using LE //
    public static void main ( String[] args ) {
        Thread t = new Thread ( ( ) -> {
            for ( int i = 0; i < 5; i++ ) {
                System.out.println ( i );
                try {
                    Thread.sleep ( 250 );
                } catch ( InterruptedException e ) {
                    e.printStackTrace ( );
                }
            }
        } );
        t.start ( );
    }
}
