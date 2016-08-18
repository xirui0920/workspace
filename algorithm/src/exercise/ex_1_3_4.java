package exercise;

import algorithm.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by xirui on 2016/3/23.
 * % java Ex_1_3_04
 * [()]{}{[()()]()}
 * true
 *
 * % java Ex_1_3_04
 * [(])
 * false
 */
public class ex_1_3_4 {

    public static boolean isBalanced(String s)
    {
        Stack<Character> open = new Stack<Character>();
        int n = s.length();

        for (int i = 0; i < n; i++)
        {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{')
                open.push(c);
            else if ((c == ')' && (open.isEmpty() || open.pop() != '(')) ||
                    (c == ']' && (open.isEmpty() || open.pop() != '[')) ||
                    (c == '}' && (open.isEmpty() || open.pop() != '{')))
                return false;
        }

        return open.isEmpty();
    }

    public static void main(String[] args)
    {
        String s = StdIn.readAll().trim();

        StdOut.println(isBalanced(s));
    }
}
