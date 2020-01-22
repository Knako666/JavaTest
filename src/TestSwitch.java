import java.util.Scanner;

/**
 * 测试switch语句
 * 遇到多只判断时，使用switch。当然，switch完全可以使用ifelse-ifelse代替
 * @author  HYT
 */
public class TestSwitch {
    public static void main(String[] args){
        //switch可以使用byte,short,int,char,String,enum
        //
        //注: 每个表达式结束，都应该有一个break;
        //注: String在Java1.7之前是不支持的, Java从1.7开始支持switch用String的，编译后是把String转化为hash值，其实还是整数
        //注: enum是枚举类型，在枚举章节有详细讲解
        
        
        //如果使用if-else
        int day = 5;
        if (day==1){
            System.out.println("星期一");
        }
        else if (day==2){
            System.out.println("星期二");
        }
        else if (day==3){
            System.out.println("星期三");
        }
        else if (day==4){
            System.out.println("星期四");
        }
        else if (day==5){
            System.out.println("星期五");
        }
        else if (day==6){
            System.out.println("星期六");
        }
        else if (day==7){
            System.out.println("星期天");
        }
        else{
            System.out.println("这个是什么鬼？");
        }
        
        
        
        //如果使用switch
        switch (day){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("这个是什么鬼?");
        }
        System.out.println("#####################");


        //通过Scanner 输入月份，然后使用switch 判断季节

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("冬天！");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春天!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋天！");
                break;
            default:
                System.out.println("这是个什么鬼？");
        }
    }
}
