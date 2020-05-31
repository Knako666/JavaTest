package DateAndCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;  //注意：是java.util.Date;   而非 java.sql.Date,此类是给数据库访问的时候使用的

/**
 * 测试Date类
 */
public class TestDate {
    public static void main(String[] args) throws ParseException {
        //当前时间
        Date d1 = new Date();
        System.out.println("当前时间：");
        System.out.println(d1);
        System.out.println();
        //从1970年1月1日  早上8点0分0秒  开始经历的毫秒数
        Date d2 = new Date(5000);
        System.out.println("从1970年1月1日 早上8点0分0秒过了5s");
        System.out.println(d2);


        //getTime()得到一个long型的整数
        //这个整数代表从1970.1.1 08:00:00:000 开始 没经过一毫秒，增加1
        //直接打印对象，会看到“Tue Jan 05 09:51:48 CST 2016”这样的格式，可读性较差，为了获得“2016/1/5 09:51:48”这样的格式 请参考日期格式化

        Date now = new Date();
        //打印当前时间
        System.out.println("当前时间：" + now.toString());
        
        System.out.println("当前时间getTime()返回的值是：" + now.getTime());
        
        Date zero = new Date(0);
        System.out.println("用0作为构造方法，得到的日期是：" + zero.toString());


        //System.currentTimeMillis()
        //当前日期的毫秒数
        //new Date().getTime() 和 System.currentTimeMillis() 是一样的
        //不过由于机器性能的原因，可能会相差几十毫秒，毕竟每执行一行代码，都是需要时间的
        System.out.println("Date.getTime() \t\t\t返回值：" + now.getTime());
        System.out.println("System.currentTimeMillis() \t返回值：" + System.currentTimeMillis());


        //练习--日期
        //借助随机数，创建一个从1995.1.1 00:00:00 到 1995.12.31 23:59:59 之间的随机日期
        SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        Date start = df.parse("1995.1.1 00:00:00");
        Date end = df.parse("1995.12.31 23:59:59");
        System.out.println("1995年第一天："+ start);
        System.out.println("1995年最后一天：" + end);

        //产生一个start与end之间的随机时间
        long temp = (long)(start.getTime()+Math.random()*(end.getTime()-start.getTime()+1));

        Date random = new Date(temp);
        String str = df.format(random);
        System.out.println("随机的时间是：" + random);
    }

}
