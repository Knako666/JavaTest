/**
 * 测试类和对象 --引用
 */
public class TestClass01 {

    static class Hero{
        String name;
        float hp;
        float armor;
        int moveSpeed;

    }
    public static void main(String[] args){
        //引用的概念，如果一个变量的类型是类 类型，而非基本类型，则该变量又叫做引用
        //创建一个Hero类的对象
        new Hero();
        //使用一个引用来指向这个对象
        Hero h = new Hero();
        //h这个变量表示Hero类型，又叫做引用
        //“=”的意识是指h这个引用代表右侧创建的对象
        //“代表”在面向对象里，又叫做“指向”
        Hero h1 = h;    //h2指向h1所指向的对象
        Hero h2 = h;
        Hero h3 = h;
        Hero h4 = h1;

        //h,h1,h2,h3,h4,五个引用，都指向同一个对象（即多个引用，一个对象）

        Hero garen = new Hero();    //  引用garen指向新对象
        garen = new Hero();             //引用garen指向第二个新创建的对象

        //此处为1个引用，多个对象，因为garen又指向了第二个新创建的对象
        //所以第一个新对象没有任何引用指向了，即没有任何手段控制和访问该对象，该对象便无用了
        //因此，同一时间，一个引用只能指向一个对象（有意义）


    }


}
