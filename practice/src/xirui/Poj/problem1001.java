package xirui.Poj;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Xirui on 2015/12/24.
 * 格式化输出问题未解决  --- 把结果转变为字符串格式化处理
 * 输入问题
 * 数据储存
 * 结果输出
 */
public class problem1001 {

    public static void main(String[] args) {
        ArrayList<BigDecimal> inputR = new ArrayList<BigDecimal>();
        ArrayList<Integer> inputN = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int i=0;
        while (i<6) {
            inputR.add(in.nextBigDecimal());
            inputN.add(in.nextInt());
            i++;
        }
        BigDecimal result = null;
        for (int k=0;k<6;k++) {
            result =  inputR.get(k).pow(inputN.get(k));
            String fre = result.toPlainString();
            if (fre.contains(".") == false){
                System.out.println(fre);
            }
            else {
                int x = 0, y = fre.length() - 1;
                while (fre.charAt(x) == '0') x++;
                while (fre.charAt(y) == '0') y--;
                if (fre.charAt(y) != '.') y++;
                System.out.println(fre.substring(x, y));
            }
        }
    }
}

/*
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out, true);

    public static void main(String[] args)
    {
        BigDecimal a,c;
        int b;
        while (cin.hasNext())
        {
            a = cin.nextBigDecimal();
            b = cin.nextInt();
            c = a.pow(b);
            String ans = c.toPlainString();
            if (ans.contains(".") == false)
            {
                cout.println(ans);
            }
            else
            {
                int x = 0, y = ans.length() - 1;
                while (ans.charAt(x) == '0') x++;
                while (ans.charAt(y) == '0') y--;
                if (ans.charAt(y) != '.') y++;
                cout.println(ans.substring(x, y));
            }

        }
    }
}*/
