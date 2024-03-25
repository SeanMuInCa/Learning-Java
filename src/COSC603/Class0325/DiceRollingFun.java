package COSC603.Class0325;

import java.util.Scanner;

public class DiceRollingFun
{
    //no threads
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        new DiceRollingFun();
    }

    public DiceRollingFun()
    {
        System.out.println("instructor");
        System.out.println("start");
        playNow();
    }

    private void playNow()
    {
        char choice = getMainMenuChoice();
        while (choice != 'e')
        {
            switch (choice)
            {
                case 'c' -> countRolls();
                case 'd' -> displayDiceRoll();
            }
            choice = getMainMenuChoice();
        }
    }

    private char getMainMenuChoice()
    {
        System.out.println("choose an option: \n d - display a dice roll\n c- count rolls to achieve a total\n" +
                " e - exit\n");
        return input.next().charAt(0);
    }

    private void displayDiceRoll()
    {
        System.out.println("let's roll the dice.");
        System.out.print("how many dice would you like to roll? ");
        int count = input.nextInt();
        int rollTotal = 0;
        for (int i = 0; i < count; i++)
        {
            rollTotal += (int)(Math.random() * 6 + 1);
        }
        System.out.println("you rolled " + rollTotal + " with " + count + " dices");
    }

    private void countRolls()
    {
        System.out.println("how many rolls are needed to achieve your total");
        System.out.println("how many dices would you like to use? ");
        int count = input.nextInt();
        System.out.println("what total do you want to achieve? (has to between " + count + " and " + (count * 6) + ": ");
        int total = input.nextInt();

        int rolledTotal = 0;
        int rollCount = 0;
        while (total != rolledTotal)
        {
            rolledTotal = 0;
            for (int i = 0; i < count; i++)
            {
                rolledTotal += (int)(Math.random() * 6 + 1);
            }
            rollCount++;
        }
        System.out.println("\nIt took " + rollCount + " rolls to roll a " + total + " with " + count + " dice.");
    }
}
