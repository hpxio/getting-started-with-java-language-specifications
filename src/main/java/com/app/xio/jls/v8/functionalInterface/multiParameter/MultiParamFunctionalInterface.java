package com.app.xio.jls.v8.functionalInterface.multiParameter;
public class MultiParamFunctionalInterface {

    public static void main (
            String[] args )
    {
        IMultiParamFunctionalInterface impl = s -> s.length ( );

        System.out.println (
                impl.print (
                        "Ghoul" ) );
    }
}
