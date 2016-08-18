package xirui.Practices;

/**
 * Created by Xirui on 2015/12/21.
 * 算出水仙花数
 */
public class programming_3 {
    public static void main(String[] args) {
        int ge,shi,bai;
        for (int i=100;i<1000;i++) {
            ge = i % 10;
            shi = (i / 10) % 10;
            bai = (i / 10) / 10;
            int result =(int)(Math.pow(ge,3) + Math.pow(shi,3) + Math.pow(bai,3));
            if (i == result){
                System.out.println(i);
            }
        }
    }
}
