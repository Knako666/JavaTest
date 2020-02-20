/**
 * 测试For循环
 * @author  HYT
 */
public class TestFor {
    public static void main(String[] args) {
        //for循环，和while一样，只是表达方式不一样


        //比较for和while

        //使用while打印0到4
        int i = 0;
        while (i < 5) {
            System.out.println("while循环输出的" + i);
            i++;
        }

        //使用for打印0到4
        for (int j = 0; j < 5; j++) {
            System.out.println("for循环输出的" + j);
        }


        //天朝有一个乞丐姓洪，去天桥要钱
        //第一天要了1块钱
        //第二天要了2块钱
        //第三天要了4块钱
        //第四天要了8块钱
        //以此类推
        //
        //问题： 洪乞丐干10天，收入是多少？

        int money = 0;
        for (int day = 1; day < 11; day++) {
            money = money + (int) Math.pow(2, (day - 1));
        }
        System.out.println("洪乞丐干10天，收入是:" + money);




        //答案：
        int moneyEachDay = 0;
        int day = 10;
        int sum = 0;
        for (int j = 1; j <= day; j++) {
            if (0 == moneyEachDay)
                moneyEachDay = 1;
            else
                moneyEachDay *= 2;

            sum += moneyEachDay;

            System.out.println(j + " 天之后，洪帮主手中的钱总数是: " + sum);
        }
    }
}
