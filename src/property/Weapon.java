package property;

public class Weapon extends Itme {  //  因为Weapon类继承Item类,所以Weapon类也有name和price属性
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

