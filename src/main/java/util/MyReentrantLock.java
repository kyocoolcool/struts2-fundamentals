package util;

public class MyReentrantLock extends Thread {

    public static java.util.concurrent.locks.ReentrantLock lock=new java.util.concurrent.locks.ReentrantLock();
    public static int i = 0;

    public MyReentrantLock(String name) {
        super.setName(name);
    }

    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            lock.lock();
            try {
                System.out.println(this.getName() + " " + i);
                i++;
            } finally {
                lock.unlock();
            }
        }
    }

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        MyReentrantLock test1 = new MyReentrantLock("thread1");
        MyReentrantLock test2 = new MyReentrantLock("thread2");

        test1.start();
        test2.start();
        test1.join();
        test2.join();
        System.out.println(i);
    }
}

