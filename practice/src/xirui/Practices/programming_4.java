package xirui.Practices;

import java.util.Scanner;

/**
 * Created by Xirui on 2015/12/22.
 * 正整数分解质因数
 */
public class programming_4 {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        System.out.print(number + "=");
        myfunction(number);

    }

    public static void myfunction(int n) {
        for (int i=2;i<n+1;i++){
            if (programming_2.myfunction(i)) {        //如果myfunction返回1表示i是一个质数即素数

                if (n == i) {
                    System.out.println(n);  //如果正整数n和当前判断质数相等输出这个数结束过程
                    break;
                }
                if (n % i ==0) {                         //如果n能被i整除 则i是一个质因数输出i ，n变为n/i 继续这个过程
                    System.out.print(i + "*");
                    n = n / i;
                    myfunction(n);
                    break;             //处理递归尾！
                }

            }
        }
    }
}
