/**
 * 类 和对象的练习--方法的重载
 * @author  HYT。
 */

public class TestClass03 {
    public static void main(String[] args){
        //有一种英雄，叫做物理攻击英雄 ADHero
        //为ADHero 提供三种方法
        //
        //public void attack()
        //public void attack(Hero h1)
        //public void attack(Hero h1, Hero h2)
        ADHero mf = new ADHero();
        mf.name = "赏金猎人";
        Hero h1 = new Hero();
        h1.name = "武器大师";
        Hero h2 = new Hero();
        h2.name = "疾风剑豪";
        Hero h3 = new Hero();
        h3.name = "铸星龙王";
        mf.attack();
        mf.attack(h1);
        mf.attack(h1,h2);
        System.out.println("#####################");


        //可变数量的参数：
        //如果要攻击更多的英雄，就需要设计更多的方法，这样类会显得很累赘，像这样：
        // 
        //public void attack(Hero h1)
        //public void attack(Hero h1,Hero h2)
        //public void attack(Hero h1,Hero h2,Hero h3)
        // 
        //
        //这时，可以采用可变数量的参数
        //只需要设计一个方法
        //public void attack(Hero ...heros)
        //即可代表上述所有的方法了
        //在方法里，使用操作数组的方式处理参数heros即可

        mf.attack(h1,h2,h3);
        System.out.println("####################");

        //练习：设计一个类Support (辅助英雄)继承Hero，提供一个heal(治疗)方法
        //对Support的heal方法进行重载
        //heal()
        //heal(Hero h) //为指定的英雄加血
        //heal(Hero h, int hp) //为指定的英雄加了hp的血
        Support sonaka = new Support();
        sonaka.name = "众星之子";
        sonaka.healHp = 500;
        sonaka.heal();
        sonaka.heal(mf);
        sonaka.heal(mf,sonaka.healHp);
    }

}
class Hero {

    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度
}

class ADHero extends Hero{
    public void attack(){
     System.out.println(name+"进行了一次攻击，但不知道目标是谁");
    }

    public void attack(Hero h1){
        System.out.println(name+"对"+h1.name+"进行了一次攻击");
    }

    public void attack(Hero h1, Hero h2){
        System.out.println(name+"同时对"+h1.name+"和"+h2.name+"进行了一次攻击");
    }

    //可变数量参数
    public void attack(Hero...heroes){
        for(Hero i : heroes){
            System.out.println(name + "攻击了"+i.name);
        }
    }
}

class Support extends Hero{
    int healHp;     //定义一个治疗效果的属性
    public void heal(){
        System.out.println(name+"为某个英雄提供了治疗");
    }

    public void heal(Hero h){   //为指定英雄加血
        System.out.println(name+"为"+h.name+"提供了治疗");
    }

    public void heal(Hero h,int hp){    //为指定的英雄加了hp的血
        System.out.println(name+"为"+h.name+"提供了"+hp+"的治疗效果");
    }
}