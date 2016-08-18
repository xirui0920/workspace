package biji.dataStruc;
/*
 * 分治算法经典例子
 */
public class DandC {
	public static void main(String[] args) {
		int[] a = new int[10000];
		for (int i = 0; i < 10000; i++) {
			a[i] = (int)(Math.random() * 100000 +1);
//			System.out.print(a[i]+ " ");
		}
		System.out.println();
		long start = System.nanoTime();
		System.out.print(max(a, 0, 9999));
		long end = System.nanoTime();
		System.out.println(" "+(end-start)+"ms");
		System.out.println("---------------------");
		long start1 = System.nanoTime();
		System.out.print(max(a));
		long end1 = System.nanoTime();
		System.out.println(" "+(end1-start1)+"ms");
	}
	//分治法求数组最大值 数组a[p]...a[l] 分为 a[p]...a[m] 和 a[m+1]...a[l]
	static int max(int[] a,int p,int l){
		int v,u;
		int m = (p + l) / 2;
		if (p == l) {
			return a[p];
		}
		u = max(a,p,m);
		v = max(a,m+1,l);
		if (u > v) {
			return u;
		}else {
			return v;
		}
	}
	
	static int max(int[] a){
		int max = a[0];
		for (int i = 0,n=a.length; i < n; i++) {
			if (a[i] >= max) {
				max = a[i];
			}
		}
		return max;
		
	}
}
