package property;

/**
 * 接口与继承--方法的重写
 * @author  HYT
 */
public class LifePotion extends Itme{
    @Override
    public void effect(){
        System.out.println("血瓶使用后，可以回血");
    }
}
