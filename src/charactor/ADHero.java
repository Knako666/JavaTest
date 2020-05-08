package charactor;

public class ADHero extends Hero {
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
}

