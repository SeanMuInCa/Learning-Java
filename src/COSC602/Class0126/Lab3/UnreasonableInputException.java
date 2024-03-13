package COSC602.Class0126.Lab3;

public class UnreasonableInputException extends Exception
{
    public UnreasonableInputException() {
        super("Unreasonable input from you!");
    }
    public UnreasonableInputException(String message) {
        super(message);
    }
}
