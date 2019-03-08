class Student1 {
    int studentRollNumber;
    String studentName;

    Student1(int studentRollNumber, String studentName) {
        this.studentRollNumber = studentRollNumber;
        this.studentName = studentName;
    }

    public int getStudentRollNumber() {
        return studentRollNumber;
    }

    public void setStudentRollNumber(int studentRollNumber) {
        this.studentRollNumber = studentRollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    void getStudent() {
        System.out.println("Student roll number: " + this.getStudentRollNumber() + ", name: " + this.getStudentName());
    }
}

interface CanAccess {
    void access(Student1 student);
}

class UniversityEmployee implements CanAccess {
    String employeeDesignation;

    UniversityEmployee() {
        this.employeeDesignation = "non-admin";
    }

    @Override
    public void access(Student1 student) {
        System.out.println("As a " + employeeDesignation + " employee of the University, I do not have access to students' details");
    }
}

class AdminProxy extends UniversityEmployee {

    public AdminProxy() {
        employeeDesignation = "admin";
    }

    @Override
    public void access(Student1 student) {
        System.out.println("As an " + employeeDesignation + " employee of the University, I have access to students' details");
        student.getStudent();
    }
}

public class ProxyDemo {
    public static void main(String[] args) {
        Student1 student1 = new Student1(1552, "Deepika");
        CanAccess nonAdmin = new UniversityEmployee();
        nonAdmin.access(student1);
        CanAccess admin = new AdminProxy();
        admin.access(student1);
    }
}