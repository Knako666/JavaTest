package NumberAndString;

/**
 * 数字与字符串--字符串转换
 * @author  HYT
 */
public class TestNumber02 {
    public static void main(String[] args){
        //数字转字符串
        //方法一：使用String类的静态方法valueOf
        //方法二：先把基本类型装箱为对象，然后调用对象的toString
        int i = 5;

        //方法一：
        String str = String.valueOf(i);
        System.out.println(str);
        //方法二：
        Integer it = i;
        String str2 = it.toString();
        System.out.println(str2);


        //字符串转数字
        //调用Integer的静态方法parseInt

        String str3 = "999";
        int i2 = Integer.parseInt(str3);
        System.out.println(i2);



        //练习--字符串转换
        //把浮点数3.14转换为字符串“3.14”
        //再把字符串“3.14”转换为浮点数3.14
        //如果字符串是 3.1a4，转换为浮点数会得到什么？

        float a = 3.14f;
        String str_1 = String.valueOf(a);
        System.out.println(str_1);

        float a2 = Float.parseFloat(str_1);
        System.out.println(a2);

        //不能把字符串3.1a4转换为浮点数
//        String str_2 = "3.1a4";
//        float a3 = Float.parseFloat(str_2);
//        System.out.println(a3);
    }
}
