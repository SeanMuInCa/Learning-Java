package COSC602.Class0129;

import java.util.function.Function;

public class Times2<T,R> implements Function<T,T>
{
    @Override
    public T apply(T t)
    {
        int i = (Integer) t * 2;
        return (T)(Integer) i;
    }
}
