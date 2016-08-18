package xirui.Practices;

/**
 * Created by Xirui on 2015/12/24.
 * 求完美数
 */
public class programming_8 {
    public static void main(String[] args) {
        for (int i=1;i<1001;i++){
            int sum=0;
            for (int j=1;j<i;j++){
                if (i % j ==0){ sum = sum + j;}
            }
            if (sum == i){ System.out.println(sum);}
        }
    }
}
