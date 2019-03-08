import java.util.*;

class Employee
{
    Double age;
    Double salary;
    String name;
    Employee(Double age, Double salary, String name)
    {
        this.age=age;
        this.salary=salary;
        this.name=name;
    }

    public String toString()
    {
        return "name : "+name+"---age : "+age+"---salary : "+salary;
    }
}




public class Question4 {

    public static void main(String[] args) {
        Employee e1=new Employee(26.0,20000.0,"employee1");
        Employee e2=new Employee(29.0,300000.0,"employee2");
        Employee e3=new Employee(23.0,25000.0,"employee3");
        Employee e4=new Employee(28.0,20000.0,"employee4");


        List<Employee> tset1=new ArrayList<>();
        tset1.add(e1);
        tset1.add(e2);
        tset1.add(e3);
        tset1.add(e4);

        Collections.sort(tset1,new EmployeeSortingBySalary());
        System.out.println("\nSorted by salary ");
        for (int i=0; i<tset1.size(); i++)
            System.out.println(tset1.get(i));

    }
}

class EmployeeSortingBySalary implements Comparator<Employee>
{

    @Override
    public int compare(Employee e1, Employee e2)
    {

        Double sal1=e1.salary;
        Double sal2=e2.salary;

        if(sal1 < sal2)

        return 1;

        else if(sal1 > sal2)
            return -1;
        else
            return 0;
    }
}