package biji.dataStruc;

import java.util.LinkedList;
import java.util.Stack;

/*
 * 迭代 前序遍历二叉树
 */
public class PreTree {
	
	public static void main(String[] args) {
		Tree<String> a = new Tree<String>(null, "A", null);
		Tree<String> c = new Tree<String>(null, "C", null);
		Tree<String> e = new Tree<String>(null, "E", null);
		Tree<String> g = new Tree<String>(null, "G", null);
		Tree<String> f = new Tree<String>(e, "F", g);
		Tree<String> b = new Tree<String>(a,"B",c);
		Tree<String> d = new Tree<String>(b, "D", f);
		preTraversal(d);
		System.out.println();
		leavelTraversal(d);
	}
	
	static void preTraversal(Tree root){
		Stack<Tree> s = new Stack<Tree>();
		s.push(root);
		while(!s.isEmpty()){
			Tree t;
			System.out.print((t=s.pop()).val+" ");
			if (t.right != null) {s.push(t.right);}
			if (t.left !=null) { s.push(t.left);}
		}
	}
	//层次遍历
	static void leavelTraversal(Tree root){
		LinkedList<Tree> s = new LinkedList<Tree>();
		s.add(root);
		while(!s.isEmpty()){
			Tree t;
			System.out.print((t=s.remove()).val+" ");
			if (t.right != null) {s.add(t.right);}
			if (t.left !=null) { s.add(t.left);}
		}
	}
	
}
