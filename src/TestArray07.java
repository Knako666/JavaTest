/**
 * 测试数组--调用JAVA.UTIL.ARRAYS类
 * @author  HYT
 */
import java.lang.reflect.Array;
import java.util.Arrays;
import java.lang.Math;
public class TestArray07 {
    public static void main(String[] args){
        //Arrays是针对数组的工具类，可以进行 排序，查找，复制填充等功能。


        //1.关键字：copyOfRange----数组赋值

        //与使用System.arraycopy进行数组复制类似的， Arrays提供了一个copyOfRange方法进行数组复制。
        //不同的是System.arraycopy，需要事先准备好目标数组，并分配长度。 copyOfRange 只需要源数组就就可以了，通过返回值，就能够得到目标数组了。
       //除此之外，需要注意的是 copyOfRange 的第3个参数，表示源数组的结束位置，是取不到的。

        int[] a = new int[]{18,62,68,82,65,9};

        //copyOfRange(int[] original, int from, int to)
        //第一个参数表示源数组
        //第二个参数表示开始位置（取得到）
        //第三个参数表示结束位置（取不到）


        //第二种：copyOf(int[] originnal,int length)
        //第一个参数表示源数组
        //第二个参数表示赋值长度
        //这个方法只能够用来从源数组的起始位置开始复制

        int[] b =Arrays.copyOfRange(a,0,4);
        System.out.println("b数组的各元素为：");
        for(int i : b){
            System.out.print(i+"\t\t");
        }


        //2.关键字：toString----转换为字符串

        //如果要打印一个数组的内容，就需要通过for循环来挨个遍历，逐一打印
        //
        //但是Arrays提供了一个toString()方法，直接把一个数组，转换为字符串，这样方便观察数组的内容

        int[] c = new int[]{123,858,44,6894,21};
        //使用toString打印数组
        System.out.println("\n"+Arrays.toString(c));




        //3.关键字：sort----排序

        //在前面章节学习了 选择法排序 和 冒泡法排序，Arrays工具类提供了一个sort方法，只需要一行代码即可完成排序功能。
        //从大到小排序

        int[] d = new int[]{338,485,22,141,2};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(d));
        Arrays.sort(d); // 排序
        System.out.println("排序后");
        System.out.println(Arrays.toString(d));



        //4.关键字：binarySearch----搜索

        //查询元素出现的位置
        //需要注意的是，使用binarySearch进行查找之前，必须使用sort进行排序
        //如果数组中有多个相同的元素，查找结果是不确定的
        
        int[] e = new int[]{13,55,679,21,326};
        Arrays.sort(e);
        System.out.println(Arrays.toString(e));

        //使用binarySearch前，必须先使用sort排序
        System.out.println("数字326出现的位置是："+Arrays.binarySearch(e,326));


        //5.关键字:equals----判断是否相同

        //比较两个数组的内容是否一样
        //第二个数组的最后一个元素是8，和第一个数组不一样，所以比较结果是false

        int[] f = new int[]{18, 62, 68, 82, 65, 9 };
        int[] g = new int[]{18, 62, 68, 82, 65, 8};

        System.out.println(Arrays.equals(f,g));


        //6.关键字fill----填充
        //使用同一个值，填充整个数组


        int[] h =new int[4];
        Arrays.fill(h,25);
        System.out.println(Arrays.toString(h));




        //练习：二维数组排序
        //首先定义一个5X8的二维数组，然后使用随机数填充满。
        //借助Arrays的方法对二维数组进行排序。
        //参考思路：
        //先把二维数组使用System.arraycopy进行数组复制到一个一维数组
        //然后使用sort进行排序
        //最后再复制回到二维数组。



        int[][] arr =new int[5][8];
        for(int i = 0;i<5;i++){
            for(int j = 0;j<8;j++){
                arr[i][j] = (int)(Math.random()*100);
            }
        }

        //输出arr数组：
        System.out.println("arr[][]数组各元素为:");
        for(int i = 0;i<5;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        //int[] temp = new int[8];
        //System.arraycopy(arr[0],0,temp,0,8);

        //将arr的各一元数组复制到新数组然后输出


        //int[] temp = Arrays.copyOf(arr[0],8);
        //System.out.println("arr[0]为：");
        //System.out.println(Arrays.toString(temp));

        for(int i = 0;i<5;i++){
            int[] temp = Arrays.copyOf(arr[i],8);
            System.out.println("arr["+i+"]为："+Arrays.toString(temp));
            //对新的的各一元数组进行排序。然后复制到arr中
            Arrays.sort(temp);
            arr[i] = temp;


        }
        //输出排序后的arr[][]数组各元素
        System.out.println("排序后的arr[][]数组各元素为：");

        for(int i = 0;i<5;i++){
            System.out.println("arr["+i+"]为"+Arrays.toString(arr[i]));
        }






    }
    
}
