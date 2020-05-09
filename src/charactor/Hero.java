package charactor;

public class Hero {

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



    public Hero(){
    }

    public Hero(String name, float hp, float armor, int moveSpeed){
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }
    public void kill(Mortal m){
        m.die();
    }
    public static void main(String[] args){
        Hero garen = new Hero();
        garen.setName("盖伦");
        ADHero vn = new ADHero();
        vn.setName("VN");
        APHero fatiao = new APHero();
        fatiao.setName("发条魔灵");
        ADAPHero ez = new ADAPHero();
        ez.setName("伊泽瑞尔");
        garen.kill(vn);
        garen.kill(fatiao);
        garen.kill(ez);
    }
}

