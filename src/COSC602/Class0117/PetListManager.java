package COSC602.Class0117;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PetListManager
{
    //TODO Declare petList using TreeMap - key is the pet name,  value is the Pet object
    TreeMap<String, Pet> petList;

    private Scanner input = new Scanner( System.in );

    //Named constant with a few pets initially to be added to the list for testing purposes
    private static final Pet[] STARTING_PET_LIST = { new Pet( "Fluffy", 8, 'm' ),
            new Pet("Brutus", 6, 'f' ), new Pet("Tiny", 12, 'm' ) };
    //Named constants for menu options
    private static final char ADD_PET = 'A';
    private static final char DELETE_PET = 'D';
    private static final char LIST_PETS = 'L';
    private static final char FIND_PET = 'F';
    private static final char EXIT = 'E';

    /**
     *
     * Constructor for the PetListManager class.
     */
    public PetListManager()
    {
        // TODO Instantiate the petList

        petList = new TreeMap<>();
        System.out.println("Welcome to the Pet List Manager" );
        //Add initial elements to the map

        for( Pet p : STARTING_PET_LIST )
        {
            //TODO add each pet to the petList
            petList.put(p.getPetName(),p);

        }

        displayMainMenu();
    }

    /**
     *
     * Purpose:  Display main menu to user.  Allow user to enter their choice.
     */
    public void displayMainMenu()
    {
        char choice;
        do
        {

            System.out.println("\nPlease enter you choice from the menu: " );
            System.out.println("\ta - add new pet\n\tl - list all pets " +
                    "\n\tf - find a pet \n\td - delete a pet\n\te - exit" );
            choice = input.next().toUpperCase().charAt( 0 );

            switch( choice )
            {
                case ADD_PET:
                {
                    addPet();
                    break;
                }
                case DELETE_PET:
                {
                    deletePet();
                    break;
                }
                case LIST_PETS:
                {
                    listPets();
                    break;
                }

                case FIND_PET:
                {
                    findPet();
                    break;
                }
                default:
                {
                    if  ( choice != EXIT)
                    {
                        System.out.println("\nMenu Choice invalid! Please try again");
                    }
                }

            }
        } while( choice != EXIT );

    }

    /**
     *
     * Purpose:  Ask user to input pet name, age and gender.  Create a Pet
     * instance and add to the collection
     */
    public void addPet()
    {
        if ( input.hasNextLine() )
        {
            //Clear off dangling new line
            input.nextLine();
        }
        System.out.println("\nAdding new pet.  Please enter pet name: " );
        String name = input.nextLine().trim();

        while( name.length() == 0 )
        {
            System.out.println("Invalid name - must be at least one character! Try again.");
            name = input.nextLine().trim();
        }

        System.out.println("Enter age: " );
        int age = input.nextInt();

        while( age < 0 || age > 40 )
        {
            System.out.println("Age is invalid!  Try again");
            age = input.nextInt();
        }

        System.out.println("Enter gender(m or f): " );
        char gender = input.next().toLowerCase().charAt( 0 );

        while( gender != 'm' && gender != 'f' )
        {
            System.out.println("Incorrect gender - enter m or f");
            gender = input.next().toLowerCase().charAt( 0 );
        }

        Pet p = new Pet( name, age, gender );

        //TODO put new pet into the petList
        petList.put(p.getPetName(),p);

    }

    /**
     *
     * Purpose:  Ask user to enter the pet name of the pet to be
     * deleted.   Inform the user if the deletion was successful or not.
     */
    public void deletePet()
    {
        if ( input.hasNextLine() )
        {
            //Clear off dangling new line
            input.nextLine();
        }
        System.out.println("\nEnter name of pet to be deleted: " );
        String nameToBeDeleted = input.nextLine();

        //TODO Remove the pet from the petList
        Pet deleted = null;
        deleted = petList.remove(nameToBeDeleted);

        if ( deleted == null )
        {
            System.out.println("No pet by that name was found." +
                    "No deletion occurred.");
        }
        else
        {
            System.out.println("Pet called " + nameToBeDeleted +
                    " was removed.");
        }
    }

    /**
     *
     * Purpose:  Get the pet name from the user.  Try to find
     * that pet name in the pet list.  If the pet exists display
     * the pet information
     */
    public void findPet()
    {
        if ( input.hasNextLine() )
        {
            //Clear off dangling new line
            input.nextLine();
        }
        System.out.println("\nEnter name of pet to find: " );
        String name = input.nextLine();

        //TODO get the Pet from the petList

        Pet pet = null;
        pet = petList.get(name);
        if ( pet == null )
        {
            System.out.println("No pet by that name was found.");
        }
        else
        {
            System.out.println("\nPet:  " + pet.getDisplayString() );
        }
    }

    /**
     *
     * Purpose:  Display a list of all pets in pet list.
     */
    public void listPets()
    {
        System.out.println("\nList of Pets: ");
        //TODO Loop through entire petList and display the result of the
        // getDisplayString method for each pet
        for (Map.Entry<String, Pet> m : petList.entrySet()){
            System.out.println(m.getValue().getDisplayString());
        }

    }
    /**
     * Purpose:  This method is main entry point for the program.
     * Just instantiate the PetListManager class
     * @param args      command line arguments
     */
    public static void main(String[] args)
    {
        new PetListManager();
    }

}