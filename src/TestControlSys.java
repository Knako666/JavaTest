/**
 * 控制流程综合练习
 * @author HYT
 */
public class TestControlSys {
    public static void main(String[] args){
        for(int i = 1;i < 21; i++ ){

            for(int j = 20;j >0; j--){
                if((i%2==0)&&(j%2==0)){
                    break;
                }

                System.out.println("离黄金分割点（0.618）最近的两个数相除是："+i+"/"+j+"="+(i/j));
            }

        }




        //######################
        System.out.println("#########################################");

        // 寻找某两个数相除，其结果 离黄金分割点 0.618最近
        //
        // 分母和分子不能同时为偶数
        // 分母和分子 取值范围在[1-20]
        int range = 20; // 取值范围
        float breakPoint = 0.618f; // 黄金分割点

        float minDiff = 100; // 离黄金分割点的差值
        int answerFenzi = 0; // 找到的分子
        int answerFenmu = 0; // 找到的分母
        for (int fenzi = 1; fenzi <= range; fenzi++) {
            for (int fenmu = 1; fenmu <= range; fenmu++) {
                // 分母和分子不能同时为偶数
                if (0 == fenzi % 2 & 0 == fenmu % 2)
                    continue;

                // 取值
                float value = (float) fenzi / fenmu;
                // 取离黄金分割点的差值
                float diff = value - breakPoint;
                // 绝对值
                diff = diff < 0 ? 0 - diff : diff;

                // 找出最小的差值
                if (diff < minDiff) {
                    minDiff = diff;
                    answerFenzi = fenzi;
                    answerFenmu = fenmu;
                }
            }
        }

        System.out.println("离黄金分割点(" + breakPoint + ")最近的两个数相除是:" + answerFenzi + "/" + answerFenmu + "="
                + ((float) answerFenzi / answerFenmu));





        //练习水仙花数
        //一定是3位数
        //每一位的立方，加起来恰好是这个数本身，比如153=1*1*1+5*5*5+3*3*3

        //寻找所有水仙花数



        for(int num=100; num<=999 ; num++){
            int hundred=num/100;
            int decade=num%100/10;
            int unit=num%100%10;
            if(num==hundred*hundred*hundred+decade*decade*decade+unit*unit*unit){
                System.out.println("水仙花数有："+num);
            }
        }




        //小学算术题
        //多层循环嵌套解决

        for(int a=0;a<=8;a++){
            for(int j=0;j<=8;j++){
                for(int k=0;k<=14;k++){
                    for(int y=0;y<=10;y++){
                        if(a+j==8&&a+k==14&&k-y==6&&j+y==10){
                            System.out.println("a="+a+" j="+j+" k="+k+" y="+y);
                        }
                    }
                }
            }
        }

    }
}
