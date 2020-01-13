import java.util.Scanner;
/**测试操作符
 * @author  HYT
 */

public class TestOperater {
    public static void main(String[] args){
        //基本算术操作符：  +、-、*、/、%
        //自增自减：++、--

        //基本的加减乘除：
        int i = 10;
        int j = 5;
        int a = i+j;
        int b = i-j;
        int c = i*j;
        int d = i/j;


        //使用Scanner从控制台获取两个数字，然后计算这两个数字的和
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a1 = scanner.nextInt();
        System.out.println("请输入第二个整数");
        int a2 = scanner.nextInt();
        System.out.println("两个数的和是："+(a1+a2));


        //任意运算单元的长度超过int
        //如果有任何运算单元的长度超过int,那么运算结果就按照最长的长度计算
        //比如
        //int a = 5;
        //long b = 6;
        //a+b -> 结果类型是long

        int a3 = 5;
        long b3 = 6;
        int c2 = (int)(a3+b3);    //a+b的运算结果为long，所以要用强制类型转换
        long d2 = a3+b3;
        System.out.println("c2="+c2+"\nd2="+d2);


        //任意运算单位的长度小于int
        //如果任何运算单元的长度都不超过int,那么运算结果就按照int来计算
        //byte a = 1;
        //byte b= 2;
        //a+b -> int 类型
        
        byte a4 = 1;
        byte b4 = 2;
        byte c3 = (byte)(a4+b4);    //虽然a b都是byte类型，但是运算结果是int类型，需要进行强制转换
        int d3 = a4+b4;
        System.out.println("c3="+c3+"\nd3="+d3);


        //% 取余数，又叫取模
        //5除以2，余1

        int i1 = 5;
        int j1 = 2;
        System.out.println(i1%j1);  //输出为1


        //++
        //--
        //在原来的基础上增加1或者减少1

        int i2 = 5;
        i2++;
        System.out.println(i2);//输出为6


        //自增 自减操作符置前以及置后的区别
        //以++为例
        //int i = 5;
        //i++; 先取值，再运算
        //++i; 先运算，再取值

        int i3 = 5;
        System.out.println(i3++);   //输出5；先取值，后运算
        System.out.println(i3);     //输出6；

        int j2 = 5;
        System.out.println(j2++);   //输出6；先运算，后取值
        System.out.println(j2);     //输出6

        int i4 = 1;
        int j3 = ++i4 + i4++ + ++i4 + ++i4 + i4++;  //j3=2+2+4+5+5=18  (++i4=2,i4=2;i4++=2,i4=3;++i4=4,i4=4;++i4=5,i4=5;i4++=5,i4=6)
        System.out.println(j3);
        
        
        
        
        //使用Scanner收集你的身高体重，并计算出你的BMI值是多少
        //
        //BMI的计算公式是 体重(kg) / (身高*身高)
        //
        //比如邱阳波的体重是72kg, 身高是1.69，那么这位同学的BMI就是
        //72 / (1.69*1.69) = ?
        
        System.out.println("请输入你的身高(m)：");
        float height = scanner.nextFloat();
        System.out.println("请输入你的体重(kg)");
        float weight = scanner.nextFloat();
        System.out.println("当前的BIM为："+(weight/(height*height)));




        //关系操作符:比较两个变量之间的关系
        //> 大于
        //>= 大于或等于
        //< 小于
        //<= 小于或等于
        //== 是否相等
        //!= 是否不等


        //借助Scanner获取控制台输入的两个任意数字，然后使用
        //> 大于
        //>= 大于或等于
        //< 小于
        //<= 小于或等于
        //== 是否相等
        //!= 是否不等

        System.out.println("请输入第一个整数：");
        int i5 = scanner.nextInt();
        System.out.println("请输入第二个整数");
        int j5 = scanner.nextInt();
        System.out.println("比较"+i5+">"+j5+":"+(i5>j5));
        System.out.println("比较"+i5+">="+j5+":"+(i5>=j5));
        System.out.println("比较"+i5+"<"+j5+":"+(i5<j5));
        System.out.println("比较"+i5+"<="+j5+":"+(i5<=j5));
        System.out.println("比较"+i5+"=="+j5+":"+(i5==j5));
        System.out.println("比较"+i5+"!="+j5+":"+(i5!=j5));





        //逻辑运算符
        //长路与 和 短路与
        //无论长路与还是短路与
        //两边的运算单元都是布尔值
        //都为真时，才为真
        //任意为假，就为假
        //区别
        //长路与 两侧，都会被运算
        //短路与 只要第一个是false，第二个就不进行运算了


        //长路与  无论第一个表达式的值是true或者false,第二个的值，都会被运算
        int i6 = 2;
        System.out.println( i6== 1 & i6++ ==2  ); //无论如何i++都会被执行，所以i的值变成了3
        System.out.println(i6);

        //短路与 只要第一个表达式的值是false的，第二个表达式的值，就不需要进行运算了
        int j6 = 2;
        System.out.println( j6== 1 && j6++ ==2  );  //因为j==1返回false,所以右边的j++就没有执行了，所以j的值，还是2
        System.out.println(j6);


        //长路或 和 短路或
        //无论长路或还是短路或
        //两边的运算单元都是布尔值
        //都为假时，才为假
        //任意为真，就为真
        //区别
        //长路或 两侧都会被运算
        //短路或 只要第一个是true的，第二个就不进行运算了


        //长路或  无论第一个表达式的值是true或者false,第二个的值，都会被运算
        int i7 = 2;
        System.out.println( i7== 1 | i7++ ==2  ); //无论如何i++都会被执行，所以i的值变成了3
        System.out.println(i7);

        //短路或 只要第一个表达式的值是true的，第二个表达式的值，就不需要进行运算了
        int j7 = 2;
        System.out.println( j7== 2 || j7++ ==2  );  //因为j==2返回true,所以右边的j++就没有执行了，所以j的值，还是2
        System.out.println(j7);


        //取反
        //取反!
        //真变为假
        //假变为真


        boolean a5 = true;
        boolean b5 = false;

        System.out.println(a5^b5); //不同返回真
        System.out.println(a5^!b5); //相同返回假


        int i8 = 1;
        boolean b8 = !(i8++ == 3) ^ (i8++ ==2) && (i8++==3);
        System.out.println(b8);
        System.out.println(i8);




        //三元操作符
        //表达式?值1:值2
        //如果表达式为真 返回值1
        //如果表达式为假 返回值2


        int i9 = 5;
        int j9 = 6;

        int k = i9 < j9 ? 99 : 88;

        // 相当于
        if (i9 < j9) {
            k = 99;
        } else {
            k = 88;
        }

        System.out.println(k);



        //通过Scanner输入一个1-7之间的整数，使用三元操作符判断是工作日还是周末？
        System.out.println("今天星期几？");
        int date = scanner.nextInt();
        System.out.println(date<6 ? "今天是工作日" : "今天是周末");






    }
}
