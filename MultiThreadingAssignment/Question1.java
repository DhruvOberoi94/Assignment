

class ThreadDemo extends Thread {

    @Override
    public void run() {
        System.out.println("Running Thread Demo : "+Thread.currentThread().getName());
    }
}




public class Question1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Running Runnable Thread : "+Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        new Thread(new Question1()).start();
        new ThreadDemo().start();
    }
}