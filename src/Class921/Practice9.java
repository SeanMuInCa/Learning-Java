package Class921;

public class Practice9
{
    public enum Months
    {January, February, March, April, May, June, July, August, September, October, November, December}

    public enum Days
    {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday}

    public static void main(String[] args)
    {
        for (Months m : Months.values())
        {
            System.out.println(m);
        }
        System.out.println("Good " + Months.April + " and " + Days.Saturday);
    }
}
