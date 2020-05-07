package charactor;

class Support extends Hero {
    int healHp;     //定义一个治疗效果的属性
    public void heal(){
        System.out.println(name+"为某个英雄提供了治疗");
    }

    public void heal(Hero h){   //为指定英雄加血
        System.out.println(name+"为"+h.name+"提供了治疗");
    }

    public void heal(Hero h, int hp){    //为指定的英雄加了hp的血
        System.out.println(name+"为"+h.name+"提供了"+hp+"的治疗效果");
    }
}