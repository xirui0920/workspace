package xirui.Keyword;

/**
 * Created by xirui on 16-3-25.
 * 一、当两个并发线程访问同一个对象object中的这个synchronized(this)同步代码块时，一个时间内只能有一个线程得到执行。另一个线程必须等待当前线程执行完这个代码块以后才能执行该代码块。
 * 二、然而，当一个线程访问object的一个synchronized(this)同步代码块时，另一个线程仍然可以访问该object中的非synchronized(this)同步代码块。
 * 三、尤其关键的是，当一个线程访问object的一个synchronized(this)同步代码块时，其他线程对object中所有其它synchronized(this)同步代码块的访问将被阻塞。
 * 四、第三个例子同样适用其它同步代码块。也就是说，当一个线程访问object的一个synchronized(this)同步代码块时，它就获得了这个object的对象锁。结果，其它线程对该object对象所有同步代码部分的访问都被暂时阻塞。
 * 五、以上规则对其它对象锁同样适用.
 * 1． 定义private 的instance变量+它的 get方法，而不要定义public/protected的instance变量。如果将变量定义为public，对象在外界可以
 * 绕过同步方法的控制而直接取得它，并改动它。这也是JavaBean的标准实现方式之一。
 * 2． 如果instance变量是一个对象，如数组或ArrayList什么的，那上述方法仍然不安全，因为当外界对象通过get方法拿到这个instance对象
 * 的引用后，又将其指向另一个对象，那么这个private变量也就变了，岂不是很危险。 这个时候就需要将get方法也加上synchronized同步，并
 * 且，只返回这个private对象的clone()――这样，调用端得到的就是对象副本的引用了
 *
 */
public class Demo_synchronized {
    //情况一
    static class Thread1 implements Runnable{
        @Override
        public void run() {
            synchronized(this) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + " synchronized loop " + i);
                }
            }
        }
    }
    //情况二
    static class Thread2 {

        public void m4t1() {
            synchronized (this) {
                int i = 5;
                while (i-- > 0) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ie) {
                    }
                }
            }
        }

        public void m4t2() {
            int i = 5;
            while (i-- > 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                }
            }
        }
    }
    //情况三
    static class Thread3 {

        public void m4t1() {
            synchronized (this) {
                int i = 5;
                while (i-- > 0) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ie) {
                    }
                }
            }
        }

        public void m4t2() {
            synchronized(this) {
                int i = 5;
                while( i-- > 0) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ie) {
                    }
                }
            }
        }
    }



    public static void main(String[] args) {
/*      情况一
       Thread1 t1 = new Thread1();  //只创建了一个Thread1对象 都要进入这个对象的synchronized代码块运行
        Thread ta = new Thread(t1, "A");
        Thread tb = new Thread(t1, "B");
        ta.start();
        tb.start();*/

   /*   请款二
        final Thread2 myt2 = new Thread2();
        Thread t1 = new Thread(  new Runnable() {  public void run() {  myt2.m4t1();  }  }, "t1"  );  //这样写只创建了一个Thread2对象，但创建了2个线程运行这一个对象中的2个方法
        Thread t2 = new Thread(  new Runnable() {  public void run() { myt2.m4t2();   }  }, "t2"  );
        t1.start();
        t2.start();*/

        final Thread3 myt2 = new Thread3();
        Thread t1 = new Thread(  new Runnable() {  public void run() {  myt2.m4t1();  }  }, "t1"  );  //这样写只创建了一个Thread2对象，但创建了2个线程运行这一个对象中的2个方法
        Thread t2 = new Thread(  new Runnable() {  public void run() { myt2.m4t2();   }  }, "t2"  );
        t1.start();
        t2.start();
    }
}
