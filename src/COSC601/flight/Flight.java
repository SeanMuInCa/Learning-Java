package COSC601.flight;/*
 *  Date submitted: September 28, 2006
 *  Assignment number: 2
 *  Course name:  COSC 180
 *  Instructors: Grace Carney, Shane McDonald, Sharon McDonald
 *  File path and name: Insert file name here
 */

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Locale;

/**
 *  Purpose: 
 *
 * @author CST100
 * @created September 17, 2007
 */

public class Flight
{
    private GregorianCalendar departureTime;
    private String flightNumber;
    
    /**
     * Fully loaded constructor
     * @param flight Flight number of the flight
     * @param dDate  Date the flight is departing
     */
    public Flight( String flight, GregorianCalendar dDate )
    {
        departureTime = (GregorianCalendar) dDate.clone();
        flightNumber = flight;
    }
    /**
     * Copy constructor
     * @param other  Another instance of Flight
     */
    public Flight( Flight other )
    {
        this( other.flightNumber, other.departureTime);
    }
    
    /** 
     * Create a string representation of this flight
     * @return string representation of flight details
     */
    public String getFlightDetails( )
    {
        return flightNumber + " arrives at " +
            departureTime.get( Calendar.HOUR) + 
            ":" + departureTime.get( Calendar.MINUTE ) +
            " on " + departureTime.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.CANADA )
            + " " + departureTime.get( Calendar.DAY_OF_MONTH)
            +", " + departureTime.get( Calendar.YEAR );
    }
    
    /**
     * Check for equality
     * @param other  The other Flight instance to compare to
     * @return true/false indication if flight information is the same
     */
    public boolean equals( Flight other )
    {
        return flightNumber.equals(  other.flightNumber  ) &&
            departureTime.equals( other.departureTime );
    }
    
    /**
     * Delay the departure time by the specified number of minutes
     * @param minutes Number of minutes to delay flight by
     */
    public void delayFlight( int minutes )
    {
        departureTime.add( Calendar.MINUTE, minutes );
    }
    
    /**
     * Create string representation of this object
     * @return string representation of the object
     */
    public String toString()
    {
        return "Flight[flightNumber = " + flightNumber + 
            ", departureTime = " + 
            departureTime.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.CANADA )
            + " " + departureTime.get( Calendar.DAY_OF_MONTH)
            + ", " + departureTime.get( Calendar.YEAR ) 
            + " " + departureTime.get( Calendar.HOUR) + 
            ":" + departureTime.get( Calendar.MINUTE );
    }
}
