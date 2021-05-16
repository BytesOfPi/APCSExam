package com.bytesofpi.apcs.exam2021.answers;

import java.util.ArrayList;

public class ClubMembers
    {
    private ArrayList<MemberInfo> memberList;

    /**
     * Adds new club members to memberList, as described in part (a)
     * 
     * @param names
     * @param gradYear
     */
    public void addMembers( String[] names, int gradYear )
        {
        /* to be implemented in part (a) */
        // Loop through names and add
        for ( String name : names )
            {
            memberList.add( new MemberInfo( name, gradYear, true ) );
            }
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
        ArrayList<MemberInfo> grads = new ArrayList<>();

        // Loop through members backwards (so we don't get out
        // of order when we remove)
        for ( int i = memberList.size() - 1; i >= 0; i-- )
            {
            // If grad year is lower than specified year...
            MemberInfo m = memberList.get( i );
            if ( m.getGradYear() <= year )
                {
                // remove from members
                memberList.remove( i );
                // add to short list if in good standing
                if ( m.isInGoodStanding() ) grads.add( m );
                }
            }
        return grads;
        }
    }
