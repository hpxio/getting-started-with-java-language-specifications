
package com.app.xio.jls.v8.functionalInterface.supplierInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierWithSets {

    public static void main ( String[] args ) {
        List< String > NAMES = new ArrayList<> ( );
        NAMES.add ( "AADA" );
        NAMES.add ( "ROGS" );
        NAMES.add ( "ZENA" );
        NAMES.add ( "FYUG" );
        NAMES.add ( "NANA" );
        NAMES.add ( "QOIA" );

        Supplier< String > RN = ( ) -> {
            return NAMES.get ( ( int ) ( Math.random ( )
                    * NAMES.size ( ) ) );
        };

        System.out.println ( RN.get ( ) );

    }
}