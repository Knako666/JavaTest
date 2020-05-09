package charactor;

//所以，实现了AD这个接口，就必须提供AD接口中声明的方法physicAttack()
//实现在语法上使用关键字 implements
public class ADHero extends Hero implements AD,Mortal {
    public void attack(){
     System.out.println(this.getName()+"进行了一次攻击，但不知道目标是谁");
    }

    public void attack(Hero h1){
        System.out.println(this.getName()+"对"+h1.getName()+"进行了一次攻击");
    }

    public void attack(Hero h1, Hero h2){
        System.out.println(this.getName()+"同时对"+h1.getName()+"和"+h2.getName()+"进行了一次攻击");
    }

    //可变数量参数
    public void attack(Hero...heroes){
        for(Hero i : heroes){
            System.out.println(this.getName() + "攻击了"+i.getName());
        }
    }

    //进行物理攻击
@Override
    public void physicAttack(){
        System.out.println("进行物理攻击");
    }
@Override
    public void die(){
    System.out.println(this.getName()+"死亡");
    }
}

