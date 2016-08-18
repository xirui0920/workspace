package xirui.Practices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Xirui on 2015/12/22.
 * 统计字符串中的数字字母空格
 */
public class programming_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  //输入流
        String str=br.readLine();
        int countNum = 0;//统计数字的个数
        int countChar = 0;//统计英文字母的个数
        int countSpace = 0;//统计空格的个数
        int countOthers = 0;//统计其它字符的个数
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && (int) c <= '9') {
                countNum++;
            } else if ((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')) {
                countChar++;
            } else if (c == ' ') {
                countSpace++;
            } else{
                countOthers++;
            }
        }
        System.out.println("数字个数:"+countNum);
        System.out.println("英文字母个数:"+countChar);
        System.out.println("空格个数:"+countSpace);
        System.out.println("其他字符个数:"+countOthers);
        br.close();
    }
}
