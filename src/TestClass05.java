/**
 * 类和对象--this关键字
 * @author  HYT
 */
public class TestClass05 {
    public static void main(String[] args){
        //this这个关键字，相当于普通话里的“我”
        //
        //小明说 “我吃了” 这个时候，“我” 代表小明
        //小红说 “我吃了” 这个时候，“我” 代表小红
        //"我"代表当前人物
        //
        //this这个关键字，相当于普通话里的“我”
        //this即代表当前对象


        //练习:参考练习-构造方法 设计一个构造方法,但是参数名称不太一样，分别是
        //String name
        //float hp
        //float armor
        //int moveSpeed
        //
        //不仅如此，在这个构造方法中，调用这个构造方法
        //
        //public Hero(String name,float hp)
        Mid yasuo = new Mid("疾风剑豪",615,30.2f,330);
        System.out.println(yasuo.name+"血量是："+yasuo.hp+"\t护甲为："+yasuo.armor+"\t移动速度为："+yasuo.moveSpeed);
    }
}
class Mid extends Hero{
    public Mid(){

    }
    public Mid(String name, float hp){
        this.name = name;
        this.hp = hp;
        System.out.println("调用双参构造器");
    }
    public Mid(String name, float hp, float armor, int moveSpeed){
        this(name,hp);
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }
}
