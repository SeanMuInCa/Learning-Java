package COSC602.Class0119;

/**
 * The Manager class is used to represent the Video Store manager.
 * The manager supervises the employees in the store and performs
 * other duties.
 * The Manager class inherits from the Person class.
 */
public class Manager extends Employee
{
    /**
     * Default Constructor
     */
    public Manager()
    {
        //super() invoked automatically
    }

    /**
     * Constructor to initialize the class
     * @param fName The person's first name
     * @param lName The person's last name
     * @param age   The person's age
     * @param sin   The person's social insurance number
     * @param salary The manager's yearly salary
     */
    public Manager( String fName, String lName, int age, int sin,
                    double salary ) throws Exception
    {
        // have the super class deal with fName, lName, age, sin, salary
        super( fName, lName, age, sin, 0, salary);
    }
}