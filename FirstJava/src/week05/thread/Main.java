package week05.thread;

public class Main {
    public static void main(String[] args) {


        //1. TestThread 이용하기
        //TestThread thread = new TestThread();
        //thread.start(); // thread.run() 도 되긴함

        // 2. Runnable 인터페이스 사용하기
        //Runnable run = new TestRunnable();
        //Thread thread = new Thread(run);

        //thread.start();

        Runnable task = () -> {
            int sum = 0;
            sum += 1;
            for (int i = 0; i < 50; i++) {
                sum += i;
                System.out.println(sum);
            }
            System.out.println(Thread.currentThread().getName() + "최종 합 : " + sum);


        };

        Thread thread1 = new Thread(task);
        thread1.setName("thread1");
        Thread thread2 = new Thread(task);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();
    }

}