package xirui.Practices;

/**
 * Created by Xirui on 2015/12/24.
 */
public class programming_9 {
    public static void main(String[] args) {
        double sum=0,temp=100;
        for (int i=0;i<10;i++){
            sum = sum + temp*2;
            temp = temp / 2;
        }
        System.out.println(sum-100 + " " + temp);
    }

}
