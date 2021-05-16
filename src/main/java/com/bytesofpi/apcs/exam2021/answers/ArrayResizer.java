package com.bytesofpi.apcs.exam2021.answers;

public class ArrayResizer
    {
    /**
     * Returns true if and only if every value in row r of array2D is non-zero
     * 
     * @param array2D
     * @param r
     * @return
     */
    public static boolean isNonZeroRow( int[][] array2D, int r )
        {
        /* to be implemented in part (a) */
        // Loop through each column value in the row
        for ( int col : array2D[r] )
            {
            // If any are zero, return false right away
            if ( col == 0 ) return false;
            }
        // Otherwise, return true
        return true;
        }

    /**
     * NOT NECESSARY TO FILL, but for testing
     * 
     * @param array2D
     * @return
     */
    public static int numNonZeroRows( int[][] array2D )
        {
        int cnt = 0;
        // loop through each row index
        for ( int i = 0; i < array2D.length; i++ )
            {
            // if row index is non zero, bump up count
            if ( isNonZeroRow( array2D, i ) ) cnt++;
            }
        return cnt;
        }

    /**
     * Returns a new, possibly smaller, 2 dimensional array that contains only rows
     * from array2D with no zeros, as described in part (b)
     * 
     * @param array2D
     * @return
     */
    public static int[][] resize( int[][] array2D )
        {
        /* to be implemented in part (b) */
        int iCnt = 0;
        // Use numNonZeroRows to initialize the number of rows
        // to the correct amount
        int[][] rows = new int[numNonZeroRows( array2D )][];

        // Loop through each row
        for ( int i = 0; i < array2D.length; i++ )
            {
            // If it's a non zero row, add it to the list
            if ( isNonZeroRow( array2D, i ) )
                {
                rows[iCnt++] = array2D[i];
                }

            }
        return rows;
        }
    }
