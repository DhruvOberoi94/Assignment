
@FunctionalInterface
interface EmployeeInterface
{
    Employee create(String name, Integer age, String city);
}



class Employee {
    String name;
    Integer age;
    String city;

    Employee(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    String getName() {
        return name;

    }


    Integer getAge() {
        return age;
    }

    String getCity() {
        return city;

    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}

public class Question4
{
    public static void main(String[] args) {

        EmployeeInterface employeeInterface=Employee::new;
        Employee employee=employeeInterface.create("DHRUV",24,"DELHI");
        System.out.println(employee);
        System.out.println(employee.getCity());
    }
}
