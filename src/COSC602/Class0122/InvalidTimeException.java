package COSC602.Class0122;

public class InvalidTimeException extends Exception
{
    private String msg;
    public InvalidTimeException(){
        super("invalid time format");
    }
    public InvalidTimeException(String msg)
    {
        super(msg);
    }
}
