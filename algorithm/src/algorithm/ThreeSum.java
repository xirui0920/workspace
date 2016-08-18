package algorithm;

import edu.princeton.cs.algs4.StdOut;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by xirui on 2016/3/29.
 */
public class ThreeSum {
    public static int count(int[] a ) {
        int N = a.length;
        int cnt = 0;
        for (int i = 0 ;i<N;i++)
            for (int j = i + 1 ;j<N;j++)
                for (int k = j + 1 ;k<N ;k++ )
                    if (a[i] + a[j] + a[k] == 0)
                        cnt++;
        return cnt;
    }
    public static int[] readfileByChar(String filename) {
        int a[] = new int[8000];
        File file = new File(filename);
        Reader reader = null;
        try {
//            System.out.println("以字符为单位读取文件内容，一次读一个字符：");
//            一次读一个字符
            reader = new InputStreamReader(new FileInputStream(file));
            int tempchar,i=0;
            while ((tempchar = reader.read()) != -1) {
// 对于windows下，\r\n这两个字符在一起时，表示一个换行。
// 但如果这两个字符分开显示时，会换两次行。
// 因此，屏蔽掉\r，或者屏蔽\n。否则，将会多出很多空行。
                if (((char) tempchar) != '\r') {
//         0         System.out.print((char) tempchar);
                    a[i] = (char)tempchar;
                    i++;
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = readfileByChar("D:\\快盘\\Xirui_Workspaces\\algorithm\\bin\\algorithm\\1Kints.txt");
        StdOut.println(count(a));
    }
}
