package NumberAndString;

import javax.swing.*;

public class MyStringBuffer implements IStringBuffer{

    int capacity = 16;
    int length = 0;
    char[] value;
    public MyStringBuffer(){    //无参构造方法
        value = new char[capacity];
    }

    public MyStringBuffer(String str){  //有参的构造方法
        this();
        if(null == str){
            return;
        }

        if(capacity<value.length){
            capacity = value.length*2;
            value = new char[capacity];
        }

        if(capacity >= str.length())
            System.arraycopy(str.toCharArray(), 0, value, 0, str.length());

        length = str.length();

    }
    @Override
    public void append(String str){
        insert(length,str);
    }

    @Override
    public void append(char c) {
        append(String.valueOf(c));
    }

    //插入insert 和 append
    //边界条件判断
    //插入前，需要先判断 是一些边界条件。比如插入位置是否合法，插入的字符串是否为控
    //扩容
    //（1）要判断是否需要扩容。如果插入的字符串加上已经存在的内容长度超过了容量，那么就需要扩容。
    //（2）数组的长度是固定的，不能改变，数组本身不支持扩容。我们使用变通的方式来解决这个问题。
    //（3）根据需要插入的字符串长度和已经存在的内容的长度，计算出一个新的容量。然后根据这个容量来创建一个新的数组，接着把原来的数组内容复制到新数组中，再用value这个引用指向新数组，从而达到扩容的效果
    //插入字符串
    //（1）找到要插入字符串的位置，从这个位置开始，把原数据看成两段，把后半段向后挪动一个距离，在这个距离刚好等于插入字符串的长度
    //（2）然后把要插入的数据，插入这个挪出来的刚刚好的位置里。
    //修改length的值
    //最后修改length的值，是原来的值加上插入字符串的长度
    //insert（int，char）
    //参数是字符的insert方法，通过调用insert（int，String）也就实现了。
    //append
    //追加，就是在最后的位置插入。所以不需要单独开发方法，直接调用insert方法，就能达到最后位置插入的效果
    @Override
    public void insert(int pos, char b) {
        insert(pos,String.valueOf(b));
    }

    @Override
    public void insert(int pos, String b) {
        //边界条件判断
        if(pos < 0)
            return;
        if (pos > length)
            return;
        if (null == b)
            return;

        //扩容
        while (length+b.length()>capacity){
            capacity = (int)((length+b.length())*1.5f);
            char[] newValue = new char[capacity];
            System.arraycopy(value, 0, newValue, 0, length);
            value = newValue;
        }

        char[] cs = b.toCharArray();

        //先把已经存在的数据往后移
        System.arraycopy(value, pos, value, pos + cs.length, length-pos);
        //把要插入的数据插入到指定位置
        System.arraycopy(cs, 0, value, pos, cs.length);

        length = length + cs.length;
    }

    public String toString(){
        char[] realValue = new char[length];
        System.arraycopy(value, 0, realValue, 0, length);
        return new String(realValue);
    }

    @Override
    public void delete(int start) {
        delete(start,length);
    }

    @Override
    public void delete(int start, int end) {
        //边界判断
        if (start < 0)
            return;
        if(start > length)
            return;
        if (end < 0)
            return;
        if (end > length)
            return;
        if (start >= end)
            return;

        System.arraycopy(value, end, value, start, length - end);
        length -= end-start;
    }

    @Override
    public void reverse() { //反转
        for(int i = 0; i < length/2; i++){
            char temp = value[i];
            value[i] = value[length-i-1];
            value[length-i-1] = temp;
        }
    }

    @Override
    public int length() {
        return length;
    }

    public static void main(String[] args){
        MyStringBuffer sb = new MyStringBuffer(" there light");
        System.out.println(sb);

        sb.insert(0, "let");
        System.out.println(sb);

        sb.insert(10, "be ");
        System.out.println(sb);

        sb.insert(0, "God Say:");
        System.out.println(sb);

        sb.append("!"); //String参数的append
        System.out.println(sb);

        sb.append('?'); //char参数的append
        System.out.println(sb);

        sb.reverse();       //反转
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(0, 4);    //删除0到4-1位的字符
        System.out.println(sb);

        sb.delete(4);   //从4开始所有删除
        System.out.println(sb);
    }
}
