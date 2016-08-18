package xirui.Practices;

import java.util.Scanner;

/**
 * Created by Xirui on 2015/12/24.
 */
public class programming_7 {
    public static void main(String[] args) {
        int m,n,s=0;
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        int temp=0;
        for (int i = 0;i<n;i++){
            temp = temp * 10 + m;
            s += temp;
        }
        System.out.println(s);
    }
}
