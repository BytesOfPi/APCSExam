package com.bytesofpi.apcs.exam2021;

import java.util.ArrayList;

public class _RunQuestion03
    {
    private static ClubMembers cm = new ClubMembers();

    public static void main( String[] args )
        {

        runPartA();

        runPartB();

        }

    public static void runPartA()
        {
        System.out.println( "------------------------------------------------------" );
        System.out.println( "Question 3 (a)" );

        cm.addMembers( new String[] { "Xin, Michael" }, 2017 );
        cm.addMembers( new String[] { "Fox, Steve" }, 2018 );
        cm.addMembers( new String[] { "Smith, Jane" }, 2019 );
        cm.addMembers( new String[] { "Garcia, Maria" }, 2020 );
        cm.printMembers();
        }

    private static void runPartB()
        {
        System.out.println( "------------------------------------------------------" );
        System.out.println( "Question 3 (b)" );

        cm.getYearMember( 2019 ).setInGoodStanding( false );
        cm.getYearMember( 2017 ).setInGoodStanding( false );
        System.out.println( "Show all members before" );
        cm.printMembers();

        ArrayList<MemberInfo> list = cm.removeMembers( 2018 );
        System.out.println( "Show all members after" );
        cm.printMembers();
        System.out.println( "Returned list" );
        for ( MemberInfo mi : list )
            {
            System.out.println( "    " + mi );
            }

        }

    }
