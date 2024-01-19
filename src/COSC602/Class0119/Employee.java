package COSC602.Class0119;

/**
 * The employee class is used to store information about the video stores
 * employees, such as hoursWorked, wages, etc.
 */
public class Employee extends Person
{
    private double pay;  //pay information
    private int hoursWorked; // hoursWorked per month

    /**
     * Default Constructor
     */
    public Employee()
    {
        //super(); // super is called by default, so this call is not required
        pay = 0;
        hoursWorked = 0;
    }

    /**
     * Constructor
     * @param fName The person's first name
     * @param lName The person's last name
     * @param age   The person's age
     * @param sin   The person's social insurance number
     * @param hoursWorked Hours worked in a month
     * @param pay Pay information.
     */
    public Employee( String fName, String lName, int age,
                     int sin, int hoursWorked, double pay ) throws Exception
    {
        // set values in Person class
        super( fName, lName, age, sin );
        this.pay = pay;
        this.hoursWorked = hoursWorked;
    }

    /**
     * Get the employee's gross pay.
     * @return The employee's gross pay.
     */
    public double getGrossPay()
    {
        double gross = pay * hoursWorked;
        return gross;
    }

    public void setPay(double pay)
    {
        if(pay < 14)
            throw new IllegalArgumentException("pay can not less than 14 per hour");
        this.pay = pay;
    }

    public void setHoursWorked(int hoursWorked)
    {
        if(hoursWorked < 0)
            throw new IllegalArgumentException("hoursWorked can not be negative");
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "pay=" + pay +
                ", hoursWorked=" + hoursWorked +
                '}' + super.toString();
    }
}