package xirui.Practices;

/**
 * Created by Xirui on 2015/12/24.
 * 将this is a test 转变为 This Is A Test
 */
public class programming_13 {
    public static void main(String[] args) {
        String str="this is a man";
        char c[]=new char[str.length()];
        str.getChars(0,str.length(),c,0);
        if(c[0]>='a'&&c[0]<='z')
        {
            c[0]=(char)(c[0]-32);
        }
        for(int i=1;i<=c.length-1;i++)
        {
            if(c[i]==' ')
            {
                c[i+1]=(char)(c[i+1]-32);
            }
        }
        str=new String(c);
        System.out.print(str);
    }
}
