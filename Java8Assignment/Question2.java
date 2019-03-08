@FunctionalInterface
interface MyFunctionalInterface{
    int myFunction(int a,int b);
}

public class Question2 {
    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface=(a,b)->a+b;
        System.out.println(myFunctionalInterface.myFunction(1,2));
    }
}