package xirui.Practices;

import java.util.Scanner;

/**
 * Created by Xirui on 2015/12/24.
 * 选择排序
 */
public class programming_11 {
    public static void main(String[] args) {
        int[] a = new int[3];
        Scanner in = new Scanner(System.in);
        for (int i=0;i<3;i++){
            a[i] = in.nextInt();
        }
        selectionSort(a);
        for (int i=0;i<3;i++){
            System.out.println(a[i]);
        }
    }
    public static void selectionSort(int[] list) {
        for (int i = list.length - 1; i >= 1; i--) {
            //假设数组中最后一个数是最大的
            int currentMax = list[0];
            int currentMaxIndex = 0;
            //如果有比他还大的数 记录这个数的位置和值即找到数组中最大的数
            for (int j = 1; j <= i; j++) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            //如果这个数不是当前循环指向的那个数 交换
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }

        }
    }
}
