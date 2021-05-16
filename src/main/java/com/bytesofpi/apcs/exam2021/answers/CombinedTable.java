package com.bytesofpi.apcs.exam2021.answers;

import com.bytesofpi.apcs.exam2021.SingleTable;

public class CombinedTable
    {
    private SingleTable s1;
    private SingleTable s2;

    /**
     * Constructor. Initialize 2 tables
     * 
     * @param s1
     * @param s2
     */
    public CombinedTable( SingleTable s1, SingleTable s2 )
        {
        super();
        this.s1 = s1;
        this.s2 = s2;
        }

    /**
     * Discover if the table has enough seats to fit num
     * 
     * @param num
     * @return
     */
    public boolean canSeat( int num )
        {
        // Total seats = sum of both tables minus 2
        int totSeats = s1.getNumSeats() + s2.getNumSeats() - 2;
        // If the total seats is greater or equal to num, return true
        return totSeats >= num;
        }

    /**
     * Calculate desirability of table
     * 
     * @return
     */
    public double getDesireability()
        {
        // get the average quality of both tables
        double avg = (s1.getViewQuality() + s2.getViewQuality()) / 2.0;
        // if height is not the same, subtract 10 from final value
        return (s1.getHeight() == s2.getHeight()) ? avg : avg - 10;
        }
    }
