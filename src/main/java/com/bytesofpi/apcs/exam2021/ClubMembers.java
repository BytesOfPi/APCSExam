package com.bytesofpi.apcs.exam2021;

import java.util.ArrayList;

public class ClubMembers
    {
    private ArrayList<MemberInfo> memberList = new ArrayList<>();

    /**
     * Adds new club members to memberList, as described in part (a)
     * 
     * @param names
     * @param gradYear
     */
    public void addMembers( String[] names, int gradYear )
        {
        /* to be implemented in part (a) */
        }

    /**
     * Removes members who have graduated and returns a list of members who have
     * graduated and are in good standing, as described in part (b)
     * 
     * @param year
     * @return
     */
    public ArrayList<MemberInfo> removeMembers( int year )
        {
        /* to be implemented in part (b) */
        return null; // TODO: Replace with actual
        }

    /**
     * NOT NECESSARY TO FILL, but for testing
     */
    public void printMembers()
        {
        memberList.stream()
                .forEach( m -> System.out.println( "    " + m ) );
        }

    /**
     * NOT NECESSARY TO FILL, but for testing
     */
    public MemberInfo getYearMember( int year )
        {
        return memberList.stream()
                .filter( mi -> mi.getGradYear() == year )
                .findFirst().orElse( null );
        }
    }