package charactor;

public class ADAPHero extends Hero implements AD,AP,Mortal {
    public ADAPHero(){
        super("");
    }
    @Override
    public void physicAttack(){
        System.out.println("进行物理攻击");
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
