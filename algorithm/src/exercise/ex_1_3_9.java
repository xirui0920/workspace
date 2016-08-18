package exercise;

import algorithm.Stack;

import java.util.Scanner;

/**
 * Created by xirui on 2016/3/23.
 * 补全表达式的左括号
 */
public class ex_1_3_9 {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<String>();
        Stack<String> result = new Stack<String>();
        Scanner in = new Scanner(System.in);
        String out = null;
        while (in.hasNext()) {
            String s = in.next();
            if      (s.equals("("))  ;
            else if (s.equals("+"))  ops.push(s);
            else if (s.equals("-"))  ops.push(s);
            else if (s.equals("*"))  ops.push(s);
            else if (s.equals("/"))  ops.push(s);
            else if (s.equals(")")) {
                String val1 = result.pop();
                out= "(" + result.pop() + ops.pop() + val1 + ")";
                result.push(out);
            }else {
                result.push(s);
            }
        }
        System.out.println(out);
    }

}
