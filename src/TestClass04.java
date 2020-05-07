/**
 * 类和对象--构造方法
 * @author  HYT
 */

public class TestClass04 {
    public static void main(String[] args){
        //什么是构造方法：
        // 方法名和类名一样（包括大小写）
        //没有返回类型
        //实例化一个对象的时候，必然调用构造方法
        Top t1 = new Top();
        Top reaven = new Top("放逐之刃",600,38.2f,325);
        System.out.println(reaven.name+"的血量为："+reaven.hp+"\t护甲为："+reaven.armor+"\t移动速度为："+reaven.moveSpeed);
    }
}

class Top extends Hero{
    //方法名和类名一样（包括大小写）
    //没有返回类型
    public Top(){   //这个无参的构造方法如果不写，系统会在编译时默认提供一个
        System.out.println("实例化对象时，必然被调用");
    }

    //一旦提供了一个有参的构造方法
    //同时又没有显式的提供一个无参的构造方法
    //那么默认的无参的构造方法，就“木有了“

    //练习：为Top设计4个参数的构造方法
    //这四个参数分别是
    //String topName
    //float topHP
    //float topArmor
    //int topMoveSpeed
    public Top(String topName, float topHp, float topAmor, int topMoveSpeed){
        name = topName;
        hp = topHp;
        armor = topAmor;
        moveSpeed = topMoveSpeed;
    }
}

