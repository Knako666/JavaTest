package property;

public class Itme{     //定义物品类
    private String name;       //定义属性： 名字
    private int price;      //定义属性： 价格

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public Itme(){
    }

}

//练习：设计一个类Armor护甲
//继承Item类，并且额外提供一个属性ac: 护甲等级 int类型
//
//实例化出两件护甲
//名称 价格 护甲等级
//布甲 300 15
//锁子甲 500 40

