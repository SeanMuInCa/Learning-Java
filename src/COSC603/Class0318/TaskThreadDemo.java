package COSC603.Class0318;

public class TaskThreadDemo
{
    public static void main(String[] args)
    {
        PrintChar p = new PrintChar('a',100);
        PrintChar p1 = new PrintChar('b',100);
        PrintNum p2 = new PrintNum(100);
        new Thread(p).start();
        new Thread(p1).start();
        new Thread(p2).start();
    }
}
class PrintChar implements Runnable
{
    private final char charToPrint;
    private final int times;
    public PrintChar(char c, int t)
    {
        this.charToPrint = c;
        this.times = t;
    }
    @Override
    public void run()
    {
        for (int i = 0; i < times; i++)
        {
            System.out.print(charToPrint);
        }
        System.out.print(" i am finished " + charToPrint + " ");
    }
}

class PrintNum implements Runnable
{
    private final int lastNum;

    public PrintNum(int lastNum)
    {
        this.lastNum = lastNum;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < lastNum; i++)
        {
            System.out.print(" " + i);
        }
        System.out.print(" i am finished " + lastNum + " ");
    }
}
