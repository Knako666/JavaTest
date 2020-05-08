package TestEnum;

public class TestEnum {
    public static void main(String[] args){
        //枚举：一个常用的场合就是switch语句中，使用枚举来进行判断
        //
        //注：因为是常量，所以一般都是全大写
        Season seson = Season.SUMMER;
        switch (seson){
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUM:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }

        //遍历枚举：借助增强型for循环，可以很方便的遍历一个枚举都有哪些常量

        for(Season s : Season.values()){
            System.out.println(s);
        }

        System.out.println("###############");
        //练习枚举：
        //英雄联盟中有这么一些分类
        //TANK (坦克)
        //WIZARD (法师 )
        //ASSASSIN (刺客)
        //ASSIST (辅助)
        //WARRIOR (近战)
        //RANGED (远程 )
        //PUSH (推进)
        //FARMING (打野)
        //设计一个枚举类型HeroType,使用上述分类作为常量
        //
        //再编写一段switch语句，把每种枚举常量输出为中文字符串

        for(HeroType heroType : HeroType.values()){
            switch (heroType){
                case TANK:
                    System.out.println("坦克");
                    break;
                case WIZARD:
                    System.out.println("法师");
                    break;
                case ASSASSIN:
                    System.out.println("刺客");
                    break;
                case ASSIST:
                    System.out.println("辅助");
                    break;
                case WARRIOR:
                    System.out.println("近战");
                    break;
                case RANGED:
                    System.out.println("远程");
                    break;
                case PUSH:
                    System.out.println("推进");
                    break;
                case FARMING:
                    System.out.println("打野");
                    break;
            }
        }
    }
}
