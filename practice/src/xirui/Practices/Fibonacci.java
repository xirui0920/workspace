package xirui.Practices;


/**
 * Created by Xirui on 2015/9/21.
 */
public class Fibonacci {
    public static long F(int N) {
        if (N==0) return 0;
        if (N==1) return 1;
        return F(N-1) + F(N-2);
    }

    public static  long[] F1(int n) {
        long[] Fibonacci = new long[n];
        if (n<=0) return Fibonacci;
        if (n==1) {
            Fibonacci[0] = 1;
            return Fibonacci;
        }
        if (n==2) {
            Fibonacci[0] = 1;
            Fibonacci[1] = 1;
            return Fibonacci;
        }
        Fibonacci[0] = 1;
        Fibonacci[1] = 1;
        for (int i = 2;i<n;i++){
            Fibonacci[i] = Fibonacci[i-1] + Fibonacci[i-2];
        }
        return Fibonacci;
    }

    public static void main(String[] args) {
        for (int N = 0;N<100;N++)
            System.out.println(F1(100)[N]);
    }
}
