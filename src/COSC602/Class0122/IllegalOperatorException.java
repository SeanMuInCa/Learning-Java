package COSC602.Class0122;

public class IllegalOperatorException extends Exception
{
    private String msg;

    public IllegalOperatorException(){
        super("wrong operator");
    }
    public IllegalOperatorException(String msg)
    {
        super(msg);
    }
}
