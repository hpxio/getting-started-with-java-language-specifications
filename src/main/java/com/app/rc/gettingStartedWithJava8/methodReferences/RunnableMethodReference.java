
package com.app.rc.gettingStartedWithJava8.methodReferences;


import java.util.function.Consumer;


/**
 * Implement Thread using Method Reference
 * 
 * @author ihspa
 */
public class RunnableMethodReference {

    public static void main ( String[] args ) {

        // Another interesting play //
        Consumer< String > S = System.out::println;
        S.accept ( "Taste this!!" );

        RunnableMethodReference RFR = new RunnableMethodReference ( );
        RFR.threadOperaton ( );

        // OR //
        Runnable R = RFR::readFromSoruce;
        Thread T = new Thread ( R, "T2" );
        T.start ( );
    }

    /**
     * Method references give an opportunity to make the
     * program concise by using the already available code.
     */
    public void threadOperaton ( ) {
       Runnable R = this::readFromSoruce;
        /*
         * Above statement is replacement of Runnable R =
         * new Runnable(){ @Override public void run(){}};
         * or Runnable R = () -> {};
         */
        Thread T = new Thread ( R, "T1" );
        T.start ( );
    }

    public void readFromSoruce ( ) {
        // Do something inside the thread
        System.out.println (
                "I am ReadFromSource()::Thread-"
                + Thread.currentThread ( ).getName ( ) );
    }
}
