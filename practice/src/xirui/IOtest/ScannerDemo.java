package xirui.IOtest;

import java.util.Scanner;

/**
 * Created by Xirui on 2015/12/24.
 */
public class ScannerDemo {
    public static void main(String[] args) {

        String s = "Hello World! 3+3.0=6";
        String temp;
        int n = 1234;
        temp = String.valueOf(n);
        // create a new scanner with the specified String Object
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("q")){
            temp = scanner.next();
        }

        //System.out.println(scanner.next());
        // check if the scanner's next token matches "World"
        System.out.println("" + scanner.hasNext("World!"));

        // check if the scanner's next token matches "Hello"
        System.out.println("" + scanner.hasNext("Hello"));

        // print the rest of the string
        System.out.println("" + scanner.nextLine());

        // close the scanner
        scanner.close();
        System.out.println(temp.charAt(1));
    }
}
