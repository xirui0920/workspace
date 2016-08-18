package biji.dataStruc;

import biji.dataStruc.BagProblem.Item;
/*
 * 背包问题 动态规划解法
 * 去除递归解法的重复计算
 */
public class BagProblem_dynamic {
	static final int N = 5;
	static final int unknown = 0;
	static Item[] items = new Item[N];
	//用数组存储已经计算过的值，避免重复计算
	static int[] maxKnown = new int[20];
	static Item[] itemKnown = new Item[20];
	public static void main(String[] args) {
		//init items
		items[0] = new Item(3, 4);
		items[1] = new Item(4, 5);
		items[2] = new Item(7, 10);
		items[3] = new Item(8, 11);
		items[4] = new Item(9, 13);
		System.out.println(Knap(17));
	}
	
	static int Knap(int M){
		int i,space,max,maxi,t;
		//用数组存储已经计算过的值，避免重复计算。在这句，如果此max已经计算过就跳过。tmd真有才。
		if (maxKnown[M] != unknown) { return maxKnown[M];}
		for (i = 0,max = 0,maxi = 0; i < N; i++) {
			if ((space = M - items[i].size) >= 0) {
				if ((t = Knap(space) + items[i].val) > max) {
					max = t;
					maxi = i;
				}
			}
		}
		maxKnown[M] = max;
		itemKnown[M] = items[maxi];
		return max;
	}
	
}
