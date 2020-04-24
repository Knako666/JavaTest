/**
 * 初始化数组
 * @author  HYT
 *
 */
import sun.security.util.Length;

import  java.lang.Math;
public class TestArray02 {
    public static void main(String[] args){
        //1.分配空间与赋值分步进行
        int[] a = new int[5];      //分配了长度为5的数组，但是没有赋值

        //没有赋值，就会使用该类型的默认值
        //int类型的数组，默认值为0
        System.out.println(a[0]);

        //进行赋值

        a[0] = 100;
        a[1] = 101;
        a[2] = 103;
        a[3] = 120;
        a[4] = 140;


        //分配空间的同时赋值

        //写法一：分配空间同时赋值
        int[] b = new int[]{100,103,445,234,4535};

        //写法二：省略了new int[],效果一样
        int[] c = {151,674,6512,8546,123};

        //写法三：同时分配空间，和指定内容
        //在下例整形数组d中，长度为3，内容有5个，产生矛盾
        //因此如果指定了数组的内容，就不能同时设置数组的长度
        //int[] d = new int[3]{100,8453,124,6752,4533};




        //练习：创建一个长度是5的数组，并填充随机数
        //使用循环语句，对这个数组实现反转效果



        int[] shuzu = new int[5];
        for(int i = 0;i<shuzu.length;i++){
            shuzu[i]=(int)(Math.random()*100);
            System.out.print("shuzu["+i+"]="+shuzu[i]+" ");
        }

        System.out.println("\n两级反转！！！");

        for(int i = 0;i<shuzu.length/2;i++){
            int middle = shuzu[shuzu.length-i-1];
            shuzu[shuzu.length-i-1] = shuzu[i];
            shuzu[i] = middle;
        }
        for (int i = 0;i< shuzu.length;i++){
            System.out.print("shuzu["+i+"]="+shuzu[i]+" ");
        }


    }
}
