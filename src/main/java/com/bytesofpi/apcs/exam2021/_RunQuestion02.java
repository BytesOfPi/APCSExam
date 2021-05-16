package com.bytesofpi.apcs.exam2021;

public class _RunQuestion02
    {

    public static void main( String[] args )
        {

        runPartA();

        }

    public static void runPartA()
        {
        System.out.println( "------------------------------------------------------" );
        System.out.println( "Question 2" );

        SingleTable t1 = new SingleTable( 4, 74, 60.0 );
        SingleTable t2 = new SingleTable( 8, 74, 70.0 );
        SingleTable t3 = new SingleTable( 12, 76, 75.0 );

        CombinedTable c1 = new CombinedTable( t1, t2 );
        printCanSeat( c1, 9 );
        printCanSeat( c1, 11 );
        printDesire( c1 );
        CombinedTable c2 = new CombinedTable( t2, t3 );
        printCanSeat( c2, 18 );
        printDesire( c2 );
        t2.setViewQuality( 80 );
        printDesire( c2 );
        }

    public static void printCanSeat( CombinedTable c1, int guests )
        {
        System.out.println( String.format( "    Can seat [%d] Val [%b] ", guests, c1.canSeat( guests ) ) );
        }

    public static void printDesire( CombinedTable c1 )
        {
        System.out.println( String.format( "        Desireable [%.2f] ", c1.getDesireability() ) );
        }

    }
