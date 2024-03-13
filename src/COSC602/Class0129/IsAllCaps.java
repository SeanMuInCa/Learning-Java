package COSC602.Class0129;

import java.util.function.Predicate;

public class IsAllCaps implements Predicate<String>
{
    @Override
    public boolean test(String t)
    {

        return t.equals(t.toUpperCase());
    }

}
