package COSC602.Class0117;

public class Student implements Cloneable
{
    private String firstName;
    private String lastName;
    private String phoneNumber;
    /**
     *
     * Constructor for the Student class.
     * @param first     First name of the student
     * @param last      Last name of the student
     * @param phone     Phone number for the student
     */
    public Student( String first, String last, String phone )
    {
        firstName = first;
        lastName = last;
        phoneNumber = phone;
    }
    /**
     * Purpose:   Display the students.
     */
    public void displayStudent()
    {
        System.out.println( lastName + ", " + firstName + "\t" + phoneNumber );
    }
    public boolean equals( Object obj )
    {
        boolean result = false;
        if ( obj !=null && obj.getClass() == getClass() )
        {
            Student s = (Student) obj;
            result = firstName.equals( s.firstName ) &&
                    lastName.equals( s.lastName ) && phoneNumber.equals( s.phoneNumber );
        }
        return result;
    }
    @Override
    protected Student clone()
    {
        Student copy = null;
        try
        {
            copy = (Student) super.clone();
        }
        catch(CloneNotSupportedException ex )
        {
            System.out.println("Clone broke");
        }
        return copy;
    }
}
