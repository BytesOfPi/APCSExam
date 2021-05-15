package com.bytesofpi.apcs.exam2021;

public class _RunQuestion03
    {

    public static void main( String[] args )
        {

        runPartA();

        runPartB();

        }

    public static void runPartA()
        {
        System.out.println( "------------------------------------------------------" );
        System.out.println( "Question 1 (a)" );
        System.out.println();
        WordMatch wm = new WordMatch( "mississippi" );
        printQ1( "i", wm );
        printQ1( "iss", wm );
        printQ1( "issipp", wm );
        printQ1( "mississippi", wm );

        WordMatch game = new WordMatch( "aaaabb" );
        printQ1( "a", game );
        printQ1( "aa", game );
        printQ1( "aaa", game );
        printQ1( "aabb", game );
        printQ1( "c", game );
        }

    public static void printQ1( String guess, WordMatch wm )
        {
        System.out.println( String.format( "Guess [%s] Val [%d] ", guess, wm.scoreGuess( guess ) ) );
        }

    private static void runPartB()
        {
        System.out.println( "------------------------------------------------------" );
        System.out.println( "Question 1 (b)" );
        System.out.println();
        WordMatch game = new WordMatch( "concatenation" );

        printQ2( "ten", "nation", game );
        printQ2( "con", "cat", game );

        System.out.println();

        }

    public static void printQ2( String guess1, String guess2, WordMatch wm )
        {
        System.out.println(
                String.format( "Guess1 Score [%s][%d] Guess1 Score [%s][%d] Best [%s] ",
                        guess1, wm.scoreGuess( guess1 ),
                        guess2, wm.scoreGuess( guess2 ),
                        wm.findBetterGuess( guess1, guess2 ) ) );
        }

    }
