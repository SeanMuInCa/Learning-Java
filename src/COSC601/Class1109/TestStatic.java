package COSC601.Class1109;

public class TestStatic
{
    static int staticVar; //can be called static or class variable
    int instanceVar;	  //can be called non-static or instance variable
    // both of the above variables can be called member variables

    public static void main(String [] args)
    {
        //can't reference non-static instance var from static method
        //without an object compiler will issue the following error:
        //non-static variable instanceVar cannot be referenced from a
        // static context
//         instanceVar = 10;

        //can reference static var from static method
        staticVar = 10;

        //can't invoke a non-static method from a static method without
        //an object compiler will issue the following error:
        //non-static method method() cannot be referenced from a static
        //context
        TestStatic t = new TestStatic();
         t.method();

        //can invoke a static method from a static method
        staticMethod();
    }
    //an instance (non-static) method

    public void method()
    {
        System.out.println("non-static (instance) method");
    }

    //a class (static) method
    public static void staticMethod()
    {
        System.out.println("static (class) method");
    }
}
