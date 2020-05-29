package NumberAndString;

/**
 * 测试StringBuffer/ StringBuilder
 * @author  HYT
 *
 * 显然，内部也是一个字符数组，但这个字符数组没有用final修饰，随时可以修改。因此，StringBuilder和StringBuffer称之为“可变字符序列”。那两者有什么区别呢?
 *
 *       1. StringBuffer JDK1.0版本提供的类，线程安全，做线程同步检查， 效率较低。
 *
 *       2. StringBuilder JDK1.5版本提供的类，线程不安全，不做线程同步检查，因此效率较高。 建议采用该类。
 */
public class TestNumber08 {
    public static void main(String[] args){
        //StringBuffer是可变字符串

        //追加、删除、插入、反转
        String str1 = "let there";

        StringBuffer sb = new StringBuffer(str1);   //根据str1创建一个StringBuffer对象
        sb.append(" be light");  //append方法：在后面追加字符串
        System.out.println(sb);

        sb.delete(4,10);    //删除4-10之间的字符
        System.out.println(sb);

        sb.insert(4, "there");  //在4这个位置插入 there
        System.out.println(sb);

        sb.reverse();   //反转字符串
        System.out.println(sb);


        //长度，容量
        //为什么StringBuffer可以变长？
        //和String内部是一个字符数组一样，StringBuffer也维护了一个字符数组。 但是，这个字符数组，留有冗余长度
        //比如说new StringBuffer("the")，其内部的字符数组的长度，是19，而不是3，这样调用插入和追加，在现成的数组的基础上就可以完成了。
        //如果追加的长度超过了19，就会分配一个新的数组，长度比原来多一些，把原来的数据复制到新的数组中，看上去 数组长度就变长了 参考MyStringBuffer
        //length: “the”的长度 3
        //capacity: 分配的总空间 19
        //
        //注： 19这个数量，不同的JDK数量是不一样的

        StringBuffer sb1 = new StringBuffer("the");
        System.out.println(sb1.length());   //内容长度
        System.out.println(sb1.capacity()); //总空间


        //练习--StringBuffer性能
        //String与StringBuffer的性能区别?
        //
        //生成10位长度的随机字符串
        //然后,先使用String的+,连接10000个随机字符串,计算消耗的时间
        //然后,再使用StringBuffer连接10000个随机字符串,计算消耗的时间

        //String“+”号连接方式
        String str = "";
        long start1 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            str += makeStr(10);
        }
        long end1 = System.currentTimeMillis();
        System.out.format("使用字符串连接+的方式，连接10000次，耗时%d毫秒%n",end1-start1);


        //StringBuffer连接
        StringBuffer sb2 = new StringBuffer();
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            sb2.append(makeStr(10));
        }
        long end2 = System.currentTimeMillis();
        System.out.format("使用StringBuffer的方式，连接1000000次，耗时%d毫秒%n",end2-start2);

        //MyStringBuffer连接
        MyStringBuffer sb3 = new MyStringBuffer();
        long start3 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            sb3.append(makeStr(10));
        }
        long end3 = System.currentTimeMillis();
        System.out.format("使用MyStringBuffer的方式，连续1000000次，耗时%d毫秒%n",end3-start3);
    }

    public static String makeStr(int length){
        String pool = "";
        for(short i = '0'; i <= '9'; i++){
            pool += (char)i;
        }
        for(short i = 'A'; i <= 'Z'; i++){
            pool += (char)i;
        }
        for(short i = 'a'; i <= 'z'; i++){
            pool += (char)i;
        }
        char[] cs = new char[length];
        for(int i = 0; i < cs.length; i++){
            int index = (int)(Math.random()*pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);
        return result;
    }
}
