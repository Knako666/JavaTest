package DateAndCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat 日期格式化类
 */
public class TestDate02 {
    public static void main(String[] args) throws ParseException {


        //日期转字符串


        //y 代表年
        //M 代表月
        //d 代表日
        //H 代表24进制的小时
        //h 代表12进制的小时
        //m 代表分钟
        //s 代表秒
        //S 代表毫秒

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        Date d = new Date();
        String str = df.format(d);
        System.out.println("当前时间通过 yyyy-MM-dd HH:mm:ss:SSS 格式化后的输出" + str);

        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = new Date();
        String  str1 = df1.format(d1);
        System.out.println("当前时间通过 yyyy-MM-dd 格式化后输出:" + str1);



        //字符串转日期
        //模式（yyyy/MM/dd HH:mm:ss）需要和字符串格式保持一致，如果不一样就会抛出解析异常ParseException

        SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str2 = "2016-01-05 12:12:12";
        Date d2 = df2.parse(str2);
        System.out.format("字符串%s 通过格式yyyy-MM-dd HH:mm:ss %n转换为日期对象:%s",str2,d2.toString());

        System.out.println("##################################");



        //练习--日期格式化
        //准备一个长度是9的日期数组
        //使用1970年-2000年之间的随机日期初始化该数组
        //按照这些日期的时间进行升序排序
        //比如 1988-1-21 12:33:22 就会排在 1978-4-21 19:07:23 前面，因为它的时间更小，虽然日期更大

        Date[] cArr = new Date[9];  //准备一个长度为9的日期数组
        SimpleDateFormat df3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //设置时间格式

        //设置1970年为头，2000年为结尾
        Date start = new Date(0);
        Date end = df3.parse("2000-12-31 23:59:59");

        System.out.println("得到的随机日期数组：");
        for(int i = 0; i < cArr.length; i++){
            //获取随机日期
            long random = (long)(start.getTime()+Math.random()*(end.getTime()-start.getTime()+1));
            cArr[i] = new Date(random);
            System.out.print(df3.format(new Date(random))+"\t\t");
            if((i + 1) % 3 == 0)
                System.out.println();
        }


        //排序
        for(int i = 0; i < cArr.length; i++){
            for(int j = 0; j < cArr.length - i - 1; j++){
                if(cArr[j].getTime() > cArr[j + 1].getTime()){
                    Date temp = cArr[j];
                    cArr[j] = cArr[j + 1];
                    cArr[j + 1] = temp;
                }
            }
        }

        System.out.println("排序后的随机日期数组");
        for(int i = 0; i < cArr.length; i++){
            System.out.format("%s\t\t",df3.format(cArr[i]));
            if((i + 1) % 3 == 0)
                System.out.println();
        }

    }
}
