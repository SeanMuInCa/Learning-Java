package COSC602.Collections;

import java.util.Scanner;
import java.util.Stack;

/**
 *  Purpose: This program demonstrates the use of the Stack class to create
 *  a simple stack to hold names.   Any new names are always added to the top
 *  of the stack.  Removing an element always removes the element on the top -
 *  the last element that was added.
 *
 * @author CST100
 * @version 1.0
 */

public class StackDemo
{
    private Scanner input = new Scanner( System.in );

    //Define a instance variable using Stack, Stack supports generics
    private Stack<String>  sampleStack;


    /**
     *
     * Constructor for the StackDemo class.
     */
    public StackDemo()
    {
        //Instantiate the stack
        sampleStack = new Stack<String>();
        demonstrate();
    }

    /**
     *
     * Purpose:  This method gets the users choice and performs the appropriate
     * function with the Stack.
     */
    private void demonstrate()
    {
        displayMenu();
        char choice = getValidCharacter("arvse");
        while( choice != 'e' )
        {
            if ( choice == 'a' )
            {
                System.out.println("\n" +
                        "Please enter a name: " );
                String name = input.next();
                //Use push to place new element on the stack
                sampleStack.push( name );
            }
            else if ( choice == 'r' )
            {
                //Use pop to remove the top element from the stack
                String removedName = sampleStack.pop( );
                System.out.println("\n" + removedName + "  has been removed.");
            }
            else if ( choice == 'v' )
            {
                //Use peek to look at top element but do not remove
                String name = sampleStack.peek();
                System.out.println("\nName on top of stack is: " + name );
            }
            else if ( choice == 's')
            {
                System.out.println("\nStack currently has " + sampleStack.size() +
                        " elements");
            }
            displayMenu();
            choice = getValidCharacter("arvse");
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
        return choice;

    }

    /**
     *
     * Purpose:  Display menu to the user.
     */
    private void displayMenu()
    {
        System.out.println("\nPlease select choice from: " );
        System.out.println("\ta - add a name to stack");
        System.out.println("\tr - remove top element on stack");
        System.out.println("\tv - view top element but don't remove");
        System.out.println("\ts - current size of Stack");
        System.out.println("\te - exit");
    }
    /**
     * Purpose:  Program entry point.
     * @param args      Command line arguments - not used
     */
    public static void main(String[] args)
    {

         new StackDemo();
    }

}