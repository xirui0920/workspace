package biji.dataStruc;

public class Tree<E> {
	Tree<E> left;
	E val;
	Tree<E> right;
	
	Tree(Tree<E> left,E val,Tree<E> right){
		this.left = left;
		this.val = val;
		this.right = right;
	}
}
