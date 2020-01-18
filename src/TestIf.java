import java.util.Scanner;

/**
 * 测试If条件语句
 * @author  HYT
 */
public class TestIf {
    public static void main(String[] args) {
        //if(表达式1){
        //  表达式2；
        //}
        //
        //
        //如果表达式1的值是true,
        //就执行表达式2
        boolean a = true;
        //如果成立就输出yes
        if (a) {
            System.out.println("yes");
        }


        //多表达式和一个表达式

        boolean b = false;
        //如果有多个表达式，必须用大括号括起来
        if (b) {
            System.out.println("yes1");
            System.out.println("yes2");
            System.out.println("yes3");
        }

        //否则表达式2 3 无论b是否为true都会执行

        if (b)
            System.out.println("yes1");
        System.out.println("yes2");
        System.out.println("yes3");

        //如果只有一个表达式可以不用写括号，看上去会简约一些（但是建议都写上）
        if (b) {
            System.out.println("yes1");
        }
        if (b)
            System.out.println("yes1");


        //if使用过程中可能遇到的坑
        //if后面有一个分号; 而分号也是一个完整的表达式
        //如果b为true，会执行这个分号，然后打印yes
        //如果b为false，不会执行这个分号，然后打印yes
        //这样，看上去无论如何都会打印yes

        boolean c = false;
        if (c) ;
        System.out.println("yes");


        //if else
        //else代表不成立的情况

        boolean d = false;
        if (d) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


        //else if
        //else if 是多条件判断


        //如果只使用if,会执行4次判断
        int i = 2;
        if (i == 1) {
            System.out.println(1);
        }
        if (i == 2) {
            System.out.println(2);
        }
        if (i == 3) {
            System.out.println(3);
        }
        if (i == 4) {
            System.out.println(4);
        }

        //如果是用else if，一旦判断成立，后面的判断就不会执行了，可以节约计算资源
        if (i == 1) {
            System.out.println(1);
        } else if (i == 2) {
            System.out.println(2);
        } else if (i == 3) {
            System.out.println(3);
        } else if (i == 4) {
            System.out.println(4);
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的身高：");
        double height = scanner.nextDouble();
        System.out.println("请输入您的体重：");
        double weight = scanner.nextDouble();
        double bmi = weight / (Math.pow(height, 2));
        System.out.println("当前的BMI是:" + bmi);

        if (bmi < 18.5) {
            System.out.println("身体状态是：体重过轻！");
        } else if (bmi >= 18.5 && bmi < 24) {
            System.out.println("身体状态是：正常！");
        } else if (bmi >= 24 && bmi < 27) {
            System.out.println("身体状态是：体重过重！");
        } else if (bmi >= 27 && bmi < 30) {
            System.out.println("身体状态是：轻度肥胖！");
        } else if (bmi >= 30 && bmi < 35) {
            System.out.println("身体状态是：中度肥胖");
        } else {
            System.out.println("身体状态是：重度肥胖");
        }


        System.out.println("请输入年份：");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println("不是闰年");
        }

        
        
        
        
        }


    }

