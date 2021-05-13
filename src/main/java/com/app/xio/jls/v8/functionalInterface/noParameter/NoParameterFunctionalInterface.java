package com.app.xio.jls.v8.functionalInterface.noParameter;
public class NoParameterFunctionalInterface {

    public static void main (
            String[] args )
    {
        INoParameterFunctionalInterface impl = ( ) -> System.out.println (
                "Hello World..." );
        impl.print ( );
    }
}
