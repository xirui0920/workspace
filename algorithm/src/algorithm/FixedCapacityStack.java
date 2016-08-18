package algorithm;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * Created by Xirui on 2015/10/12.
 * 修改变成不定容栈
 */
public class FixedCapacityStack<Item> implements Iterable<Item>{
    private Item[] a = (Item[])new Object[1];
    private int N=0;
  /*  public FixedCapacityStack(int cap){
        a = (Item[]) new Object[cap];
    }*/
    public boolean isEmpty(){
        return N==0;
    }
    public int size() {
        return N;
    }
    //实现栈压入元素时数组不够时扩容
    private void resize(int max) {
        Item[] temp =(Item[]) new Object[max];
        for (int i=0;i<N;i++) {
            temp[i] = a[i];
        }
        a = temp;
    }
    public void push(Item item) {
        if (N == a.length) resize(2*a.length);
        a[N++] = item;
    }
    //栈中元素过少时减容。
    public Item pop(){
        if  (N == 0) {throw new EmptyStackException();}           //如果栈为空抛出异常
        Item item = a[--N];
        a[N] = null;  //避免对象游离
        if (N>0 && N == a.length/4) resize(a.length/2);
        return item;
    }

    public Iterator<Item> iterator() {
        return new FixedCapcityIterator();
    }

    private class FixedCapcityIterator implements Iterator<Item>{
        private  int i = N;
        public boolean hasNext() { return i > 0;}
        public  Item next() {return  a[--i];}
        public void remove() {}
    }
    public static void main(String[] args) {
        FixedCapacityStack<String> s = new FixedCapacityStack<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            s.push(item);
        }
        System.out.println("(" + s.size() + " left on stack)");
        for (String a : s){
            StdOut.println(a);
            s.pop();
        }
        System.out.println("(" + s.size() + " left on stack)");
    }
}
