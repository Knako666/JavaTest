/**
 * 测试数组--赋值数组
 * @author  HYT
 */

import java.lang.Math;
public class TestArray05 {
    public static void main(String[] args){
        //把一个数组的值，复制到另一个数组中
        //
        //System.arraycopy(src, srcPos, dest, destPos, length)
        //
        //
        //src: 源数组
        //srcPos: 从源数组复制数据的起始位置
        //dest: 目标数组
        //destPos: 复制到目标数组的起始位置
        //length: 复制的长度

        int[] a = new int[]{681,51,849,35,666,23};
        int[] b = new int[]{555,123,654,781,268,20};
        int[] c = new int[4];
        System.out.println("a数组的各元素为：");
        //增强for遍历数组a
        for (int each : a){
            System.out.print(each+"\t\t");
        }
        System.out.println("\nb数组的各元素为");
        //增强for遍历数组b
        for (int each : b){
            System.out.print(each+"\t\t");
        }

        //将a的前3个数复制到b的第三个元素后

        System.arraycopy(a,0,b,3,3);
        System.out.println("\nb数组复制后为：");
        for (int each : b){
            System.out.print(each+"\t\t");
        }

        //将a的前4个数赋值到c中
        System.arraycopy(a,0,c,0,4);
        System.out.println("\nc数组复制后为：");
        for(int each : c){
            System.out.print(each+"\t\t");
        }


        System.out.println();

        //练习：合并数组
        //首先准备两个数组，他俩的长度是5-10之间的随机数，并使用随机数初始化这两个数组
        //(向数组填充随机数的办法，参考这里)
        //
        //然后准备第三个数组，第三个数组的长度是前两个的和
        //通过System.arraycopy 把前两个数组合并到第三个数组中

        //准备两个随机数组
        int[] ar1 = new int[(int)(Math.random()*5+5)];
        System.out.println("数组ar1的元素为：");
        for (int i = 0;i<ar1.length;i++){
            ar1[i] = (int)(Math.random()*100);
        }
        for(int i : ar1){
            System.out.print(i+"\t\t");
        }


        int[] ar2 = new int[(int)(Math.random()*5+5)];
        System.out.println("\n数组ar2的元素为：");
        for (int i = 0;i<ar2.length;i++){
            ar2[i] = (int)(Math.random()*100);
        }

        for (int i : ar2){
            System.out.print(i+"\t\t");
        }

        //准备第三个组合数组
        int[]ar3 = new int[ar1.length+ar2.length];
        //先将ar1复制进ar3
        System.arraycopy(ar1,0,ar3,0,ar1.length);

        //再将ar2复制进ar3
        System.arraycopy(ar2,0,ar3,ar1.length,ar2.length);

        //输出数组ar3

        System.out.println("\n数组ar3的元素为：");
        for (int each :ar3){
            System.out.print(each+"\t\t");
        }




    }
}
