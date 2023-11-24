package COSC601.Class1123;

public abstract class PersonTemplate
{
    private String firstName;
    private String lastName;

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
    public boolean equals(Object obj){
        if(obj instanceof Employee){
            return this.getFirstName().equals(((Employee) obj).getFirstName()) ? this.getLastName().equals(((Employee) obj).getLastName()) : this.getFirstName().equals(((Employee) obj).getFirstName());
        }
        return false;
    }
}
