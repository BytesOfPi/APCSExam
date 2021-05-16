package com.bytesofpi.apcs.exam2021;

public class MemberInfo
    {
    private String name;
    private int gradYear;
    private boolean inGoodStanding;

    public MemberInfo( String name, int gradYear, boolean inGoodStanding )
        {
        super();
        this.name = name;
        this.gradYear = gradYear;
        this.inGoodStanding = inGoodStanding;
        }

    public int getGradYear()
        {
        return gradYear;
        }

    public String getName()
        {
        return name;
        }

    public boolean isInGoodStanding()
        {
        return inGoodStanding;
        }

    public void setGradYear( int gradYear )
        {
        this.gradYear = gradYear;
        }

    public void setInGoodStanding( boolean inGoodStanding )
        {
        this.inGoodStanding = inGoodStanding;
        }

    public void setName( String name )
        {
        this.name = name;
        }

    @Override
    public String toString()
        {
        return String.format( "[%s][%d][%b]", name, gradYear, inGoodStanding );
        }
    }
