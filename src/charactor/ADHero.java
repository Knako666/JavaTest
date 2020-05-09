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

    //隐藏父类Hero的battlewin方法
    public static void battlewin(){
        System.out.println("ad hero battle win");
    }

    public ADHero(){
        super("");
    }

    public static void main(String[] args){
//        Hero.battlewin();
//        ADHero.battlewin();
//
//        //练习-隐藏：Hero h =new ADHero();
//        //
//        //
//        //h.battleWin(); //battleWin是一个类方法
//        //h是父类类型的引用
//        //但是指向一个子类对象
//        //h.battleWin(); 会调用父类的方法？还是子类的方法？
//
//        Hero h = new ADHero();
//        h.battlewin();      //调用的依旧是父类的类方法
//
//        //当然，也不建议通过对象去调用类方法
//        // 而应该直接通过类去调用类方法，从而规避理解上的歧义。
        ADHero ad = new ADHero();
        ad.setName("ad");
        System.out.println(ad.getName());

    }
}

