package com.bytesofpi.apcs.exam2021;

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

        return ""; // TODO: Replace with actual
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

        return 0; // TODO: Replace with actual
        }

    }
