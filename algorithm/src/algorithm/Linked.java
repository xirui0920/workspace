package algorithm;
/**
 * Created by Xirui on 2015/10/12.
 * 双向链表
 * 仿照java API 实现
 */
public class Linked<E> {
	Node<E> first;
	Node<E> last;
	int size = 0;
	public Linked(){	}
	private static class Node<E> {
		E item;
		Node<E> next;
		Node<E> prev;
		
		Node(Node<E> prev,E element,Node<E> next){
			this.prev = prev;
			this.item = element;
			this.next = next;
		}
		
	}
	
	public int size(){return size;}
	
	public boolean add(E e){
		final Node<E> l = last;
		final Node<E> newNode = new Node<E>(l,e,null);
		last = newNode;
		if (l == null) {
			first = newNode;
		}else {
			l.next = newNode;
		}
		size++;
		return true;
	}
	
	public void add(int index,E e){
		checkIndex(index);
		if (index == size) {
			add(e);
		}else{
			addBefore(e, node(index));
		}

	}
	
	public E get(int index){
		checkIndex(index);
		return node(index).item;
	}
	
    public boolean remove(Object o) {
        if (o == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.item == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (o.equals(x.item)) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }
    
    public E remove(int index){
    	checkIndex(index);
    	return unlink(node(index));
    }
    
    public void list(){
    	for (Node<E> x = first;x != null;x = x.next) {
			System.out.println(x.item);
		}
    }
    
    
    //删除节点X 并返回节点X的值
    E unlink(Node<E> x) {
        // assert x != null;
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        return element;
    }
	
	//按下标查找节点返回节点
	Node<E> node(int index){
		if (index < (size >> 1)) {
			Node<E> x = first;
			for (int i = 0; i < index; i++) {
				x = x.next;
			}
			return x;
		}else {
			Node<E> x = last;
			for (int i = size-1; i > index; i--) {
				x = x.prev;
			}
			return x;
		}
	}
	//在temp节点之前添加节点
	void addBefore(E e,Node<E> temp){
		final Node<E> pred = temp.prev;
		final Node<E> newNode = new Node<E>(pred,e,temp);
		temp.prev = newNode;
		if (pred == null) {
			first = newNode;
		}
		else{
			pred.next = newNode;
		}
		size++;
	}
	
	private void checkIndex(int index){
		if(!(index >=0 && index <= size)){
			throw new IndexOutOfBoundsException();
		}
	}
	

}