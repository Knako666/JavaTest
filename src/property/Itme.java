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

    public void buy(){
        System.out.println("购买");
    }
    public void effect(){
        System.out.println("物品使用后，可以有效果");
    }

    public static void main(String[] args){
        Itme i = new Itme();
        i.effect();     //Item类的方法

        LifePotion lp = new LifePotion();
        lp.effect();        //LifePotion类中重写父类的方法

        //练习：设计一个类MagicPotion 蓝瓶，继承Item, 重写effect方法
        //并输出 “蓝瓶使用后，可以回魔法”
        MagicPotion mp = new MagicPotion();
        mp.effect();
    }

}



