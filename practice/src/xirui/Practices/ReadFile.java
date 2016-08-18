package xirui.Practices;

import java.io.*;

/**
 * Created by Xirui on 2015/9/13.
 * 简单文件读取和写入
 */
public class ReadFile {
    public static void main(String[] args){
        File file = new File("hello.txt");
        if(file.exists()){
            System.err.println("文件存在");
            try {
                FileInputStream fis = new FileInputStream(file);
                InputStreamReader isr = new InputStreamReader(fis,"utf-8");
                BufferedReader br = new BufferedReader(isr);

                String line;
                while((line = br.readLine())  != null){
                    System.out.println(line);
                }
                br.close();
                isr.close();
                fis.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


            try {


                File newfile = new File("hello.txt");
                FileOutputStream fos = new FileOutputStream(newfile);
                OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
                BufferedWriter bw = new BufferedWriter(osw);

                bw.write("我是文字");

                bw.close();
                osw.close();
                fos.close();

                System.out.println("写入完成");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
