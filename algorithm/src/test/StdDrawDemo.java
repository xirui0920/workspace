package test;

import edu.princeton.cs.algs4.StdDraw;


/**
 * Created by Xirui on 2015/10/27.
 */
public class StdDrawDemo {
    public static void main(String[] args) {
//      画笔实现三个函数
        int N = 100;
        StdDraw.setXscale(0,N);
        StdDraw.setYscale(0,N*N);
        StdDraw.setPenRadius(.01);
        for (int i = 0;i <= N;i ++){
            StdDraw.point(i,i);
            StdDraw.point(i,i*i);
            StdDraw.point(i,i*Math.log(i));

        }

    }
}
