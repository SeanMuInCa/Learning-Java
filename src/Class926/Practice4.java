package Class926;

import java.util.Scanner;

public class Practice4
{
//    public static void main(String[] args)
//    {
//        int dice1 = 0;
//        int dice2 = 0;
//        int total = 0;
//        char roll;
//        do
//        {
//            System.out.println("Do you want to roll your dices? y or n");
//            Scanner input = new Scanner(System.in);
//            roll = input.nextLine().toLowerCase().charAt(0);
//
//            if (roll != 'n')
//            {
//                System.out.println("Rolling the 1st dice");
//                dice1 = (int) (1 + Math.random() * 6);
//                System.out.println(dice1);
//                System.out.println("Rolling the 2nd dice");
//                dice2 = (int) (1 + Math.random() * 6);
//                System.out.println(dice2);
//                total += dice1 + dice2;
//            }
//
//        } while (roll != 'n');
//        System.out.println(total);

//    }
public static void main(String[] args)
{
    int dice1, dice2;
    char rollAgain;
    Scanner scanner = new Scanner( System.in );

    do
    {
        //roll the dice
        dice1 = (int)(Math.random()*6) + 1;
        dice2 = (int)(Math.random()*6) + 1;

        //display values of dice and their total
        System.out.println("The values of the dice are " + dice1 + " and " +
                dice2 + " for a total of " + (dice1 + dice2));

        //ask if they want to roll again
        System.out.println("Do you want to roll again? (y/n) ");
        rollAgain = scanner.next().charAt( 0 );
    }while (rollAgain == 'y' || rollAgain == 'Y');
}
}
