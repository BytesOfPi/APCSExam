package com.bytesofpi.apcs.exam2021;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _RunQuestion04
    {

    public static void main( String[] args )
        {

        runPartA();

        runPartB();

        }

    public static void runPartA()
        {
        System.out.println( "------------------------------------------------------" );
        System.out.println( "Question 4 (a)" );
        int[][] arr = { { 2, 1, 0 },
                { 1, 3, 2 },
                { 0, 0, 0 },
                { 4, 5, 6 } };
        printQ1( arr, 0 );
        printQ1( arr, 1 );
        printQ1( arr, 2 );
        printQ1( arr, 3 );

        }

    public static void printQ1( int[][] arr, int row )
        {
        System.out.println( String.format( "Is row [%s] nonzero? [%b] ",
                row,
                ArrayResizer.isNonZeroRow( arr, row ) ) );
        }

    private static void runPartB()
        {
        System.out.println( "------------------------------------------------------" );
        System.out.println( "Question 4 (b)" );
        int[][] arr = { { 2, 1, 0 },
                { 1, 3, 2 },
                { 0, 0, 0 },
                { 4, 5, 6 } };
        int[][] smaller = ArrayResizer.resize( arr );
        printQ2( smaller );

        }

    public static void printQ2( int[][] arr2D )
        {
        System.out.println( Arrays.stream( arr2D )
                .map( arr1D -> new StringBuilder( "    [" )
                        .append( flat1D( arr1D ) )
                        .append( "]" )
                        .toString() )
                .collect( Collectors.joining( "\n" ) ) );
        }

    public static String flat1D( int[] arr1D )
        {
        return Arrays.stream( arr1D )
                .mapToObj( String::valueOf )
                .collect( Collectors.joining( "," ) );
        }

    }
