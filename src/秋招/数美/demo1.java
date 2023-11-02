package 秋招.数美;

/**
 * @ClassName: demo1
 * @Description:
 * @Author: lww
 * @Date: 11/2/23 3:38 PM
 * @Version: V1
 **/
public class demo1 {
    public static void main(String[] args) {
        Thread[] threads = new Thread[3];
        for (int i = 0; i < 3; i++) {
            threads[i] = new Thread(new PrintNumber(i + 1, 3));
            threads[i].start();
        }
    }
}

class PrintNumber implements Runnable {
    private static final int Max_Number = 10;
    private static final Object lock = new Object();
    private static int num = 1;
    private int threadId;
    private int totalThreads;
    public PrintNumber(int threadId, int totalThreads) {
        this.threadId = threadId;
        this.totalThreads = totalThreads;
    }
    @Override
    public void run() {
        while (num <= Max_Number) {
            synchronized (lock) {
                if ( (num - 1) % totalThreads == threadId - 1) {
                    System.out.print("abc");
                    num++;
                    lock.notifyAll();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
