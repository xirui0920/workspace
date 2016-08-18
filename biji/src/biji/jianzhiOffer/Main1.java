package biji.jianzhiOffer;
/*
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 
 */
public class Main1 {
	public static void main(String[] args) {
		
	}
	//第一种解法
	public static boolean isok(int[][] array,int target){
		int size = array.length;
		for (int i = 0; i < size; i++) {
			if(binFind(array[i], target)){
				return true;
			}
		}
		return false;
	}
	
	public static boolean binFind(int[] array,int target){
		int high = array.length-1;
		int low = 0;
		while((low <= high) && (low <= array.length - 1) && (high <= array.length - 1)){
			int mid = (high+low) >> 1;
			if (target==array[mid]) {
				return true;
			}else if(target < array[mid]){
				high = mid -1;
			}else {
				low = mid + 1;
			}
		}
		return false;
	}
	
	//第二种解法 从左下角开始遍历 遇小上移，遇大右移；
	public static boolean find(int[][] array,int target){
		int x,y;
		int m = array.length;
		int n = array[0].length;
		x = m-1;y=0;
		while(x>=0 && y <= n-1){
			if (target < array[x][y]) {
				x--;
			}else if(target > array[x][y]){
				y++;
			}else {
				return true;
			}
		}
		return false;
	}
}
