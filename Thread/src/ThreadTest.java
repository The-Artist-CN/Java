import org.junit.jupiter.api.Test;

public class ThreadTest {
//    1. 线程的基本状态
//    线程在其生命周期中会经历以下几种状态：
//
//    NEW（新建）： 线程对象被创建，但尚未调用 start() 方法。
//    RUNNABLE（可运行）： 调用 start() 方法后，线程进入可运行状态，等待被操作系统调度执行。
//    BLOCKED（阻塞）： 线程等待进入同步块或方法时，会进入阻塞状态。
//    WAITING（等待）： 线程调用 Object.wait() 或 Thread.join() 等方法时，会进入等待状态，直到被显式唤醒。
//    TIMED_WAITING（计时等待）： 线程调用带超时参数的方法（如 sleep(time)、join(time)）后，进入计时等待状态。
//    TERMINATED（终止）： 线程执行完毕或因异常退出，进入终止状态。
    @Test
    public void test_01() throws InterruptedException{
        Thread t1 = new Thread(() -> {
            System.out.println("Thread is running");
            try {
                Thread.sleep(2000);
            } catch ( InterruptedException e ){
                e.printStackTrace();
            }
        });

        System.out.println("State after creation : " + t1.getState());
        t1.start();
        System.out.println("State after start : " + t1.getState());
        Thread.sleep(5000);
        System.out.println("State after main thread sleep : " + t1.getState());
        t1.join();
        System.out.println("State after termination : " + t1.getState());

    }
}
