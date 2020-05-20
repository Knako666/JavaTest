package NumberAndString;




import java.util.Locale;
import java.util.Scanner;

/**
 * 数字与字符串--格式化输出
 * @author  HYT
 */
public class TestNumber04 {
    public static void main(String[] args){
        String name = "盖伦";
        int kill = 8;
        String title = "超神";

        //直接使用+号进行字符串连接，编码感觉会比较繁琐，并且维护性差，可读性差
        String sentence = name + "在进行了连续" + kill + "次击杀后，获得了" + title +"的称号";
        System.out.println(sentence);

        //使用格式化输出
        //%s表示字符串，%d表示数字，%n表示换行
        String sentenceFormat = "%s在进行了连续%d次击杀后，获得了%s的称号%n";
        //使用printf格式化输出
        System.out.printf(sentenceFormat,name,kill,title);


        //prirntf 和 format 能够的达到一模一样的效果
        //使用format格式化输出
        System.out.format(sentenceFormat,name,kill,title);



        //总长度，左对齐，补0，千位分隔符，小数点位数，本地化表达
        int year = 2020;
        //直接打印数字
        System.out.format("%d%n",year);
        //总长度是8，默认右对齐
        System.out.format("%8d%n",year);
        //总长度是8，左对齐
        System.out.format("%-8d%n",year);
        //总长度是8，不够补0
        System.out.format("%08d%n",year);
        //千位分隔符
        System.out.format("%,8d%n",year*10000);
        //小数点位数
        System.out.format("%.2f%n",Math.PI);
        System.out.format("%.3f%n",Math.PI);

        //不同国家的千位分隔符
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.US,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.UK,"%,.2f%n",Math.PI*10000);


        //练习--借助Scanner 读取字符串数据，然后用格式化输出下面
        //
        //浙江温州最大皮革厂江南皮革厂倒闭了，王八蛋老板黄鹤吃喝嫖赌，欠下了3.5个亿，带着他的小姨子跑了!我们没有办法，拿着钱包抵工资!原价都是一百多、两百多、三百多的钱包，现在全部只卖二十块，统统只要二十块!黄鹤王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!



        //用Scanner输入数据
        Scanner a1 = new Scanner(System.in);
        System.out.println("请输入地名：");
        String place = a1.nextLine();
        Scanner a2 = new Scanner(System.in);
        System.out.println("请输入公司类型：");
        String type = a2.nextLine();
        Scanner a3 = new Scanner(System.in);
        System.out.println("请输入公司名字：");
        String comName = a3.nextLine();
        Scanner a4 = new Scanner(System.in);
        System.out.println("请输入老板名称");
        String bossName = a4.nextLine();
        Scanner a5 = new Scanner(System.in);
        System.out.println("请输入金额：");
        float price = a5.nextFloat();
        Scanner a6 = new Scanner(System.in);
        System.out.println("请输入产品：");
        String product = a6.nextLine();
        Scanner a7 = new Scanner(System.in);
        System.out.println("请输入价格计量单位：");
        String unit = a7.nextLine();
        System.out.format("%s最大%s%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%.1f个亿，带着他的小姨子跑了！%n我们没有办法，只能拿着%s抵工资！%n原价都是一%s多、两%s多、三%s多的%s，现在全部只卖二十块，通通只要二十块，%s王八蛋，你不是人！我们辛辛苦苦给你干了大半年，你不发工资，还我血汗钱，还我血汗钱！",place,type,comName,bossName,price,product,unit,unit,unit,product,bossName);
    }

}
