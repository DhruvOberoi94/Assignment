

public class Question13 {

    public void worker1(){
        synchronized (this) {
            System.out.println("Worker1 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker1 Done");
        }
    }



    public void worker4(){
        synchronized (this) {
            System.out.println("Worker 4 Started");
            System.out.println("Worker 4 Done");
            notify();
        }
    }

    public static void main(String[] args) {
        Question13 question13 = new Question13();
        new Thread(new Runnable() {
            @Override
            public void run() {
                question13.worker1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                question13.worker4();
            }
        }).start();
    }
}
