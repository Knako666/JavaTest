/**
 * 测试数组--排序
 * @author  HYTd
 */
import java.lang.Math;
public class TestArray03 {
    public static void main(String[] args){

        //选择法排序的思路：
        //把第一位和其他所有的进行比较，只要比第一位小的，就换到第一个位置来
        //比较完后，第一位就是最小的
        //然后再从第二位和剩余的其他所有进行比较，只要比第二位小，就换到第二个位置来
        //比较完后，第二位就是第二小的
        //以此类推
        int[] a = new int[]{18,62,68,82,65,9};
        System.out.println("数组各元素依次是：");
        for (int i = 0;i<a.length;i++){
            System.out.print(a[i]+"\t\t\t");
        }
        //可以发现一个规律
        //移动的位置是从0 逐渐增加的
        //所以可以在外面套一层循环
        for(int j = 0;j<a.length-1;j++){
            for (int i =j+1;i<a.length;i++){
                if(a[i]<a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

        //打印出排序后的元素
        System.out.println("\n选择排序后各元素依次是：");
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+"\t\t\t");
        }



        //冒泡法排序的思路：
        //第一步：从第一位开始，把相邻两位进行比较
        //如果发现前面的比后面的大，就把大的数据交换在后面，循环比较完毕后，最后一位就是最大的
        //第二步： 再来一次，只不过不用比较最后一位
        //以此类推
        int b[] = new int[]{51,68,7,965,213};
        System.out.println("\n数组各元素依次是：");
        for (int i = 0;i<b.length;i++){
            System.out.print(b[i]+"\t\t\t");
        }

        //后边界在收缩
        //所以可以在外面套一层循环
        for(int j = 0;j<b.length;j++){
            for(int i = 0;i<b.length-j-1;i++){
                if(b[i]>b[i+1]){
                    int temp = b[i];
                    b[i] = b[i+1];
                    b[i+1] = temp;
                }
            }
        }

        //把排序后的内容打印出来
        System.out.println("\n冒泡排序后各元素依次是：");
        for(int i = 0;i<b.length;i++){
            System.out.print(b[i]+"\t\t\t");
        }






        //练习
        //首先创建一个长度是5的数组,并填充随机数。
        //
        //首先用选择法正排序，然后再对其使用冒泡法倒排序
        //
        //注 所谓的正排序就是从小到大排序，倒排序就是从大到小排序
        System.out.println("\n练习*****************************");


        int c[] = new int[5];
        //填充随机数到数组中
        System.out.println("\n随机取得数组的5个元素是：");
        for(int i = 0;i<c.length;i++){
            c[i]=(int)(Math.random()*100);
            System.out.print(c[i]+"\t\t\t");


        }
        //先用选择法正排序

        for(int j = 0;j<c.length-1;j++){
            for(int i = j+1;i<c.length;i++){
                if(c[i]<c[j]){
                    int temp = c[j];
                    c[j] = c[i];
                    c[i] = temp;
                }
            }
        }
        System.out.println("\n选择正排序后各元素依次是：");
        for(int i = 0;i<c.length;i++){
            System.out.print(c[i]+"\t\t\t");
        }


        //使用冒泡排序法反排序

        for(int j = 0;j<c.length;j++){
            for(int i = 0;i<c.length-j-1;i++){
                if(c[i]<c[i+1]){
                    int temp = c[i];
                    c[i] = c[i+1];
                    c[i+1] = temp;
                }
            }
        }
        //把内容打印出来
        System.out.println("\n冒泡反排序后各元素依次是：");
        for(int i = 0;i<c.length;i++){
            System.out.print(c[i]+"\t\t\t");
        }


    }

}
