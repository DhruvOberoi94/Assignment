import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Question15 {

    Lock lock = new ReentrantLock(true);
    Condition condition = lock.newCondition();

    public void worker1() {
        try {
            lock.lock();
            System.out.println("worker 1 Started");
            condition.await();
            System.out.println("worker 1 Finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void worker2() {
        try{
            lock.lock();
            System.out.println("worker 2 Started");
            System.out.println("worker 2 Finished");
            condition.signal();
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Question15 question15 = new Question15();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                question15.worker1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                question15.worker2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
