package com.bytesofpi.apcs.exam2021.answers;

public class WordMatch
    {

    private String secret;

    public WordMatch( String secret )
        {
        super();
        this.secret = secret;
        }

    /**
     * Returns the better of two guesses, as determined by scoreGuess and the rules
     * for a tie-breaker that are described in part (b)
     *
     * Preconditions: guess1 and guess2 contain all lowercase letters guess1 is not
     * the same as guess2
     *
     * @param guess1
     * @param guess2
     * @return
     */
    public String findBetterGuess( String guess1, String guess2 )
        {
        /* To be implemented in part (b) */
        int score1 = scoreGuess( guess1 );
        int score2 = scoreGuess( guess2 );
        // return the guess with higher score
        if ( score1 > score2 ) return guess1;
        if ( score2 > score1 ) return guess2;
        // Otherwise, return alphabetically largest
        return guess1.compareTo( guess2 ) > 0 ? guess1 : guess2;
        }

    /**
     * Returns the score for guess, as described in part (a)
     *
     * Preconditions: 0 < guess.length() <= secret.length()
     *
     * @param guess1
     * @param guess2
     * @return
     */
    public int scoreGuess( String guess )
        {
        /* To be implemented in part (a) */
        int len = guess.length();
        int cnt = 0;
        int start = 0;
        // While position is not -1 and search start has not
        // exceeded secret length
        while ( start >= 0 && start < secret.length() )
            {
            // get the position of next found
            start = secret.indexOf( guess, start );
            // if it's found, bump counter and point
            // to next search position
            if ( start >= 0 )
                {
                cnt++;
                start++;
                }
            }

        // Return the counter times guess length ^2
        return cnt * len * len;
        }

    }
