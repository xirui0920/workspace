package xirui.CoreJavaVolume.ch01;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created by Administrator on 16-4-5.
 */
public class TestZIP {
    public static void main(String[] args) throws Exception {
        ZipInputStream zin = new ZipInputStream(new FileInputStream("D:\\1.zip"));


/*        ZipEntry entry;
        byte[] buff = new byte[1024];
        while ((entry = zin.getNextEntry()) != null){
            zin.read(buff,0,(int)entry.getCompressedSize());
            System.out.println(buff.toString());
            zin.closeEntry();
        }
        zin.close();*/


        Scanner in = new Scanner(zin);
        while (in.hasNextLine()){
            String s = in.nextLine();
            System.out.println(s);
        }
        zin.close();
    }
}
