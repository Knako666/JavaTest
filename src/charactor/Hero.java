package charactor;

public abstract class Hero {

    private String name; //姓名

    private float hp; //血量

    private float armor; //护甲

    private int moveSpeed; //移动速度

    public String getName() {
        return name;
    }

    public float getHp() {
        return hp;
    }

    public float getArmor() {
        return armor;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public void setArmor(float armor) {
        this.armor = armor;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public Hero(String name){
        this.name = name;
    }
    //故意不提供无参的构造方法
//    public Hero(){
//    }


    public Hero(String name, float hp, float armor, int moveSpeed){
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }
    //多态练习
    public void kill(Mortal m){
        m.die();
    }

    //隐藏的练习
    public static void battlewin(){
        System.out.println("hero battle win");
    }
    public abstract void attack();

    public static void main(String[] args){


    }
}

