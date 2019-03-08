class SingleTest{
    private static SingleTest t=null;

    private SingleTest(){
    }

    static int i=0;
    public static SingleTest getSingleTest()
    {
        if(t==null) {
            synchronized (SingleTest.class) {
                if (t == null) {
                    t = new SingleTest();
                    System.out.println("this is object no. " + (++i));
                }

            }
        }
        return t;
    }
}



public class SingletonDesign {

    public static void main(String[] args) {
        SingleTest t1=SingleTest.getSingleTest();
        SingleTest t2=SingleTest.getSingleTest();
    }
}
























/*

Double-Checked Locking
        The above implementation works fine and provides thread-safety,
        but it reduces performance because of the cost associated with the synchronized method,
        although we need it only for the first few threads that might create the separate instances
       To avoid this extra overhead every time, the double-checked locking principle is used.
        In this approach, the synchronized block is used inside the if condition with an additional check
        to ensure that only one instance of the singleton class is created.
        Let's see how. Suppose there are two threads, T1 and T2. Both come to create an instance
        and execute “instance==null”. Now both threads have identified the instance variable as null
        and thus assume they must create an instance. They sequentially go to a synchronized block
        and create the instances. In the end, we have two instances in our application.

public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
        if(instance == null){
synchronized (ThreadSafeSingleton.class) {
        if(instance == null){
        instance = new ThreadSafeSingleton();
        }
        }
        }
        return instance;
        }*/
