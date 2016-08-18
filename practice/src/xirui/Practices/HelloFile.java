package xirui.Practices;

import java.io.File;
import java.io.IOException;

/**
 * Created by Xirui on 2015/9/13.
 * 文件创建
 */
public class HelloFile {
    public static void main(String[] args){
        File file = new File("hello.txt");
        if (file.exists()){
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
        }
        else {
            System.out.print("文件不存在");
            try {
                file.createNewFile();
                System.out.print("文件创建成功");
            } catch (IOException e) {
                System.out.print("文件创建失败");
               
            }
        }
    }

}

