package charactor;

/**
 * 类和对象--单例模式
 * 单例模式又叫做 Singleton模式，指的是一个类，在一个JVM里，只有一个实例存在。
 *
 * 这个是面试的时候经常会考的点，面试题通常的问法是:
 * 什么是单例模式？
 * 回答的时候，要答到三元素
 * 1. 构造方法私有化
 * 2. 静态属性指向实例
 * 3. public static的 getInstance方法，返回第二步的静态属性
 *
 * @author  HYT
 */
//GiantDragon 应该只有一只，通过私有化其构造方法，使得外部无法通过new 得到新的实例。
//GiantDragon 提供了一个public static的getInstance方法，外部调用者通过该方法获取18行定义的对象，而且每一次都是获取同一个对象。 从而达到单例的目的。
//这种单例模式又叫做饿汉式单例模式，无论如何都会创建一个实例
public class GiantDragon {
    //私有化构造方法，使得该类无法在外部通过new 进行实例化
    private GiantDragon(){

    }

    //准备一个类属性，指向一个实例化对象。因为是类属性，所以只有一个
    private static GiantDragon instance = new GiantDragon();

    //pubilc static 方法，提供给调用者获取18行定义的对象
    public static GiantDragon getInstance(){
        return instance;
    }
}
