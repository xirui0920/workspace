package xirui.Practices;

/**
 * Created by Xirui on 2015/12/21.
 * 判断素数
 */
public class programming_2 {

    public static void main(String[] args) {
        int count=0;
        for (int i=1;i<201;i++){
            if (myfunction(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("一共有"+ count + "个素数");
    }
    public static boolean myfunction(int number) {
        if (number ==1) return false;             //1不是素数
        for (int i = 2,j=(int)Math.sqrt(number);i<=j;i++) {    //判断一个数number是否是素数 用number分别去除2到这个数sqrt（number） 效率高
           if(number % i ==0)
               return false;
        }
        return true;
    }
}
