package DateAndCalendar;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * 测试Calendar类
 * @author  HYT
 */
public class TestCalendar {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args){
        //Calendar与Date进行转换
        //采用单利模式获取日历对象Calendar.getInstance();
        Calendar c = Calendar.getInstance();

        //通过日历对象得到日期对象
        Date now = c.getTime();

//        Date d = new Date(0);
//        c.setTime(d);  //把这个日历调成日期：1970.1.1 08:00:00
        
        
        //翻日历
        //add方法，在原日期上增加年/日/月
        //set方法，直接设置年/日/月
        
        //当前日期
        System.out.println("当前日期：\t" + format(c.getTime()));

        c.setTime(now);
        c.add(Calendar.MONTH, 1);
        System.out.println("下个月的今天：\t" + format(c.getTime()));

        //去年的今天
        c.setTime(now);
        c.add(Calendar.YEAR, -1);
        System.out.println("去年的今天：\t" + format(c.getTime()));
        
        //上个月的第三天
        c.setTime(now);
        c.add(Calendar.MONTH, -1);
        c.set(Calendar.DATE,3);
        System.out.println("上个月的第三天：\t" + format(c.getTime()));



        //练习--Calendar
        //找出下个月的倒数第三天是哪天
        c.setTime(now);
        System.out.println("今天是：" + format(c.getTime()));
        c.add(Calendar.MONTH, 2);
        c.set(Calendar.DATE,1);
        c.add(Calendar.DATE, -3);
        System.out.println("下个月倒数第三天是：" + format(c.getTime()));
    }


    public static String format(Date time){
        return sdf.format(time);
    }
}
