package COSC601.Class1109;

public class ObjectInstanceClass
{
    int instanceVariable;
    static int classVariable = 5;

    ObjectInstanceClass()
    {
        instanceVariable = classVariable++;
    }

    private void incrementInstanceAndClass()
    {
        int localVariable = 1;
        localVariable++;
        instanceVariable++;
        classVariable++;
        System.out.println("local: " + localVariable + " instance: " +
                instanceVariable + " class: " + classVariable);
    }

    public String toString()
    {
        return ("\tInstance: " + instanceVariable +
                "\t Class: " + classVariable);
    }

    public static void main( String[] args )
    {
        ObjectInstanceClass oneCopy = new ObjectInstanceClass();
        ObjectInstanceClass twoCopy = new ObjectInstanceClass();
        ObjectInstanceClass threeCopy = new ObjectInstanceClass();

        /*oneCopy.incrementInstanceAndClass();

        twoCopy.incrementInstanceAndClass();
        twoCopy.incrementInstanceAndClass();

        threeCopy.incrementInstanceAndClass();
        threeCopy.incrementInstanceAndClass();
        threeCopy.incrementInstanceAndClass();*/

        System.out.println("oneCopy: " + oneCopy.toString());
        System.out.println("twoCopy: " + twoCopy.toString());
        System.out.println("threeCopy: " + threeCopy.toString());
    }
}
