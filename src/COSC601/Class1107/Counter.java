package COSC601.Class1107;

public class Counter
{
    private int value;

    public Counter()
    {
        this(1);
    }

    public Counter(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public void increaseCounter()
    {
        this.setValue(++this.value);
    }

    public void decreaseCounter()
    {
        this.setValue(--this.value);
    }

    public void setCounterToZero()
    {
        this.setValue(0);
    }

    @Override
    public String toString()
    {
        return "Counter{" +
                "value=" + value +
                '}';
    }
}
