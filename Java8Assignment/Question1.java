@FunctionalInterface
interface Greater
{
    boolean isGreat(int a, int b);
}


@FunctionalInterface
interface Increment
{
    int increment(int c);
}


@FunctionalInterface
interface Concat
{
    String concate(String a, String b);
}


@FunctionalInterface
interface UpperCase
{
    String Upper(String lower);
}

public class Question1 {
    public static void main(String[] args) {
        Greater greater=(int a, int b) ->{

            if(a>b) return true;
            else
                return false;

        };


        Increment inc=s-> ++s;


        Concat concat=(s1,s2)-> s1+s2;

        UpperCase upper=s3-> s3.toUpperCase();

        System.out.println(greater.isGreat(5,6));
        System.out.println(inc.increment(7));
        System.out.println(concat.concate("A1","A2"));
        System.out.println(upper.Upper("ghi"));

//        ((XYZ)() -> return a+b)
    }
}
