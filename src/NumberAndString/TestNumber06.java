package NumberAndString;


import java.util.Arrays;

/**
 * 数字与字符串--操纵字符串
 * @author  HYT
 */
public class TestNumber06 {
    public static void main(String[] args){
        //创建字符串
        //字符串即字符的组合，在Java中，字符串是一个类，所以我们见到的字符串都是对象
        //常见创建字符串手段：
        //1. 每当有一个字面值出现的时候，虚拟机就会创建一个字符串
        //2. 调用String的构造方法创建一个字符串对象
        //3. 通过+加号进行字符串拼接也会创建新的字符串对象

        String garen = "盖伦";        //字面值，虚拟机碰到字面值就会创建一个字符串对象
        String teemo = new String("提莫");    //创建了两个字符串对象
        char[] cs = new char[]{'崔','斯','特'};
        String hero = new String(cs);    //通过字符数组创建字符串对象
        String hero3 = garen + teemo;   //通过+号进行字符串拼接会创建新的字符串对象



        //final
        //String 类被final所修饰，因此无法被继承
        //static class MyString extends String{}    //报错



        //immutable
        //immutable 是指不可改变的
        //比如创建了一个字符串对象
        //String garen ="盖伦";
        //不可改变的具体含义是指：
        //不能增加长度
        //不能减少长度
        //不能插入字符
        //不能删除字符
        //不能修改字符
        //一旦创建好这个字符串，里面的内容 永远 不能改变
        //
        //String 的表现就像是一个常量



        //字符串格式化
        //如果不使用字符串格式化，就需要进行字符串连接，如果变量比较多，拼接就会显得繁琐
        //使用字符串格式化，就可以简洁明了
        //更多的格式化规则，参考格式化输出

        String name = "盖伦";
        int kill = 9;
        String title = "超神";

        //直接使用+进行字符串连接，编码会感觉比较繁琐，并且维护性较差
        String sentence = name + "在进行了连续" + kill + "次击杀后，获得了" + title + "称号";
        System.out.println(sentence);

        //格式化字符串
        //%s表示字符串，%d表示数字，%n表示换行
        String sentenceFormat = "%s在进行了连续%d次击杀后获得了%s称号%n";
        String sentence2 = String.format(sentenceFormat,name,kill,title);

        System.out.println(sentence2);
        System.out.format("%s在进行了连续%d次击杀后获得了%s称号%n",name,kill,title);





        //length方法返回当前字符串的长度
        //可以有长度为0的字符串，即为空字符串

        System.out.println(name.length());
        String unknowHero = "";

        //可以有长度为0的字符串，即为空字符串
        System.out.println(unknowHero.length());



        //练习--随机字符串
        //创建一个长度是5的随机字符串，随机字符有可能是数字，大写字母或者小写字母
        //
        //给点提示: 数字和字符之间可以通过互相转换
        //
        //char c = 'A';
        //short s = (short) c;
        //
        //
        //通过这个手段就能够知道字符 a-z A-Z 0-9 所对应的数字的区间了
        //
        //需要用到ASCII码对照表


//方法一：
        short start = '0';
        short end = 'z'+1;
        char[] randomString = new char[5];
        for(int i = 0; i < randomString.length; i++){
            char r = (char)(start+Math.random()*(end-start));
            Character r1 = r;
            if(Character.isDigit(r1) || Character.isLetter(r1)){//  判断是否为字符或数字
                randomString[i] = r;
            }
        }
        String rdString = new String(randomString);
        System.out.println(rdString);

//方法二：
//        char[] randomString = new char[5];
//        for(int i = 0;i < randomString.length; i++){
//            int n = (int)(1+Math.random()*3);
//            switch (n){
//                case 1:
//                    randomString[i] = (char)(48+Math.random()*10);
//                case 2:
//                    randomString[i] = (char)(65+Math.random()*26);
//                case 3:
//                    randomString[i] = (char)(97+Math.random()*26);
//                break;
//            }
//        }
//        String rdString = new String(randomString);
//        System.out.println(rdString);






        //练习--字符串数组排序
        //创建一个长度是8的字符串数组
        //使用8个长度是5的随机字符串初始化这个数组
        //对这个数组进行排序，按照每个字符串的首字母排序(无视大小写)
        //
        //注1： 不能使用Arrays.sort() 要自己写
        //注2： 无视大小写，即 Axxxx 和 axxxxx 没有先后顺序


        String[] sortString = new String[8];
        char[] elementString = new char[5];
        for(int j = 0; j<sortString.length; j++){
            for(int i = 0; i<elementString.length; i++) {
                char r = (char) (start + Math.random() * (end - start));
                Character r1 = r;       //将r进行自动装箱变为Character才能使用.isDigit()和.isLetter()方法
                if (Character.isDigit(r1) || Character.isLetter(r1)) {//  判断是否为字符或数字
                    elementString[i] = r;
                }
                String temp = new String(elementString);
                sortString[j] = temp;
            }

        }
        System.out.println(Arrays.toString(sortString));

        System.out.println("排序开始：");
        //冒泡排序法
        for(int i = 0; i<sortString.length; i++){
            for(int j = 0; j<sortString.length-i-1; j++){
                char fir = sortString[j].charAt(0);
                char sec = sortString[j+1].charAt(0);
                if(Character.toLowerCase(fir)>Character.toLowerCase(sec)){  //将字母都转换为小写进行比较（因为不区分大小写）
                    String temp = sortString[j];
                    sortString[j] = sortString[j+1];
                    sortString[j+1] = temp;
                }
            }
        }

        System.out.println("排序结束");
        System.out.println(Arrays.toString(sortString));





        //练习--穷举法破解密码
        //1. 生成一个长度是3的随机字符串，把这个字符串作为当做密码
        //
        //2. 使用穷举法生成长度是3个字符串，匹配上述生成的密码
        //
        //要求： 分别使用多层for循环 和 递归解决上述问题

        //生成长度为3的随机字符串当做密码

        //普通方法：
//        String pswString = makeStr(3);
//        System.out.format("密码是:%s%n",pswString);
//
//        //穷举法生成匹配密码
//
//        String pool = "";   // 创建字符池
//        for(short i ='0'; i <= '9'; i++){
//            pool += (char)i;
//        }
//        for(short i = 'a'; i <= 'z'; i++){
//            pool += (char)i;
//        }
//        for(short i = 'A'; i <= 'Z'; i++){
//            pool += (char)i;
//        }
//        System.out.println("猜出来的密码是：");
//        char[] guessPsw = new char[3];
//        outloop : for(int i = 0; i < pool.length(); i++){       //穷举法猜密码,outloop为标记最外层循环
//            for(int j = 0; j < pool.length(); j++){
//                for(int k = 0; k < pool.length(); k++){
//                    guessPsw[0] = pool.charAt(i);
//                    guessPsw[1] = pool.charAt(j);
//                    guessPsw[2] = pool.charAt(k);
//
//                    String guess = new String(guessPsw);
//                    System.out.println(guess);
//
//                    if(guess.equals(pswString)){        //如果密码正确匹配则输出，否则继续循环
//                        System.out.format("找到密码了，密码是：%s%n",guess);
//                        break outloop;
//                    }
//                }
//            }
//        }



        //递归方法：
        String psw = makeStr(3);    //先获取密码
        System.out.format("密码是：%s%n",psw);

        //调用递归方法来破解密码
        char[] guessPsw = new char[psw.length()];
        generatePsw(guessPsw,psw);
    }



    public static String makeStr(int length){     //封装一个获取随机字符串的方法
        String pool = "";
        for(short i ='0'; i <= '9'; i++){
            pool += (char)i;
        }
        for(short i = 'a'; i <= 'z'; i++){
            pool += (char)i;
        }
        for(short i = 'A'; i <= 'Z'; i++){
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
    //递归找密码:
    public static boolean found = false;    //先设置一个布尔变量来作为找寻到密码的判定标准

    public static void generatePsw(char[] guessPsw, String psw){
        generatePsw(guessPsw, 0, psw);
    }

    public static void generatePsw(char[] guessPsw, int index, String psw){
        if(found)   //定义递归头
            return;
        for(short i = '0'; i <= 'z' ; i++){
            char c = (char)i;
            if(!Character.isLetterOrDigit(c))
                continue;
            guessPsw[index] = c;
            if(index != guessPsw.length-1){     //判定index（已猜测的密码位数）是否已经是最后一位
                generatePsw(guessPsw, index +1, psw);
            } else {
                String guess = new String(guessPsw);
                if(guess.equals(psw)){
                    System.out.format("找到了，密码是：%s%n",guess);
                    found = true;       //此处将判定值设置为正确即可返回函数

                }
            }
        }
    }

}
