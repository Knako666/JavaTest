/**
 * 测试break语句
 * @author  HYT
 */
public class TestBreak {
    public static void main(String[] args){
        //打印单数
        for (int j = 0;j<10;j++){
            if (0==j%2&&j!=0){
                break;//如果是双数(除了0)，直接结束循环
            }
            System.out.println(j);
        }



    //假设你月收入是3000，除开平时花销，每个月留下1000块钱进行投资。
        //
        //然后你认真的钻研了 《股票和基金 21天从入门到精通》，达到了每年20%的投资回报率。
        //
        //那么问题来了，以每个月投资1000块钱的节奏，持续投资多少年，总收入达到100万
        //（复利计算按照每年12000投入计算，不按照每月计息）
        //
        //复利公式：
        //F = p* ( (1+r)^n );
        //F 最终收入
        //p 本金
        //r 年利率
        //n 存了多少年
        //
        //假设情景一：
        //p = 10000
        //r = 0.05
        //n = 1
        //
        //解读：
        //本金是10000
        //年利率是5%
        //存了一年 1次
        //复利收入 10000*( (1+0.05)^1 ) = 10500
        //
        //假设情景二：
        //p = 10000
        //r = 0.05
        //n = 2
        //
        //解读：
        //本金是10000
        //年利率是5%
        //存了两年
        //复利收入 10000*( (1+0.05)^2 ) = 11025




        int moneyPermonth=1000;
        int moneyPeryear=moneyPermonth*12;
        double rate = 0.2;
        //F = p*((1+r)^n);
        int sum = 0;
        int target = 1000000;
        for(int i = 1;i<100;i++){
            int year = i;
            double rateForAll=1;
            for (int k=0;k<year;k++){
                rateForAll = rateForAll*(1+rate);
            }
            int peryearGet = (int)(moneyPeryear*rateForAll);
            sum += peryearGet;
            System.out.println("经过"+year+"年,总收入为"+sum);
            if (sum>=target){
                System.out.println("一共需要"+year+"年，累计收入超过"+target);
                break;
            }
        }

        //break是结束当前循环
        //         只能结束当前循环




        //打印单数

        for(int i = 0; i< 10; i++){
            for (int j = 0;j < 10; j++){
                System.out.println(i+":"+j);
                if(0==j%2)
                    break;  //如果是双数，结束当前循环
            }
        }

        //借助boolean变量结束外部循坏
        //需要在内部循环中修改这个变量值
        //每次在内部循环结束后，都要在外部循环中判断这个值

        boolean breakout = false;//是否终止外部循环的标记
        for(int i = 0; i< 10; i++){
            for(int j = 0;j < 10; j++){
                System.out.println(i + ":" + j);
                if (0 == j % 2){
                    breakout = true ;   //终止外部循环的标记设置为true
                    break;
                }
            }
            if(breakout)    //判断是否终止外部循环
                break;
        }


        //使用标签结束外部循环
        //在外部循环的前一行，加上标签
        //在break的时候使用该标签
        //即能达到结束外部循环的效果


            //打印单数
        outloop:    //outloop这个表示是可以自定义的
        for (int i = 0; i < 10;i++){
            for(int j = 0; j < 10; j++){
                System.out.println(i+":"+j);
                if(0==j%2)
                    break outloop;  //如果是双数，结束外部循环
            }
        }



    }

}
