/*
 *  [File header includes information about the file being submitted.]
 *  Date submitted:
 *  Assignment number:
 *  Course name:  COSC 180
 *  Instructors:  Sharon McDonald
 *  File path and name: J:\CST\ACOSC190\PrintJob.java 
 */

package COSC602.Class0115;

/**
 *  Purpose: This class maintains all necessary information about a print job.
 *  The two main items kept for each print job are the job identifier and the number
 *  of pages in the job.   
 *
 * @author CST100
 * @version 1.0
 */

public class PrintJob
{
    private int jobId;
    private int pages;
    
    /**
     * Maintains the unique identifier for the next job created
     */
    private static int nextJobId = 1;
    
    /**
     * 
     * Constructor for the PrintJob class.
     * Assign the unique job identifier.  Randomly select number
     * of pages from 1 to 100. 
     */
    public PrintJob()
    {
        jobId = nextJobId;
        nextJobId++;
        
        //Randomly select number of pages - 1 to 100
        pages = (int) ( Math.random() * 100 + 1 ); 
    }
    
    /**
     * 
     * Purpose:  This method starts the print job.  Which in this 
     * simulated example means a message is displayed to the user.
     * @return the number of pages in the print job
     */
    public int startPrintJob()
    {
        System.out.println( "Job " + jobId + " is starting ");
        
        return pages;
    }

}
