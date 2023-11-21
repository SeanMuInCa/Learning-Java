package Class921;

public class Practice8
{
    public enum Days
    {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday}

    public static void main(String[] args)
    {
        for (Days d : Days.values())
        {
            System.out.println(d);
        }
        System.out.println("Good " + Days.Saturday);
    }
}
