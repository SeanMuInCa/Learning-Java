package COSC601.human;

public class AddressBook
{
    private Human friend;

    public AddressBook()
    {
        friend = new Human(29, 160);
    }
    public String toString ()
    {
        return friend.toString();
    }
    public Human getFriend()
    {
        //solve the privacy leak by returning a copy
        Human myCopy = new Human(friend);
        return myCopy;

        //a reference to the friend would cause a privacy leak
//        return friend;
    }
}
