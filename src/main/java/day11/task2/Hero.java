package day11.task2;

public abstract class Hero {

    private int health;
    private int physDef;
    private int magicDef;
    private int physAtt;
    private int magicAtt;

    public Hero(int physAtt, int physDef, int magicAtt, int magicDef){
        health = 100;
        this.magicDef = magicDef;
        this.magicAtt = magicAtt;
        this.physAtt = physAtt;
        this.physDef = physDef;
    }
    public int getPhysDef() {
        return physDef;
    }

    public int getMagicDef() {
        return magicDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public int getMagicAtt() {
        return magicAtt;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "health=" + health +'}';
    }
}
