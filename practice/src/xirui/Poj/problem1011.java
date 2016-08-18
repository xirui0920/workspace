package xirui.Poj;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Xirui on 2015/12/26.
 * 贪心算法
 */
public class problem1011 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out,true);
        int[] r = new int[10];
        int j=0;
        while (in.hasNext("0")==false) {
            int x = 0;
            x = in.nextInt();
            int sum=0;
            int[] a = new int[x];
            for (int i = 0; i < x; i++) {
                a[i] = in.nextInt();
                sum+=a[i];
            }
            int b = getMax(a),flag=0;
            int c = x / 2;
            do {
                b++;
                if (sum % b ==0){
                    r[j++] = b;
                    flag=1;
                }
            }while (flag!=1);
        }
        for (int k=0;k<j;k++){
            out.println(r[k]);
        }
    }

    public static int getMax(int[] a){
        int Max=a[0];
        for (int i=0,j=a.length;i<j;i++){
            if (a[i] > Max) {
                Max = a[i];
            }
        }
        return Max;
    }
}
