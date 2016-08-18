package biji.dataStruc;
/*
 * 
 * 背包问题 递归解法
 * 有大量重复计算 效率低
 * 背包太大，算法会用到大量空间时间
 */
public class BagProblem {
	static final int N = 5;
	static Item[] items = new Item[N];
	
	public static void main(String[] args) {
		//init items
		items[0] = new Item(3, 4);
		items[1] = new Item(4, 5);
		items[2] = new Item(7, 10);
		items[3] = new Item(8, 11);
		items[4] = new Item(9, 13);
		System.out.println(knap(17));
	}
	
	//返回最优解  | 算法运行时间为指数级
	static int knap(int cap){
		//max最优解，cap背包大小，space下层递归背包大小,t每层递归最优解
		int i,space,max,t;
		for (i = 0,max = 0; i < N; i++) {
			//如果当前背包空间放当前货物后空间大于0，进入下层递归，所剩空间为space
			if ((space = cap - items[i].size) >= 0) {   
				// 如果所剩空间space的最优解Knap(space)+当前递归货物价值比当前递归层最优解大，替换最优解max
				if ((t = knap(space) + items[i].val) > max) {  
					max = t;
				}
			}
		}
		return max;
	}
	//物品的体积和价值
	static class Item{
		int size;
		int val;
		Item(int size,int val){this.size = size;this.val = val; }
	}
}
