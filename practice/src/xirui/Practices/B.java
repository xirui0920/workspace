package xirui.Practices;

/**
 * Created by Xirui on 2015/9/20.
 */
public class B extends A{
    public String show(B obj){
        return ("B and B");
    }

    public String show(A obj){
        return ("B and A");
    }
}