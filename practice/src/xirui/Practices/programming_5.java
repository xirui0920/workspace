package xirui.Practices;

import java.util.Scanner;

/**
 * Created by Xirui on 2015/12/22.
 */
public class programming_5 {
    public static void main(String[] args) {
        int i; //学生成绩     输入数据检查限制
        Scanner in = new Scanner(System.in);
        i = in.nextInt();
        String k = (i >= 90) ? "A" : ((i >= 60) ? "B" : "C");//成绩等级
        System.out.println(k);
    }
}
