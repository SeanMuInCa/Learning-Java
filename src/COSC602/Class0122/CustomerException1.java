package COSC602.Class0122;

import java.util.Scanner;


public class CustomerException1
{
    private double result;

    private final static char ADD_OP = '+';
    private final static char SUB_OP = '-';
    private final static char MUL_OP = '*';
    private final static char DIV_OP = '/';

    private final static String CLEAR_CMD = "C";
    private final static String QUIT_CMD = "Q";

    private final static String PROMPT = "Enter [NUMBER] [OP] "
            + "or [C] to clear or [Q] to quit: ";

    public CustomerException1()
    {
        result = 0.0;
    }

    public void processKeyboardInput() throws IllegalArgumentException
    {
        Scanner input = new Scanner( System.in );
        boolean keepGoing = true;
        while ( keepGoing )
        {
            displayResult();
            System.out.println( PROMPT );
            String line = input.nextLine();
            int index = line.indexOf(' ');
            if(index != line.length() - 2 || !(line.charAt(0) < 9) || !line.endsWith(String.valueOf(ADD_OP)) || !line.endsWith(String.valueOf(SUB_OP)) || !line.endsWith(String.valueOf(MUL_OP)) || !line.endsWith(String.valueOf(DIV_OP)))
            {
                throw new IllegalArgumentException("wrong argument");
            }
            try
            {

                keepGoing = processLine( line );
            }catch (IllegalOperatorException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    public boolean processLine( String line ) throws IllegalOperatorException
    {
        boolean doCalc = true;
        line = line.trim().toUpperCase();
        if ( line.equals( QUIT_CMD ) )
        {
            doCalc = false;
        }
        else if ( line.equals( CLEAR_CMD ) )
        {
            result = 0.0;
        }
        else
        {
            int spacePos = line.indexOf( ' ' );
            String numString = line.substring( 0, spacePos );
            double operand = Double.parseDouble( numString );
            String opString = line.substring( spacePos ).trim();
            char operator = opString.trim().charAt( 0 );
            calculate( operand, operator );
            /*try
            {
                int spacePos = line.indexOf( ' ' );
                String numString = line.substring( 0, spacePos );
                double operand = Double.parseDouble( numString );
                String opString = line.substring( spacePos ).trim();
                char operator = opString.trim().charAt( 0 );
                calculate( operand, operator );
            }catch (IllegalOperatorException e){
                System.out.println(e.getMessage());
            }*/
        }
        return doCalc;
    }

    public void calculate( double operand, char operator ) throws IllegalOperatorException
    {
        switch ( operator )
        {
            case ADD_OP:
                result += operand;
                break;
            case SUB_OP:
                result -= operand;
                break;
            case MUL_OP:
                result *= operand;
                break;
            case DIV_OP:
                result /= operand;
                break;
            default:
                throw new IllegalOperatorException("wrong operator sign");
        }
    }

    public void displayResult()
    {
        System.out.println( "Result is: " + result );
    }

    public double getResult()
    {
        return result;
    }

    public static void main( String[] args )
    {
        CustomerException1 calc = new CustomerException1();
        try
        {
            calc.processKeyboardInput();
        }catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}