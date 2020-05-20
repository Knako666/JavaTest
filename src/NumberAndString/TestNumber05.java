package NumberAndString;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 数字与字符串--字符
 * @author  HYT
 */
public class TestNumber05 {
    public static void main(String[] args){
        //保存一个字符的时候用char
        char c1 = 'a';
        char c2 = '1';//字符1，而非数字1
        char c3 = '中';//汉字字符
        //char c4 = 'ab';   只能放一个字符


        //char对应的封装类
        Character c = c1;   //自动装箱
        c1 = c;     //自动拆箱


        //Character常见方法
        System.out.println(Character.isLetter('a'));    //判断是否为字母
        System.out.println(Character.isDigit('a'));     //判断是否为数学
        System.out.println(Character.isWhitespace(' '));//判断是否为空白
        System.out.println(Character.isUpperCase('a'));//判断是否为大写
        System.out.println(Character.isLowerCase('a'));//判断是否为小写

        System.out.println(Character.toUpperCase('a'));//转换为大写
        System.out.println(Character.toLowerCase('A'));//转换为小写

        //String a = 'a';       不能够直接把一个字符转换成字符串
        String a2 = Character.toString('a');//需要用到Charact的方法转换为字符串




        //常见转义
        System.out.println("使用空格无法达到对齐的效果");
        System.out.println("abc def");
        System.out.println("ab def");
        System.out.println("a def");
        System.out.println("使用\\t制表符可以达到对齐的效果");
        System.out.println("abc\tdef");
        System.out.println("ab\tdef");
        System.out.println("a\tdef");
        
        System.out.println("一个\\t制表符长度是8");
        System.out.println("12345678def");

        System.out.println("换行符\\n");
        System.out.println("abc\ndef");

        System.out.println("单引号\\'");
        System.out.println("abc\'def");
        System.out.println("双引号\\\"");
        System.out.println("abc\"def");
        System.out.println("反斜杠本身 \\");
        System.out.println("abc\\def");



        //练习--Character
        //通过Scanner从控制台读取字符串，然后把字符串转换为字符数组
        //参考的转换方式:
        //
        //String str = "abc123";
        //char[] cs = str.toCharArray();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = scanner.nextLine();
        char[] cs = str.toCharArray();
//        char[] temp = new char[cs.length];
        int n = 0;
        for(int i = 0;i<cs.length;i++){
            char d = cs[i];
            if(Character.isUpperCase(cs[i]) || Character.isDigit(cs[i])){
//                System.arraycopy(cs,i,temp,n,1);
//                n++;
                System.out.print(d);
            }
        }

    }
}
