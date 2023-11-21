package COSC601.flight;/*
 *  [File header includes information about the file being submitted.]
 *  Date submitted:
 *  Assignment number:
 *  Course name:  COSC 180
 *  Instructors: Grace Carney, Shane McDonald, Sharon McDonald
 *  File path and name: J:\CST\ACOSC180\Template.java (replace with your own)
 */

import java.util.Scanner;

/**
 *  Purpose: This class stores details for a charter flight, 
 *  including destination, and outgoing and return flights.
 *
 * @author Sharon McDonald CST100
 */

public class CharterFlight
{
    private String destination;
    private Flight outFlight;
    private Flight returnFlight;
    
    /**
     * Fully loaded constructor
     * @param destination  The destination
     * @param outFlight    The outgoing flight details
     * @param returnFlight The return flight details
     */
    public CharterFlight( String destination, Flight outFlight, 
            Flight returnFlight )
    {
        this.destination = destination;
        setOutFlight(outFlight);
        setReturnFlight(returnFlight);
    }
    
    /**
     * Copy constructor
     * @param other  Another instance of CharterFlight to copy
     */
    public CharterFlight( CharterFlight other )
    {
        this( other.destination, other.outFlight, other.returnFlight );
    }
     
    /**
     * Get the outgoing flight details
     * @return outgoing flight details
     */
    public Flight getOutFlight()
    {
        return new Flight(outFlight);
    }

    /**
     * Set the outgoing flight details
     * @param outFlight New outgoing flight details
     */
    public void setOutFlight( Flight outFlight )
    {
        this.outFlight = new Flight(outFlight);
    }

    /**
     * Get the return flight details
     * @return return flight details
     */
    public Flight getReturnFlight()
    {
        return new Flight(returnFlight);
    }

    /**
     * Set the return flight details.
     * @param returnFlight  The new return flight details
     */
    public void setReturnFlight( Flight returnFlight )
    {
        this.returnFlight = new Flight(returnFlight);
    }

    /**
     * Compare equality of this object to another object
     * @param other  The other object instance to compare to
     * @return true/false indication if the objects have the same values
     */
    public boolean equals( CharterFlight other )
    {
        return destination.equals( other.destination ) &&
            outFlight.equals( other.outFlight  ) &&
            returnFlight.equals(  other.returnFlight  );
    }
    
    /**
     * Create a string representation of the object
     * @return string representation of this object
     */
    public String toString()
    {
        return "CharterFlight[destination = " + destination + 
        ", outFlight = " + outFlight + ", returnFlight = " + 
        returnFlight + "]";
    }

}
