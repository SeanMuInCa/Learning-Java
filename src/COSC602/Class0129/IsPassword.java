package COSC602.Class0129;

import java.util.function.Predicate;

public class IsPassword implements Predicate<String>
{
    @Override
    public boolean test(String s)
    {
        return (s.length() > 6) && s.matches("^.*[A-Z].*$") && s.matches("^.*\\d.*$");
    }
}
