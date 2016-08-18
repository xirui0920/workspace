package biji.javatexing;

public class EqualTest {
	public static void main(String[] args) {
		Integer a = 129;
		Integer b = Integer.valueOf(129);
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}
}
