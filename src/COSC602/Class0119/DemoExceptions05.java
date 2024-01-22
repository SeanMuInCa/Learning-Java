package COSC602.Class0119;

import java.util.Scanner;


/* DemoExceptions05.java */
public class DemoExceptions05
{
    public static void main( String[] args )
    {
        boolean keepGoing = true;

        while ( keepGoing )
        {
            try
            {
                System.out.println( "\nIn main() try block." );
                chooseStructure();
            }
            catch ( Exception e )
            {
                System.out.println( "Exception caught in main(): "
                        + e );
            }
            char choice = promptForChoice( "Back in main().\n\n"
                    + "Try again? (Y/N) ", "YyNn" );
            keepGoing = Character.toUpperCase( choice ) == 'Y';
        }
    }

    private static void chooseStructure()
            throws ExA, ExB, ExC, ExD, ExZ
    {
        char choice = promptForChoice(
                "\nWhich type of code structure?\n"
                        + "1. No exception handling\n2. try/catch\n"
                        + "3. try/catch/finally\n4. try/finally\n"
                        + "Enter choice (1/2/3/4): ", "1234" );
        switch ( choice )
        {
            case '1':
                demoNoTry();
                break;
            case '2':
                demoTryCatch();
                break;
            case '3':
                demoTryCatchFinally();
                break;
            case '4':
                demoTryFinally();
                break;
        }
    }

    private static void demoNoTry() throws ExA, ExB, ExZ
    {
        System.out.println( "\nDemonstating structure with no try." );
        statement01();
        statement02();
    }

    private static void demoTryCatch() throws ExA, ExB, ExC, ExZ
    {
        System.out.println( "\nDemonstating try/catch structure." );
        try
        {
            statement01();  // may throw ExA, ExB or ExZ
            statement02();
        }
        catch ( ExA e )
        {
            statement03();  // may throw ExB or ExC
            statement04();
        }
        catch ( ExB e )
        {
            statement05();
            statement06();
        }
        statement09();
    }

    private static void demoTryCatchFinally()
            throws ExA, ExB, ExC, ExD, ExZ
    {
        System.out.println(
                "\nDemonstating try/catch/finally structure." );
        try
        {
            statement01();  // may throw ExA, ExB or ExZ
            statement02();
        }
        catch ( ExA e )
        {
            statement03();  // may throw ExB or ExC
            statement04();
        }
        catch ( ExB e )
        {
            statement05();
            statement06();
        }
        finally
        {
            statement07();  // may throw ExD
            statement08();
        }
        statement09();
    }

    private static void demoTryFinally() throws ExA, ExB, ExD, ExZ
    {
        System.out.println( "\nDemonstating try/finally structure." );
        try
        {
            statement01();  // may throw ExA, ExB or ExZ
            statement02();
        }
        finally
        {
            statement07();  // may throw ExD
            statement08();
        }
        statement09();
    }

    private static void statement01() throws ExA, ExB, ExZ
    {
        System.out.println( "\nIn statement01()" );
        char choice = promptForChoice( "What do you want to do:\n"
                + "1. No exception\n2. throw ExA\n3. throw ExB\n"
                + "4. throw ExZ\nYour choice (1/2/3/4): ", "1234" );
        switch ( choice )
        {
            case '1':
                break;
            case '2':
                throw new ExA( "ExA thrown from statement01" );
            case '3':
                throw new ExB( "ExB thrown from statement01" );
            case '4':
                throw new ExZ( "ExZ thrown from statement01" );
        }
    }

    private static void statement02()
    {
        System.out.println( "In statement02()" );
    }

    private static void statement03() throws ExB, ExC
    {
        System.out.println( "\nIn statement03()" );
        char choice = promptForChoice( "What do you want to do:\n"
                + "1. No exception\n2. throw ExB\n3. throw ExC\n"
                + "Your choice (1/2/3): ", "123" );
        switch ( choice )
        {
            case '1':
                break;
            case '2':
                throw new ExB( "ExB thrown from statement03" );
            case '3':
                throw new ExC( "ExC thrown from statement03" );
        }
    }

    private static void statement04()
    {
        System.out.println( "In statement04()" );
    }

    private static void statement05()
    {
        System.out.println( "In statement05()" );
    }

    private static void statement06()
    {
        System.out.println( "In statement06()" );
    }

    private static void statement07() throws ExD
    {
        System.out.println( "\nIn statement07()" );
        char choice = promptForChoice( "What do you want to do:\n"
                + "1. No exception\n2. throw ExD\n"
                + "Your choice (1/2): ", "12" );
        switch ( choice )
        {
            case '1':
                break;
            case '2':
                throw new ExD( "ExD thrown from statement07" );
        }
    }

    private static void statement08()
    {
        System.out.println( "In statement08()" );
    }

    private static void statement09()
    {
        System.out.println( "In statement09()" );
    }

    public static char promptForChoice( String prompt, String choices )
    {
        Scanner input = new Scanner( System.in );
        boolean match = false;
        String line = null;
        while ( !match )
        {
            System.out.println( prompt );
            line = input.next().trim();
            for ( int i = 0; i < choices.length() && !match; i++ )
            {
                match = choices.substring( i, i + 1 ).equals( line );
            }
            if ( !match )
            {
                System.out.println( "\"" + line
                        + "\" is an invalid choice. "
                        + "Use one of " + choices + "." );
            }
        }
        return line.charAt( 0 );
    }

    public static class ExA extends Exception

    {
        public ExA()
        {
            super( "ExA exception" );
        }

        public ExA( String msg )
        {
            super( msg );
        }
    }

    public static class ExB extends Exception
    {
        public ExB()
        {
            super( "ExB exception" );
        }

        public ExB( String msg )
        {
            super( msg );
        }
    }

    public static class ExC extends Exception
    {
        public ExC()
        {
            super( "ExC exception" );
        }

        public ExC( String msg )
        {
            super( msg );
        }
    }

    public static class ExD extends Exception
    {
        public ExD()
        {
            super( "ExD exception" );
        }

        public ExD( String msg )
        {
            super( msg );
        }
    }

    public static class ExZ extends Exception
    {
        public ExZ()
        {
            super( "ExZ exception" );
        }

        public ExZ( String msg )
        {
            super( msg );
        }
    }
}
