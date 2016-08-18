package xirui.ProgrammingPearls;

/**
 * Created by Xirui on 2015/11/16.
 * 位向量数据结构java实现
 * 编程珠玑1.3题
 */
public class BitSort {

    public static void main(String[] args) {
        //每个int类型数的位数(1个int数是4个字节,1个字节等于8位,所以是32=4*8)
        int size = 32;
        //最大值
        int MAX= 10000000;
        //计算出需要多大的数组,才能按位保存MAX个数.数组中每一个元素,也就是int数,能保存32位,所以是如下算数.
        int arraySize = MAX/size + (MAX%size==0?0:1);
        System.out.println("需要"+arraySize+"个数组元素");
        int[] datas = new int[arraySize];

        //测试数据
        int[] orginal = new int[]{5,888,4,2,6,7,3,10,567,456,234,123,66666,55555,3333333,8908764};

        //完成位向量的填充
        for(int i=0;i<orginal.length;i++){
            int v = orginal[i];//原始值
            //假设数值是33,因为1个int也就是32位只能表示1~32,因此,需要算出:
            int index = v/size + (v%size==0?0:1)-1;//数组第几项才能表示目标数v
            int pos = v % size - 1;//偏移量,也就是数组的index位置的int数的第几位才是这个数
            //这里用了按位与运算,因为假设原值是000100,计算出偏移量是30,也就是说,倒数第二位是1,合并进去就是001 10.
            //因此这里按位与运算最合适
            int newResult = datas[index]  | 1<< 31-pos;//新结果
            //更新值
            datas[index]=newResult;
            System.out.print("原始值" + v);
            System.out.print("下标" + index);
            System.out.print("偏移" + pos);
            System.out.print("新结果" + newResult);
            System.out.println();
        }
        //遍历位图,输出结果
        for(int i=0;i<datas.length;i++){
            int data = datas[i];

            //有了data这个十进制数,如何得到她的二进制的每位值呢?
            //很简单,需要得到某位的值,就将该数右移31-第几位,并将除末位外的所有位置为0,就能知道该位实际值.
            for(int index=0;index<31;index++){
                //上条注释所言的计算方法
                int posVal = (data >> (31-index)) & 1;

                if(posVal==1){
                    //如果该位是1,那么说明该位是有值的,输出她
                    //由于我们进行了拆分,也就是说当i=1时,基数是32开始,偏移量为1,就是33
                    int result = size*i + index+1;
                    System.out.print(result + ",");
                }
            }

        }
    }
}