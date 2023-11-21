package COSC601.Class1107;

public class TestCounter
{
    public static void main(String[] args)
    {
        Counter c = new Counter(5);
        System.out.println(c);
        c.increaseCounter();
        System.out.println(c);
        c.decreaseCounter();
        System.out.println(c);
        c.setCounterToZero();
        System.out.println(c);
    }
}
