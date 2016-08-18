package biji.zuolaoshi;
/*
 * 求一个数组中子数组最大的合
 */
public class SubArrayMaxSum {

	public static int maxSum(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int max = Integer.MIN_VALUE;
		int cur = 0;
		//cur变量从数组第一个元素累加，如果累加小于0，重新置为0，否则不变，max记录cur累加最大值。循环完数组。max即为最大子数组合
		for (int i = 0; i != arr.length; i++) {
			cur += arr[i];
			max = Math.max(max, cur);
			cur = cur < 0 ? 0 : cur;
		}
		return max;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i != arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr1 = { -2, -3, -5, 40, -10, -10, 100, 1 };
		System.out.println(maxSum(arr1));

		int[] arr2 = { -2, -3, -5, 0, 1, 2, -1 };
		System.out.println(maxSum(arr2));

		int[] arr3 = { -2, -3, -5, -1 };
		System.out.println(maxSum(arr3));

	}

}
