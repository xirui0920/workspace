package xirui.IOtest;

import java.io.*;

/**
 * Created by xirui on 2016/3/29.
 */
public class ReaderDemo {
    public static void main(String[] args) {
        readfileByChar("D:\\快盘\\Xirui_Workspaces\\algorithm\\bin\\algorithm\\1Kints.txt");
    }

    public static void readfileByChar(String filename) {
        File file = new File(filename);
        Reader reader = null;
        try {
                                                                    //System.out.println("以字符为单位读取文件内容，一次读一个字符：");
                                                                    //一次读一个字符
            reader = new InputStreamReader(new FileInputStream(file));
            int tempchar,i=0;
            while ((tempchar = reader.read()) != -1) {
                                                                    // 对于windows下，\r\n这两个字符在一起时，表示一个换行。
                                                                    // 但如果这两个字符分开显示时，会换两次行。
                                                                      // 因此，屏蔽掉\r，或者屏蔽\n。否则，将会多出很多空行。
                if (((char) tempchar) != '\r') {
                    System.out.print((char) tempchar);
                    i++;
                }
            }
            reader.close();
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
 /*       try {
            System.out.println("以字符为单位读取文件内容，一次读多个字符：");
            // 一次读多个字符
            char[] tempchars = new char[30];
            int charread = 0;
            reader = new InputStreamReader(new FileInputStream(fileName));
            // 读入多个字符到字符数组中，charread为一次读取字符数
            while ((charread = reader.read(tempchars)) != -1) {
                // 同样屏蔽掉\r不显示
                if ((charread == tempchars.length)
                        && (tempchars[tempchars.length - 1] != '\r')) {
                    System.out.print(tempchars);
                } else {
                    for (int i = 0; i < charread; i++) {
                        if (tempchars[i] == '\r') {
                            continue;
                        } else {
                            System.out.print(tempchars[i]);
                        }
                    }
                }
            }

        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    */
    }
}
