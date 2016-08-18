package biji.dataStruc;
/*
 * 连通性问题
 * 快速查找算法
 */
public class Connectivity {
	final static int N = 10000;
	public static void main(String[] args) {
		int i,p,q,t;
		int[] id = new int[N];
		for (int j = 0; j < N; j++) { id[j] = j;}
		java.util.Scanner in = new java.util.Scanner(System.in);
		while (in.hasNextInt()) {
			p = in.nextInt();
			q = in.nextInt();
			if (id[p] == id[q])  {
				continue;
			}
			for (t = id[p],i = 0; i < N; i++) {
				if (t == id[i]) {
					id[i] = id[q];
				}
			}
			System.out.printf(" %d %d\n",p,q);
		}
	}
}
