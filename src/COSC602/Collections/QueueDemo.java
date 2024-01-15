package COSC602.Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class QueueDemo
{
    private Scanner input = new Scanner( System.in );
    private LinkedList lineUp;
    public QueueDemo()
    {
        lineUp = new LinkedList();
        demonstrateLineUp();
    }
    private void demonstrateLineUp()
    {
        char choice = 'a';
        while( choice != 'e' )
        {
            displayMenu();
            choice = getValidCharacter( "arsve" );
            if ( choice == 'a' )
            {
                System.out.println("\nEnter name of person who is joining the lineup: ");
                String name = input.nextLine();
                lineUp.add( name );
            }
            else if ( choice == 'r' )
            {
                String personServed = (String) lineUp.remove();
                System.out.println( "\n" + personServed + " was just served");
            }
            else if ( choice == 'v' )
            {
                String personServed = (String) lineUp.getFirst();
                System.out.println( "\n" + personServed + " was in the front");
            }
            else if ( choice == 's' )
            {
                System.out.println("\nCurrently there are " + lineUp.size() +
                        " people in line");
            }
        }
    }
    /**
     *
     * Purpose:  Method to ensure user enters a valid character
     * from the list of valid characters specified.  The user
     * input is always returned in lower case.
     * @param validChars        String containing all valid characters user can enter
     * @return  the single character entered by user - will be on of the characters in the list of valid characters
     */
    private char getValidCharacter(String validChars)
    {
        char choice = input.next().toLowerCase().charAt( 0 );
        while( validChars.indexOf( choice ) == -1 )
        {
            System.out.println("Invalid choice please select on of: " +
                    validChars );
            choice = input.next().toLowerCase().charAt( 0 );
        }
        //remove dangling next line
        input.nextLine();
        return choice;
    }
    private void displayMenu()
    {
        System.out.println("\nPlease select from following options: ");
        System.out.println("\ta - add person to lineup");
        System.out.println("\tr - remove person from lineup");
        System.out.println("\ts - how many people currently in line");
        System.out.println("\tv - view who is in the front of the line");
        System.out.println("\te - exit");
    }
    /**
     * Purpose:
     * @param args
     */
    public static void main(String[] args)
    {
        new QueueDemo();
    }
}