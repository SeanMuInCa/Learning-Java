/*
 *  [File header includes information about the file being submitted.]
 *  Date submitted:
 *  Assignment number:
 *  Course name:  COSC 190
 *  Instructors: Sharon McDonald
 *  File path and name: J:\CST\ACOSC190\PrintQueue.java 
 */

package COSC602.Class0115;


import java.util.LinkedList;

/**
 *  Purpose: This class maintains the print queue.  Jobs can be added to the 
 *  queue or removed when a print job starts.
 *  
 *  No priorities are associated with this queue.  The first job to added to the 
 *  queue should be the first job out of the queue(FIFO)
 *
 * @author CST100
 * @version 1.0
 */

public class PrintQueue
{
    //TODO Create an instance variable that implements a queue of PrintJob objects
    private LinkedList<PrintJob> pjq;
    /**
     * 
     * Constructor for the PrintQueue class.
     */
    public PrintQueue()
    {
        //TODO instantiate the queue
        pjq = new LinkedList<>();
    }
    
    /**
     * 
     * Purpose:  Return the next job waiting in the queue. 
     * @return  the print job up next
     */
    public PrintJob getNextJob()
    {
        //TODO get the next print job from the front of the queue
        return pjq.removeFirst();
    }
    
    /**
     * 
     * Purpose:  Add print job to the queue
     * @param pj    The print job to be added
     */
    public void addJob( PrintJob pj)
    {
        //TOOD add the provided print job to the end of the queue
        pjq.add(pj);
    }
    
    /**
     * 
     * Purpose: Determine how many print jobs are currently waiting
     * @return the number of jobs in the print queue
     */
    public int jobsWaiting()
    {
        //TODO return the number of jobs currently int he print queue
        return pjq.size();
    }

}
