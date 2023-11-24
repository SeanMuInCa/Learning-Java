package COSC601.Class1123;

import java.util.Objects;

public class Employee extends PersonTemplate
{
    private int employeeNum;
    private DeptCodes deptCode;
    private String email;
    private double salary;

    public Employee()
    {
        this(0,"john","doe");
    }

    public Employee(int employeeNum, String firstName, String lastName)
    {
        this(employeeNum,firstName,lastName,DeptCodes.SD,"",0);
    }

    public Employee(int employeeNum, String firstName, String lastName, DeptCodes deptCode, String email, double salary)
    {
        this.employeeNum = employeeNum;
/*        this.firstName = firstName;
        this.lastName = lastName;*/
        this.deptCode = deptCode;
        this.email = email;
        this.salary = salary >= 0 ? salary : 0;
    }

    public int getEmployeeNum()
    {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum)
    {
        this.employeeNum = employeeNum;
    }

    public String getFirstName()
    {
        return this.getFirstName();
    }

//    public void setFirstName(String firstName)
//    {
//        this.firstName = firstName;
//    }

    public String getLastName()
    {
        return this.getLastName();
    }

//    public void setLastName(String lastName)
//    {
//        this.lastName = lastName;
//    }

    public DeptCodes getDeptCode()
    {
        return deptCode;
    }

    public void setDeptCode(DeptCodes deptCode)
    {
        this.deptCode = deptCode;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return this.getEmployeeNum() + " - " + this.getLastName() + ", " + this.getFirstName();
    }
    /*public boolean equals(Object obj){
        if(obj instanceof Employee){
            return this.getFirstName().equals(((Employee) obj).getFirstName()) ? this.getLastName().equals(((Employee) obj).getLastName()) : this.getFirstName().equals(((Employee) obj).getFirstName());
        }
        return false;
    }*/


   /* @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeNum == employee.employeeNum && Double.compare(salary, employee.salary) == 0 && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(deptCode, employee.deptCode) && Objects.equals(email, employee.email);
    }*/

}
