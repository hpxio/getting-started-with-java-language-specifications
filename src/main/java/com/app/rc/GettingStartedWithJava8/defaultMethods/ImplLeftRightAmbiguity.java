
package com.app.rc.GettingStartedWithJava8.defaultMethods;

public class ImplLeftRightAmbiguity extends AbstractCentre
        implements
            ILeft,
            IRight {

    @Override
    public void print ( ) {
        // One way to avoid ambiguity is to write your own
        // implementation

        // OR //
        // Specify which implementation to use
        ILeft.super.print ( );

        /*
         * Above will not come in Abstract classes as you
         * can only use single class when trying to apply
         * Multiple Inheritance, but multiple Interfaces can
         * be used. Before default methods this problem
         * would not arise as there were no facilities to
         * define a concrete methods in interfaces.
         */
    }

    public static void main ( String[] args ) {
        ImplLeftRightAmbiguity a = new ImplLeftRightAmbiguity ( );
        a.print ( );
    }
}
