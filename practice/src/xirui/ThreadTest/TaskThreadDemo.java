package xirui.ThreadTest;



/**
 * Created by Xirui on 2015/9/17.
 * 多线程应用
 */
public class TaskThreadDemo {

    static class PrintChar implements Runnable {
        private char charToPrint;
        private int times;

        public PrintChar(char c,int t) {
            charToPrint = c;
            times = t;
        }

        public void run() {
            for (int i = 0;i<times;i++) {
                System.out.print(charToPrint);
            }
            //System.out.println();
        }
    }

    static class PrintNum implements Runnable {
        private int lastNum;

        public PrintNum(int n) {
            lastNum = n;
        }
        //override 这个run（）方法
        public void run() {
            for (int i = 1;i<=lastNum;i++) {
                System.out.print(" " + i);
            }
            //System.out.println();
        }

    }

    public static void main(String[] args) {
        //创建任务
        Runnable printA = new PrintChar('a',1000);
        Runnable printB = new PrintChar('b',100);
        Runnable print100 = new PrintNum(10);
        //创建线程
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);
        //开始线程
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
