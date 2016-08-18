package xirui.Practices;

/**
 * Created by Xirui on 2015/12/24.
 * 1,2,3,4,组成多少个各位各不相同的3位数
 */
public class programming_10 {
    public static void main(String[] args)
    {
        int i=0;
        int j=0;
        int k=0;
        int t=0;
        for(i=1;i<=4;i++)  //百位
            for(j=1;j<=4;j++)  //十位
                for(k=1;k<=4;k++) //个位
                    if(i!=j && j!=k && i!=k)
                    {
                        t+=1;
                        System.out.println(i*100+j*10+k);
                    }
        System.out.println (t);
    }
}
