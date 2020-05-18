package NumberAndString;

/**
 * 数字与字符串--数学方法
 * @author  HYT
 */
public class TestNumber03 {
    public static void main(String[] args){
        //java.lang.Math提供了一些常用的数学运算方法，并且都是以静态方法的形式存在

        //四舍五入，随机数，开方，次方，π，自然常数

        float f1 = 5.4f;
        float f2 = 5.5f;
        //5.4四舍五入为5
        System.out.println(Math.round(f1));

        //5.5四舍五入为6
        System.out.println(Math.round(f2));

        //得到一个0-1之间的随机浮点数（取不到1）
        System.out.println(Math.random());

        //得到一个0-10之间的随机整数（取不到10）
        System.out.println((Math.random()*10));

        //开方
        System.out.println(Math.sqrt(9));

        //次方（2的4次方）
        System.out.println(Math.pow(2,4));

        //π
        System.out.println(Math.PI);

        //自然常数
        System.out.println(Math.E);





        //练习--数学方法
        //这个图是自然对数的计算方式。
        //借助Math的方法，把自然对数计算出来，看看经过自己计算的自然对数和Math.E的区别有多大

        int n = Integer.MAX_VALUE;
        System.out.println(Math.pow(1+1d/n,n));


        //练习--质数
        //统计找出一千万以内，一共有多少质数
        //
        //质数概念: 只能被1和自己整除的数
        //举例:
        //5只能被 1和5整除，所以是质数
        //8可以被2整除，所以不是质数
//        int t = 10000000;
//        int count = 2;      //1和2都为质数未计入for循环里
//
//        for(int i = 3; i <= t; i++){
//            for(int j = 2; j < i; j++){
//                if( i % j != 0){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);

        //埃氏筛法d
        System.out.println("###############");
        int max = 10000*1000;
        int count1 = 0 ;
        for (int i = 1; i <=max; i++) {
            if(isPrime(i)){
                count1++;
            }
        }
        System.out.println("一千万以内的质数一共有 : " + count1);
    }

    private static boolean isPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if(0==i%j)
                return false;
        }
        return true;
    }
}


