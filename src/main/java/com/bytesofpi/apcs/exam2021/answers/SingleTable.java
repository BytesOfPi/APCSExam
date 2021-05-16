package com.bytesofpi.apcs.exam2021.answers;

public class SingleTable
    {
    private int numSeats;

    private int height;

    private double quality;

    public SingleTable( int numSeats, int height, double quality )
        {
        super();
        this.numSeats = numSeats;
        this.height = height;
        this.quality = quality;
        }

    public int getHeight()
        {
        return height;
        }

    public int getNumSeats()
        {
        return numSeats;
        }

    public double getViewQuality()
        {
        return quality;
        }

    public void setHeight( int height )
        {
        this.height = height;
        }

    public void setNumSeats( int numSeats )
        {
        this.numSeats = numSeats;
        }

    public void setViewQuality( double quality )
        {
        this.quality = quality;
        }

    }
