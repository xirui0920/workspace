package xirui.Keyword;

/**
 * Created by xirui on 2016/5/11.
 * fianl修饰方法 使方法锁定 防止继承类修改它的含义
 * final修饰类 使该类不会被继承 同时该类成员方法隐式的被指定为final方法
 * fianl修饰变量 如果修饰基本数据类型则该数据一旦被初始化后便不能修改， 如果修饰引用变量，该引用变量不能在指向其他对象，但它原本指向对象可以改变
 * final修饰类的成员变量该变量相当于编译器常量
 */
public class Demo_final {
    public static void main(String[] args){
        test1();
        test2();
    }
    //在用到该final变量的地方 编译器直接替换其值
    public static void test1(){
        String a = "hello2";
        final String b = "hello";
        String d = "hello";
        String c = b + 2;
        String e = d + 2;
        System.out.println(a==c);
        System.out.println(a==e);
    }

    public static void test2(){
        String a = "hello2";
        final String b = getHello();
        String d = "hello";
        String c = b + 2;
        String e = d + 2;
        System.out.println(a==c);
        System.out.println(a==e);
    }

    public static String getHello(){
        return "hello";
    }


}
