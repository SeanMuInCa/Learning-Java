package COSC602.Class0119;

public class Person
{
    private String firstName;   // person's first name
    private String lastName;    // person's last name
    private int age;            // person's age
    private int sin;            // person's social insurance number

    /**
     * Default Constructor
     */
    public Person()
    {
        firstName = "";  // person's first name
        lastName = "";   // person's last name
        age = 0;         // person's age
        sin = 0;         // person's social insurance number
    }

    /**
     * Constructor to initialize the object.
     * @param fName The person's first name
     * @param lName The person's last name
     * @param age   The person's age
     * @param sin   The person's social insurance number
     */
    public Person( String fName, String lName, int age,
                   int sin) throws Exception
    {
        firstName = fName;
        lastName = lName;
        /* The "this" keyword specifies that you are referencing the class
         * attribute age rather than the method argument age.
         */
        setAge(age);
        this.sin = sin;
    }

    // get and set methods for each attribute could be here too...

    public void setAge(int age) throws Exception
    {
        if(age < 0)
            throw new Exception("age must be greater than 0");
        this.age = age;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getAge()
    {
        return age;
    }

    public int getSin()
    {
        return sin;
    }

    public void setSin(int sin)
    {
        this.sin = sin;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sin=" + sin +
                '}';
    }
}