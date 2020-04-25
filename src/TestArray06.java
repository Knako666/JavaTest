/**
 * 测试数组--二维数组
 */
public class TestArray06 {
    public static void main(String[] args){
        //初始化二维数组
        int[][] a = new int[2][3];  //有两个一维数组，每个一位数组长度为3
        a[1][2] = 5;    //可以直接访问一维数组，因为已经分配了空间

        //只分配了二维数组
        int[][] b = new int[2][];   //有两个一位数组，每个一维数组的长度暂未分配
        b[0] = new int[3];          //必须事先分配二维数组中的每个一维数组的长度，才可以访问

        //指定内容的同时，分配空间
        int[][] c = new int[][]{
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };



        //练习：定义一个5X5的二维数组。 然后使用随机数填充该二维数组。
        //找出这个二维数组里，最大的那个值，并打印出其二维坐标

        int[][] testArray= new int[5][5];
        //给各个元素填充1-100内的随机数，并输出二维数组
        int max = testArray[0][0];      //把二维数组第一个元素赋值给max
        int yi = 0;
        int er = 0;
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                testArray[i][j] = (int)(Math.random()*100);
                if(testArray[i][j]>max){        //遍历二维数组所有元素寻找最大值
                    max = testArray[i][j];
                    yi = i;
                    er = j;
                }
                System.out.print(testArray[i][j]+"\t\t");   //输出二维数组
            }
            System.out.println();
        }
        System.out.println("找出其中最大的元素是:"+max);
        System.out.println("其坐标是"+"["+yi+"]"+"["+er+"]");
        //输出二维数组
        /*System.out.println("二维数组各元素是：");
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                System.out.print(testArray[i][j]+"\t\t");
            }
            System.out.println();
        }
        */
    }
}
