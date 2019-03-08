import java.util.*;

class Student
{
    String name;
    Double score;
    Double age;


    Student(String name, Double score, Double age)
    {
        this.age=age;
        this.score=score;
        this.name=name;
    }

    public String toString()
    {
        return "name : "+name+"---age : "+age+"---score : "+score;
    }
}




public class Question5 {

    public static void main(String[] args) {
        Student s1=new Student("Dhruv",100.0,24.0);
        Student s2=new Student("Divya",80.0,24.5);
        Student s3=new Student("Deepika",80.0,26.0);
        Student s4=new Student("Souvik",70.0,25.5);


        List<Student> tset1=new ArrayList<>();
        tset1.add(s1);
        tset1.add(s2);
        tset1.add(s3);
        tset1.add(s4);

        Collections.sort(tset1,new StudentSortOnScoreAndName());
        System.out.println("\nSorted by score(decreasing) [if same then by name in dictionary order]");
        for (int i=0; i<tset1.size(); i++)
            System.out.println(tset1.get(i));

    }
}

class StudentSortOnScoreAndName implements Comparator<Student>
{

    @Override
    public int compare(Student s1, Student s2)
    {

        Double score1=s1.score;
        Double score2=s2.score;

        if(score1 < score2)

            return 1;

        else if(score1 > score2)
            return -1;
        else
        {


            return s1.name.compareTo(s2.name);
        }
    }
}