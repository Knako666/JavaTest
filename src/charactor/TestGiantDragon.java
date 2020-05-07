package charactor;

/**
 * 饿汉式单例模式测试
 * @author  HYT
 */
public class TestGiantDragon {
    public static void main(String[] args){
        //通过new进行实例化会报错
        //GiantDragon g = new GiantDragon();

        //只能通过getInstance得到对象

        GiantDragon g1 = GiantDragon.getInstance();
        GiantDragon g2 = GiantDragon.getInstance();
        GiantDragon g3 = GiantDragon.getInstance();

        //得到的g1,g2,g3其实都是同一个对象，只是不同的引用而已
        System.out.println(g1==g2);     //true
        System.out.println(g2==g3);     //true
    }
}
