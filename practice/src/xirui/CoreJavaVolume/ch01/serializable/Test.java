package xirui.CoreJavaVolume.ch01.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Administrator on 16-4-8.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Orientation orientation = Orientation.HORIZONTAL;
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("date.dat"));
        out.writeObject(orientation);
        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("date.dat"));
        Orientation save = (Orientation) in.readObject();
        if (save == Orientation.HORIZONTAL){
            System.out.println("yes");
        }
    }
}
