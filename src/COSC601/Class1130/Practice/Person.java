package COSC601.Class1130.Practice;

import COSC601.Class1128.Edible;

public abstract class Person implements Enrollable, Printable
{
    String firstName;
    String lastName;
    String address;
    String phoneNum;

    public Person(String lastName)
    {
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, String address, String phoneNum)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNum = phoneNum;
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

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getPhoneNum()
    {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum)
    {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}
