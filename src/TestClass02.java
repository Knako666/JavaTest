/**
 * 测试类的继承
 * @author  HYT
 */
public class TestClass02 {
    public static void main(String[] args){
        //子类继承父类的属性
        Weapon infinityEdge = new Weapon();     //创建无尽之刃对象
        infinityEdge.damage = 80;
        infinityEdge.name = "无尽之刃";
        infinityEdge.price = 3600;

        Weapon thirdPower = new Weapon("三相之力",3600,40);

        System.out.println(thirdPower.name+"价格："+thirdPower.price+"\t伤害："+thirdPower.damage);

        Armor clothArmor = new Armor();
        Armor ironArmor = new Armor();
        clothArmor.name = "布甲";
        clothArmor.price = 300;
        clothArmor.ac = 15;
        ironArmor.name = "铁甲";
        ironArmor.price = 500;
        ironArmor.ac = 40;
    }
}

class Itme{     //定义物品类
    String name;       //定义属性： 名字
    int price;      //定义属性： 价格
}

class Weapon extends Itme{  //  因为Weapon类继承Item类,所以Weapon类也有name和price属性
    int damage;     //定义属性：攻击力
    public Weapon(){

    }
    public Weapon(String name,int price,int damage){
        this.name = name;
        this.price = price;
        this.damage = damage;
    }
}
//练习：设计一个类Armor护甲
//继承Item类，并且额外提供一个属性ac: 护甲等级 int类型
//
//实例化出两件护甲
//名称 价格 护甲等级
//布甲 300 15
//锁子甲 500 40

class Armor extends Itme{
    int ac;     //定义属性：护甲等级
}
