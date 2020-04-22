/**
 * 创建数组
 * @author  HYT
 */
import java.lang.Math;
public class TestArray01 {
    public static void main(String[] args){
        //声明数组
        //int[] a; 声明了一个数组变量。
        //[]表示该变量是一个数组
        //int 表示数组里的每一个元素都是一个整数
        //a 是变量名
        //声明，不会创建数组！！！

        //声明一个引用
        int [] a;

        //创建数组时要致命数组长度
        //new int[5]
        //引用概念：
        //如果变量代表一个数组，比如a,我们把a叫做引用
        //与基本类型不同
        //int c = 5; 这叫给c赋值为5
        //声明一个引用 int[] a;
        //a = new int[5];
        //让a这个引用，指向数组

        //创建一个长度为5的数组，并且使用引用a指向该数组
        a = new int[5];

        int [] b = new int[5];  //声明引用的同时，指向一个数组


        a[0] = 1;                   //下标0，代表数组中的第一个数
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;                   //下标4，实际上为“第五个”，即最后一个
        //a[5] = 6;                   //下标5，实际上为“第六个”,超出范围，产生数组下标越界异常



        //数组长度：
        //.length属性用于访问一个数组的长度
        //数组访问下标范围是 0 到 长度-1
        //一旦超过这个范围,就会产生数组下标越界异常


        System.out.println(a.length);   //打印数组的长度



        //练习：
        //首先创建一个长度是5的数组
        //然后给数组的每一位赋予随机整数
        //通过for循环，遍历数组，找出最小的一个值出来

        //0-100的 随机整数的获取办法有多种，下面是参考办法之一:

        //(int) (Math.random() * 100)

        //Math.random() 会得到一个0-1之间的随机浮点数，然后乘以100，并强转为整型即可。

        b[0] = (int)(Math.random()*100);
        b[1] = (int)(Math.random()*100);
        b[2] = (int)(Math.random()*100);
        b[3] = (int)(Math.random()*100);
        b[4] = (int)(Math.random()*100);

        System.out.println("数组中各个随机数是：");

        for(int i = 0;i<b.length;i++){

            System.out.println(b[i]);
        }
        int min = b[0];
        for (int i = 0;i<b.length;i++){
            if(b[i]<min){
                min = b[i];
            }
        }
        System.out.println("最小的随机数是："+min);


    }
}
