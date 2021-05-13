
package com.app.xio.jls.v8.functionalInterface.supplierInterface;

import java.util.Date;
import java.util.function.Supplier;

public class SimpleSupplierOperation {

    public static void main ( String[] args ) {

        Supplier< Date > DT = ( ) -> new Date ( );
        Supplier< Integer > OTP = ( ) -> ( int ) ( Math
                .random ( ) ) + 1;

        System.out.println ( DT.get ( ) );
        System.out.println ( OTP.get ( ) );
    }
}