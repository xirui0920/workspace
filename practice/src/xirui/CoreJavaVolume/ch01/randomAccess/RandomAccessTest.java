package xirui.CoreJavaVolume.ch01.randomAccess;

import java.io.*;
import java.util.*;

/**
 * @version 1.12 2012-05-30
 * DateOutputStream
 * RandomAccessFile 此类的实例支持对随机访问文件的读取和写入。随机访问文件的行为类似存储在文件系统中的一个大型 byte 数组。存在指向该隐含数组的光标或索引，称为文件指针；输入操作从文件指针开始读取字节，并随着对字节的读取而前移此文件指针
 * FileInputStream是顺序读取文件 而RandomAccessFile是随机访问文件 设置指针seek可以访问文件任何地方
 * @author Cay Horstmann
 */
public class RandomAccessTest
{
    public static void main(String[] args) throws IOException
    {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);


        DataOutputStream out = new DataOutputStream(new FileOutputStream("employee.dat"));
        // save all employee records to the file employee.dat
        for (Employee e : staff)
            writeData(out, e);
        //  r表示读取
        RandomAccessFile in = new RandomAccessFile("employee.dat", "r");
        // retrieve all records into a new array

        // compute the array size
        int n = (int)(in.length() / Employee.RECORD_SIZE);
        Employee[] newStaff = new Employee[n];

        // read employees in reverse order
        for (int i = n - 1; i >= 0; i--)
        {
            newStaff[i] = new Employee();
            in.seek(i * Employee.RECORD_SIZE);
            newStaff[i] = readData(in);
        }

        // print the newly read employee records
        for (Employee e : newStaff)
            System.out.println(e);

    }


    /**
     Writes employee data to a data output
     @param out the data output
     @param e the employee
     */
    //DataOutput接口用于将数据从任意 Java 基本类型转换为一系列字节，并将这些字节写入二进制流。同时还提供了一个将 String 转换成 UTF-8 修改版格式并写入所得到的系列字节的工具。

    public static void writeData(DataOutput out, Employee e) throws IOException
    {
        DataIO.writeFixedString(e.getName(), Employee.NAME_SIZE, out);
        out.writeDouble(e.getSalary());

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(e.getHireDay());
        out.writeInt(calendar.get(Calendar.YEAR));
        out.writeInt(calendar.get(Calendar.MONTH) + 1);
        out.writeInt(calendar.get(Calendar.DAY_OF_MONTH));
    }

    /**
     Reads employee data from a data input
     @param in the data input
     @return the employee
     */
    public static Employee readData(DataInput in) throws IOException
    {
        String name = DataIO.readFixedString(Employee.NAME_SIZE, in);
        double salary = in.readDouble();
        int y = in.readInt();
        int m = in.readInt();
        int d = in.readInt();
        return new Employee(name, salary, y, m - 1, d);
    }
}
