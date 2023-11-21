package COSC601.Class1107;

/**
 *  Tests the Cube class
 *
 * @author     Grace Carney
 * @created    November 24, 2003
 */
import java.util.Scanner;

public class CubeTest
{
    Scanner scanner = new Scanner( System.in );
    /**
     *  The main program for the TestCube class
     *
     * @param  args  The command line arguments
     */
    public static void main(String[] args)
    {
        Cube sugar = new Cube();
        Cube ice = new Cube();

        sugar.setLength(10);
        sugar.setWidth(20);
        sugar.setHeight(30);
        //sugar.length = 100; not allowed because attribute private
        //sugar.width = 200; not allowed because attribute private
        //sugar.height = 300; not allowed because attribute private

        System.out.println("\nsugar Cube: \n" + sugar.toString() + "\n");

        CubeTest c = new CubeTest();
        ice.setLength(c.askForLength());
        ice.setWidth(c.askForWidth());
        ice.setHeight(c.askForHeight());

        System.out.println("\nice Cube: \n" + ice.toString() + "\n");
    }


    /*
     *  Notice that these methods still use the modifier static because
     *  an object is not instantiated of the TestCube1 Class
     *  Also, these methods are not used outside of the TestCube class,
     *  so they are "helper" methods and can be private
     */
    /**
     *  A helper method to ask for the width of the cube
     *
     * @return    width of cube
     */
    private  double askForWidth()
    {
        System.out.println("Enter the width: ");
        return scanner.nextDouble();
    }


    /**
     *  A helper method to ask for the length of the cube
     *
     * @return    length of cube
     */
    private  double askForLength()
    {
        System.out.println("Enter the length: ");
        return scanner.nextDouble();
    }


    /**
     *  A helper method to ask for the height of the cube
     *
     * @return    height of cube
     */
    private  double askForHeight()
    {

        System.out.println("Enter the height: ");
        return scanner.nextDouble();
    }
}