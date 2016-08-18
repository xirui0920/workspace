package biji.javatexing;

public class Test {
	public static void main(String[] args) {
		int a=0,b=0;
		if ((a+=1) < 0 & (b+=1) > 0) {
			System.out.println(a+" "+b);
		}
		System.out.println(a+" "+b);
	}

}
