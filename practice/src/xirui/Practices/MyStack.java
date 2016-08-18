package xirui.Practices;

/**
 * Created by Xirui on 2015/9/15.
 */
public class MyStack {
    private java.util.ArrayList list = new java.util.ArrayList();

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    public int search(Object o) {
        return list.lastIndexOf(o);
    }

    public  String toString() {
        return "stack : " + list.toString();
    }
}


