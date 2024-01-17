package COSC602.Class0117;

public class Pet
{

    private String name;
    //For simplicity sake age is used but really storing the birthdate and calculating current age would be much better implementation
    private int age;
    private char gender;

    /**
     *
     * Constructor for the Pet class.
     * @param name      Name of pet
     * @param age       Age in years of pet
     * @param gender    Gender of pet as m or f
     */
    public Pet( String name, int age, char gender )
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     *
     * Purpose:  Represent data for this pet in a displayable String
     * @return  String with pet information formatted nicely
     */
    public String getDisplayString()
    {
        return name + " is " + age  + " years old and is " +
                ((gender == 'm' ) ? "male" : "female");

    }

    /**
     *
     * Purpose:  Get the pet name
     * @return  name
     */
    public String getPetName()
    {
        return name;
    }
}
