package COSC602.Class0119;

public class TestDriver
{
    public static void main( String[] args )
    {
        Employee emp = new Employee();
        try
        {
            emp.setAge(2);
            emp.setPay(13);
            emp.setHoursWorked(2000);
            emp.setFirstName("abc");
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println(emp);
    }
}
