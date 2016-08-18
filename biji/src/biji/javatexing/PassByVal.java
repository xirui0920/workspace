package biji.javatexing;
/*
 * java值传递。String非基础类型但在方法中是值传递
 * 基础类型 是值传递
 */
public class PassByVal {
	public static void main(String[] args) {
		int num = 1;
		String s = new String("abc");
		Integer i = new Integer(1);
		StringBuffer sb;
		change(num,s);
		System.out.println(num + " " + s);
	}
	
	public static void change(int n,String s){
		n = n + 3;
		s = "ABC";
	}
}
