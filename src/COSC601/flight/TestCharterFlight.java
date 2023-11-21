package COSC601.flight;/*
 *  [File header includes information about the file being submitted.]
 *  Date submitted:
 *  Assignment number:
 *  Course name:  COSC 180
 *  Instructors: Grace Carney, Shane McDonald, Sharon McDonald
 *  File path and name: J:\CST\ACOSC180\Template.java (replace with your own)
 */

import java.util.Scanner;
import java.util.GregorianCalendar;

/**
 *  Purpose: Starting template for a new program. Replace these comments with
 *  your own. Briefly describe the purpose of the class, how the class is used
 *  in the program and how it interacts with other classes.
 *
 * @author Sharon McDonald CST100
 * @created Date
 */

public class TestCharterFlight
{

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        Flight outFlight = new Flight( "WJ123", new GregorianCalendar( 
                2007, GregorianCalendar.DECEMBER, 20, 9, 10 ));
        Flight retFlight = new Flight( "WJ124", 
                        new GregorianCalendar( 
                        2007, GregorianCalendar.DECEMBER, 27, 15, 45 ));
        CharterFlight mexico = new CharterFlight( "Mexico",
                outFlight, retFlight );

        System.out.println( mexico );
        
        
        // Change outFlight 
        outFlight.delayFlight(  360  );
        retFlight.delayFlight( 360 );
        
        // Print again to make sure no privacy leaks
        System.out.println("\nThe following should be the same as above!" );
        System.out.println("\n" + mexico );
        
        // Create new instance
        
        CharterFlight mexico2 = new CharterFlight( "Mexico", outFlight, 
                retFlight );
        
        System.out.println("\nCheck if flights are equal - should be false:" +
                mexico.equals(  mexico2  ));
        
        CharterFlight mexico3 = new CharterFlight( "Mexico", outFlight, 
                retFlight );
        
        System.out.println("\nCheck if flights are equal - should be true:" +
                mexico2.equals(  mexico3 ));
        
        Flight mexReturnFlight = mexico3.getReturnFlight();
        mexReturnFlight.delayFlight( 50 );
        
        System.out.println("\nCheck if flights are equal - should be false:" +
                mexReturnFlight.equals( mexico3.getReturnFlight() ) );
        
        Flight mexOutFlight = new Flight( "WJ123", new GregorianCalendar( 
                2007, GregorianCalendar.DECEMBER, 20, 14, 30 ));
        mexico3.setOutFlight( mexOutFlight );
        
        mexOutFlight.delayFlight( 15 );
        
        Flight charterOutFlight = mexico3.getOutFlight();
        
        System.out.println("Check if flights are equal - should be false: " +
                mexOutFlight.equals( charterOutFlight ) );
        
    }

}
