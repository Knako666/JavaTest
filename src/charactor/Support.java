package charactor;

class Support extends Hero implements Healer {

    int healHp;     //定义一个治疗效果的属性
    @Override
    public void heal(){
        System.out.println(this.getName()+"为某个英雄提供了治疗");
    }

    public void heal(Hero h){   //为指定英雄加血
        System.out.println(this.getName()+"为"+h.getName()+"提供了治疗");
    }

    public void heal(Hero h, int hp){    //为指定的英雄加了hp的血
        System.out.println(this.getName()+"为"+h.getName()+"提供了"+hp+"的治疗效果");
    }
}