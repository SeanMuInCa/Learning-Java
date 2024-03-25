package COSC603.Class0325;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class DiceRollingWithThreads
{
    public static Scanner input = new Scanner(System.in);
    private Vector<String> results = new Vector<>();

    public static void main(String[] args)
    {
        new DiceRollingWithThreads();
    }

    public DiceRollingWithThreads()
    {
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
                case 'x' ->
                {
                    if (results.isEmpty())
                        System.out.println("no result yet");
                    else
                    {
                        Iterator<String> it = results.iterator();
                        while (it.hasNext())
                        {
                            System.out.println("\nresults now in : \n" + it.next());
                            it.remove();
                        }
                    }
                }
            }
            choice = getMainMenuChoice();
        }
    }

    private void countRolls()
    {
        System.out.println("how many rolls are needed");
        System.out.print("how many dice would you like to use? ");
        int diceCount = input.nextInt();

        System.out.println("what is your total goal here? " + "Between " + diceCount + " and " + diceCount * 6);

        int targetTotal = input.nextInt();

        System.out.println("we return to the menu - results reported when ready");

        Thread t = new Thread(new CountRunnerThread(diceCount, targetTotal));
        t.start();
    }
    class CountRunnerThread implements Runnable
    {
        private int diceCount;
        private int targetTotal;
        public CountRunnerThread(int diceCount, int targetTotal){
            this.diceCount = diceCount;
            this.targetTotal = targetTotal;
        }
        @Override
        public void run()
        {
            int rolledTotal = 0;
            int rollCount = 0;
            while (targetTotal != rolledTotal)
            {
                rolledTotal = 0;
                for (int i = 0; i < diceCount; i++)
                {
                    rolledTotal += (int)(Math.random() * 6 + 1);
                }

                rollCount++;
            }
            results.add("\nit took " + rollCount + " rolls to roll a " + targetTotal + " with " + diceCount + " dices");
        }
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
    private char getMainMenuChoice()
    {
        System.out.println("choose an option: \n d - display a dice roll\n " +
                "c- count rolls to achieve a total\n" +
                " x - check for results\n" +
                " e - exit\n");
        return input.next().charAt(0);
    }
}
