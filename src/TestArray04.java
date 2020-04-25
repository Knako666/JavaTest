/**
 * 测试数组--增强型for循环遍历数组
 * @author  HYT
 */
public class TestArray04 {
    public static void main(String[] args){
        //增强型for循环在遍历一个数组的时候会更加快捷
        int a[] = new int[]{123,841,22,687,61,970};
        //常规遍历
        for(int i = 0;i<a.length;i++){
            int each = a[i];
            System.out.print(each+"\t\t\t");
        }

        //增强型for循环遍历
        for(int each : a){
            System.out.println("\n"+each);
        }



        //用增强型for循环找出最大的那个数
        int max = 0;
        for(int each : a){
            if(each>max){
                max = each;
            }
        }
        System.out.println("最大的数是："+max);
    }
}
