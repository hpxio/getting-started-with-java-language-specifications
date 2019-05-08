
package com.app.rc.GettingStartedWithJava8.lambdaExpressions.runnableInterface;

public class ThreadUsingLambdaExpressions {

    public static void main ( String[] args ) {
        /* Strictly using Lambda Expressions */
        Runnable r = ( ) -> {
            for ( int i = 0; i < 10; i++ ) {
                System.out.println (
                        Thread.currentThread ( ).getName ( )
                                + " " + i );
                try {
                    Thread.sleep ( 500 );
                } catch ( InterruptedException e ) {
                    e.printStackTrace ( );
                }
            }
        };
        Thread t = new Thread ( r );
        t.start ( );

        /*
         * Strictly using Anonymous Inner Class
         * Implementation
         */
        new Thread ( new Runnable ( ) {

            @Override
            public void run ( ) {
                for ( int i = 0; i < 10; i++ ) {
                    System.out.println ( Thread
                            .currentThread ( ).getName ( )
                            + " " + i );
                    try {
                        Thread.sleep ( 500 );
                    } catch ( InterruptedException e ) {
                        e.printStackTrace ( );
                    }
                }
            }
        } ).start ( );
    }
}
