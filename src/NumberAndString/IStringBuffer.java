package NumberAndString;

public interface IStringBuffer {
    public void append(String str); //追加字符串
    public void append(char c); //追加字符
    public void insert(int pos, char b);    //指定位置插入字符
    public void insert(int pos, String b);  //指定位置插入字符串
    public void delete(int start);  //从开始位置删除剩下的
    public void delete(int start, int end); //从开始位置删除到结束位置-1，即为左闭右开区间【start，end）
    public void reverse();  //反转
    public int length();    //返回长度
}
