/*
 *  [File header includes information about the file being submitted.]
 *  Date submitted:
 *  Assignment number:
 *  Course name:  COSC 190
 *  Instructors: Sharon McDonald
 *  File path and name: J:\CST\ACOSC190\PrintManager.java 
 */

package COSC602.Class0115;

import java.io.*;

/**
 *  Purpose: This class simulates a print manager.  It maintains a queue
 *  of print jobs.  It assumes it takes 50 msec to print one page so the number 
 *  of pages in the print job will vary the amount of time it takes to print 
 *  each job.
 *
 * @author CST100
 * @version 1.0
 */

public class PrintManager
{
    private PrintQueue pq = new PrintQueue();
    private BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    private int pageCount = 0;

    /**
     * 
     * Constructor for the PrintManager class.
     */
    public PrintManager()
    {
        System.out.println("The CST simulated print job manager.\n");
        mainControl();
    }

    /**
     * 
     * Purpose:  This method is responsible to running the main controlling
     * loop.  It essentially loops forever waiting for jobs to be added to the 
     * queue and "printing" jobs as they are added. 
     */
    public void mainControl()
    {
        
        System.out.println("\nEnter 'a' to add print job or 's' to display status:");
        try
        {
            while( true )
            {
                if ( br.ready() )
                {
                    checkInput( );
                }
                if ( pageCount ==  0 && pq.jobsWaiting() > 0 )
                {
                    //Start new job
                    PrintJob pj = pq.getNextJob();
                    pageCount = pj.startPrintJob();
                }
                Thread.sleep( 50 );
                if ( pageCount > 0 )
                {
                    pageCount--;
                }

            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * 
     * Purpose: Deal with input entered by the user.   User specifies 'a' to 
     * add a print job or 's' to see the current status of the printer
     */
    private void checkInput( )
    {
        try
        {
            String input = br.readLine();
            input = input.toLowerCase();

            if ( input.length() > 0 && input.charAt( 0 ) == 'a' )
            {
                PrintJob pj =  new PrintJob();
                pq.addJob( pj );

            }
            else if (  input.length() > 0 && input.charAt( 0 ) == 's' )
            {
                System.out.println( "Printer is currently " + 
                        (( pageCount == 0 ) ? "idle " : "printing." +
                                "There are " + pq.jobsWaiting() +
                                " jobs waiting" ));
            }
            else
            {
                System.out.println("Invalid choice! Enter 'a' to add a print job or " +
                        "'s' to see printer status");
            }
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Purpose:  Main entry point for the program
     * @param args      Command line arguments - not used
     */
    public static void main(String[] args)
    {
        new PrintManager();

    }

}
