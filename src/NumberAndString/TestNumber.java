package NumberAndString;

/**
 * 装箱拆箱测试
 * @author  HYT
 */
public class TestNumber {
    public static void main(String[] args){
        //所有的基本类型，都有对应的类类型
        //比如int对应的类就是Integer
        //这种类就叫做封装类

        int i = 5;
        //把一个基本类型的变量，装换位Integer对象(基本类型转换为封装类型（调用构造方法）)
        Integer it = new Integer(i);
        //把一个Integer对象，转换成一个基本类型int(封装类型转换成基本类型)
        int i2 = it.intValue();
        System.out.println(i2);




        //Number类
        //数字封装类有
        //Byte，Short，Integer，Long，Float，Double
        //这些类都是抽象类Number的子类

        //Integer是Number的子类，所以打印true
        System.out.println(it instanceof Number);


        //自动装箱
        //不需要调用构造方法，通过 = 符号 自动把基本类型转换为类类型 就叫做装箱

        //不调用构造方法，自动转换就叫做装箱
        Integer it2 = i;        //  装箱



        //自动拆箱
        //不需要调用Integer的intValue方法，通过 = 就自动转换成int类型，就叫做拆箱

        //自动转换就叫拆箱
        int i3 = it;    // 拆箱




        //int的最大值，最小值
        //int的最大值可以通过其对应的封装类Integer.MAX_VALUE获取

        //int的最大值
        System.out.println(Integer.MAX_VALUE);

        //int的最小值
        System.out.println(Integer.MIN_VALUE);



        //练习--装箱拆箱
        //1. 对byte,short,float,double进行自动拆箱和自动装箱
        //
        //2. byte和Integer之间能否进行自动拆箱和自动装箱
        //
        //3. 通过Byte获取byte的最大值

        byte a = 2;
        Byte a1 = a;
        byte a2 = a1;

        short b = 2;
        Short b1 = b;
        short b2 = b1;

        //Integer x = a;    byte和Integer之间不能自动装箱
        //byte y = it2;     byte和Integer之间不能自动拆箱

        float c = 2;
        Float c1 = c;
        float c2 = c1;

        double d = 2;
        Double d1 = d;
        double d2 = d1;

        //byte的最大值
        System.out.println(Byte.MAX_VALUE);

        //byte的最小值
        System.out.println(Byte.MIN_VALUE);
    }
}
