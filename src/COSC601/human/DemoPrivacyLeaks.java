package COSC601.human;

public class DemoPrivacyLeaks
{
    public static void main( String[] args )
    {
        AddressBook myFriends;
        myFriends = new AddressBook();

        Human hiddenSpy;
        hiddenSpy = myFriends.getFriend();
        System.out.println(myFriends);
        System.out.println("Original Friend: " + hiddenSpy.toString());

        hiddenSpy.setAge(82);
        hiddenSpy.setHeight(50);
        System.out.println("Inadvertently changed Friend " +
                hiddenSpy);
        System.out.println(myFriends);
    }
}
