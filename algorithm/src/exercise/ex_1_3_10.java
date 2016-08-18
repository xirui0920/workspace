package exercise;

import algorithm.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by xirui on 2016/3/28.
 *  Compilation:  javac InfixToPostfix.java
 *  Execution:    java InfixToPostFix
 *  Dependencies: Stack.java StdIn.java StdOut.java
 *
 *  Reads in an infix expression and outputs an equivalent postfix
 *  expression.
 *
 *  Windows users: replace [Ctrl-d] with [Ctrl-z] to signify end of file.
 *
 *  % java InfixToPostfix
 *  ( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )
 *  [Ctrl-d]
 *  2 3 4 + 5 6 * * +
 *
 *  % java InfixToPostfix | java EvaluatePostfix
 *  ( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )
 *  [Ctrl-d]
 *  212
 *
 ******************************************************************************/

    public class ex_1_3_10 {
        public static void main(String[] args) {
            Stack<String> stack = new Stack<String>();
            while (!StdIn.isEmpty()) {
                String s = StdIn.readString();
                if      (s.equals("+")) stack.push(s);
                else if (s.equals("*")) stack.push(s);
                else if (s.equals(")")) StdOut.print(stack.pop() + " ");
                else if (s.equals("(")) StdOut.print("");
                else                    StdOut.print(s + " ");
            }
            StdOut.println();
        }
    }




