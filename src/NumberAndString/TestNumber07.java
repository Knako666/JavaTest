package NumberAndString;

/**
 * 比较字符串
 * @author  HYT
 */

public class TestNumber07 {
    public static void main(String[] args){
        String str1 = "the light";
        String str2 = new String(str1);


        //"=="号用于判断是否为同一个字符串对象
        System.out.println(str1 == str2);
        //equals方法用于判断内容是否相同(必须大小写一致)
        System.out.println(str1.equals(str2));

        //一般说来，编译器每碰到一个字符串的字面值，就会创建一个新的对象
        //所以在第10行会创建了一个新的字符串"the light"
        //但是在第22行，编译器发现已经存在现成的"the light"，那么就直接拿来使用，而没有进行重复创建
        String str3 = "the light";
        //对比str1和str3的地址发现是一样的
        System.out.println(Integer.toHexString(str1.hashCode()));
        System.out.println(Integer.toHexString(str3.hashCode()));
        System.out.println(str1 == str3);   //true，即并未创建新对象

        String str4 = "The Light";
        //equalsIgnoreCase方法，可以忽略大小写判断内容是否一致
        System.out.println(str1.equalsIgnoreCase(str4));    //true


        //是否以子字符串开始或结束
        //startWith  以...开始
        //endWith  以...结束

        String start = "the";
        String end = "light";
        System.out.println(str1.startsWith(start)); //true
        System.out.println(str1.endsWith(end)); //true



        //练习----比较字符串
        //创建一个长度是100的字符串数组
        //使用长度是2的随机字符填充该字符串数组
        //统计这个字符串数组里重复的字符串有多少种
        String[] str = new String[100];
        for(int i = 0; i < str.length; i++){    //填充数组
            str[i] = getStr(2);
            System.out.print(str[i]+" ");
        }
        String[] str_2 = new String[50];
        int count = 0;
        for(int i = 0; i < str.length; i++){
            for(int j = i+1; j < str.length; j++){
                if(str[i].equals(str[j])){
                        str_2[count] = str[i];
                        count++;
                }
            }
        }
        System.out.format("%n总共有%d种重复的字符串%n",count);
        if(count != 0){
            System.out.println("分别是:");
            for(int i = 0; i < count ; i++){
                System.out.print(str_2[i]+" ");
            }
        }

    }
    public static String getStr(int length){
        String pool = "";
        for(short i ='0'; i <= '9'; i++){
            pool += (char)i;
        }
        for(short i = 'A'; i <= 'Z'; i++){
            pool += (char)i;
        }
        for(short i = 'a'; i <= 'z'; i++){
            pool += (char)i;
        }
        char cs[] = new char[length];
        for(int i = 0; i <cs.length; i++){
            int index = (int)(Math.random()*pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);
        return result;
    }


}
