package charactor;

public class APHero extends Hero implements AP,Mortal {
    public APHero(){
        super("");
    }
    @Override
    public void magicAttack(){
        System.out.println("进行魔法攻击");
    }
    @Override
    public void die(){
    System.out.println(this.getName()+"死亡");
    }
}
