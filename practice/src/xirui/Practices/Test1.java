package xirui.Practices;

/**
 * Created by Xirui on 2015/9/21.
 */
public class Test1 {
    public static void main(String[] args) {
        //for(int N = 10;N > 0; N--)
        //    System.out.println(toString(N));

        //int a[] = new int[10];
        //for (int i = 0;i<10;i++)
        //    a[i] = 9-i;
        //for (int i = 0;i<10;i++)
        //    a[i] = a[a[i]];
        //for (int i = 0;i<10;i++)
        //    System.out.println(a[i]);
        System.out.println(exR1(5));
    }

    public static String toString(int N) {
        String s = "";
        for (int n = N;n > 0;n /= 2)
            s = (n % 2) + s; //s是String类型 （n % 2）值被强制转换成String 然后连接
        return s;
    }

    public static String exR1(int n) {
        if(n <= 0) return "";
        return exR1(n-3) + n + exR1(n-2) + n;  //非常容易理解递归含义
    }
}
