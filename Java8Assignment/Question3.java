@FunctionalInterface
interface MyFunctionalInterrface{
    int myFunction(int a,int b);
}

public class Question3 {
    private int addNumbers(int a,int b){
        return (a+b);
    }
    private int subtractNumbers(int a,int b){
        return (a-b);
    }
    static private int multiplyNumbers(int a,int b){
        return (a*b);
    }

    public static void main(String[] args) {
        MyFunctionalInterrface myFunctionalInterrface=new Question3()::addNumbers;
        MyFunctionalInterrface myFunctionalInterrface2=new Question3()::subtractNumbers;
        MyFunctionalInterrface myFunctionalInterrface3=Question3::multiplyNumbers;
        System.out.println(myFunctionalInterrface.myFunction(3,4));
        System.out.println(myFunctionalInterrface2.myFunction(3,4));
        System.out.println(myFunctionalInterrface3.myFunction(3,4));
        // System.out.println(myFunctionalInterface.myFunction(3,4));


        //  Object
    }
}
