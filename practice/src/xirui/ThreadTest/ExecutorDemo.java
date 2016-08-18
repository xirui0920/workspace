package xirui.ThreadTest;
import java.util.concurrent.*;
/**
 * Created by Xirui on 2015/9/23.
 * 线程池
 */
public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService excutor = Executors.newFixedThreadPool(3);

        excutor.execute(new TaskThreadDemo.PrintChar('a',100));
        excutor.execute(new TaskThreadDemo.PrintChar('b',100));
        excutor.execute(new TaskThreadDemo.PrintNum(100));

        excutor.shutdown();
    }
}
