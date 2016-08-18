package xirui.IOtest;

/**
 * Created by Xirui on 2015/11/3.
 */

import java.io.*;

public class ObjetStream {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO自动生成的方法存根
        ObjectOutputStream objectwriter=null;
        ObjectInputStream objectreader=null;

        try {
            objectwriter=new ObjectOutputStream(new FileOutputStream("C:/Users/Xirui/Desktop/create1.txt"));
            objectwriter.writeObject(new Student("gg", 22));
            objectwriter.writeObject(new Student("tt", 18));
            objectwriter.writeObject(new Student("rr", 17));
            objectreader=new ObjectInputStream(new FileInputStream("C:/Users/Xirui/Desktop/create1.txt"));
            for (int i = 0; i < 3; i++) {
                System.out.println(objectreader.readObject());
            }
        } catch (IOException e) {
            // TODO自动生成的 catch 块
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally{
            try {
                objectreader.close();
                objectwriter.close();
            } catch (IOException e) {
                // TODO自动生成的 catch 块
                e.printStackTrace();
            }

        }

    }

}
class Student implements Serializable{
    private String name;
    private int age;

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }


}