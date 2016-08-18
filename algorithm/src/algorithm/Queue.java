package algorithm;

import java.util.Iterator;

/**
 * Created by xirui on 2016/3/21.
 */
public class Queue<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int N;
    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {return first == null;}

    public int size() {return N;}

    public void enqueue(Item item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else  oldlast.next = last;
        N++;
    }

    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        N--;
        return item;
    }

    public Iterator<Item> iterator() {return new queueIterator();}
    private class queueIterator implements Iterator<Item> {
        private Node temp = first;
        public boolean hasNext() { return temp!=null;}

        public Item next() {
            Item item = temp.item;
            temp = temp.next;
            return item;
        }
        public void remove() {}
    }
}
