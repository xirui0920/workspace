package xirui.Practices;

import java.util.Scanner;

/**
 * Created by Xirui on 2015/12/20.
 */
public class programming_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int months = input.nextInt();
        System.out.println(months + "个月后兔子数是：" + function(months));
    }

    public static int function(int months) {
        if (months == 1 || months == 2)
            return 1;
        else
            return function(months - 1) + function(months - 2);
        //递归算出每个月兔子数 兔子数是一个斐波列奇数列
    }
}
