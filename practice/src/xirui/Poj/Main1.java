package xirui.Poj;

import java.util.Scanner;

/**
 * Created by xirui on 2016/4/19.
 * * 检测单词数组中 单词收尾是否可以相连接
 * abc,cde,efg,ghk return 1
 * abc,efg,cde,ghk return 1
 * abc,sda,erwa,word retutn -1
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        String[] s = in.split(",");
        System.out.println(canArrangeWords(s));
    }

    public static boolean test(String s) {
        for (int i = 0;i < s.length();i++ ){
            if ((s.charAt(i) >= 'a' && s.charAt(i) <=  'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){}
            else return false;
        }
        return true;
    }

    public static int canArrangeWords(String arr[])
    {
        int wordL;
        int arrL = arr.length;
        int[] result1 = new int[100];
        int[] result2 = new int[100];
        for (int i = 0; i < arrL; i++){
            wordL = arr[i].length();
            if(wordL < 2 || wordL > 100) System.exit(0);
            for(int j = 0;j < wordL; j++){
                if((arr[i].charAt(j) >= 'a' && arr[i].charAt(j) <=  'z') || (arr[i].charAt(j) >= 'A' && arr[i].charAt(j) <= 'Z')){}
                else System.exit(0);
            }
            result1[i] = (int)arr[i].charAt(0);
            result2[i] = (int)arr[i].charAt(wordL-1);
        }

        int count=0;
        for(int i = 0 ;i<arrL;i++){
            for(int j = 0 ;j<arrL;j++){
                if(result1[i] == result2[j]){
                    count++;
                }
            }
        }
        if(count == arrL-1) {return 1;}
        else                {return -1;}
    }

}
