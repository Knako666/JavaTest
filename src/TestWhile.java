import java.util.Scanner;

/**
 * 测试while循环
 * @author  HYT
 */
public class TestWhile {
    public static void main(String[] args){
        //条件为true时 重复执行
        //只要while中的表达式成立，就会不断地循环执行

        //打印0到4
        int i = 0;
        while (i<5){
            System.out.println(i);
            i++;
        }



        //条件为true时，重复执行，至少会执行一次
        //do{
        // }while 循环
        //与while的区别是，无论是否成立，先执行一次，再进行判断

        //打印0到4
        int j = 0;
        do {
            System.out.println(j);
        }while (i<5);



        //通过Scanner 获取一个整数，然后使用while计算这个整数的阶乘
        //
        //N的阶乘等于 N* (N-1) * (N-2) * ... * 1

        Scanner scanner=new Scanner(System.in);
        System.out.println("青输入一个整数：");
        int k = scanner.nextInt();
        int sum = 1;
        while (k>0){
            sum= k*sum;
            k--;
        }
        System.out.println("阶乘为："+sum);

    }
}
