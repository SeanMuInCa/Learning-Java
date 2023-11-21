package COSC601.human;

public class Human
{
    private int age;
    private double height;
    private final static double DEFAULT_HEIGHT = 46.2;
    public Human()
    {
        this(0, DEFAULT_HEIGHT);
        //length in centimeters
    }


    /**
     * @param  height  person's height in cm
     */
    Human(double height)
    {
        this(0, height);
    }


    /**
     * @param  age     person's age in years
     * @param  height  person's height in cm
     */
    Human(int age, double height)
    {
        setAge(age);
        setHeight(height);
    }


    /**
     * creates a new human object with the same values as another
     * @param  anotherHuman  Description of the Parameter
     */
    public Human(Human anotherHuman)
    {
        this(anotherHuman.getAge(), anotherHuman.getHeight());
    }


    /**
     * @param  age  The new age value
     */
    public void setAge(int age)
    {
        if (age >= 0 && age < 120)
        {
            this.age = age;
        }
        else
        {
            age = 0;
        }
    }


    /**
     * @param  height  The new height in cm value
     */
    public void setHeight(double height)
    {
        if (height > 22 && height < 220)
        {
            this.height = height;
        }
        else
        {
            this.height = DEFAULT_HEIGHT;
        }
    }


    /**
     * @return    The age value in years
     */
    public int getAge()
    {
        return age;
    }


    /**
     * @return    The height value in cm
     */
    public double getHeight()
    {
        return height;
    }


    /**
     * increases person's age by 1 year
     */
    public void haveBirthday()
    {
        age++;
    }


    /**
     *  used to display the attributes as a string
     *
     * @return    attributes concatenated together
     */
    public String toString()
    {
        return "Age:  " + age + " Height: " + height;
    }


    /**
     * @param  anotherHuman  a human to check for equality
     * @return               whether the two humans have the same value
     */
    public boolean equals(Human anotherHuman)
    {
        //returns true if all instance variables of the called object
        //and the parameter object are equal
        return (age == anotherHuman.age &&
                height == anotherHuman.height);
    }
}
