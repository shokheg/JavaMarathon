package day11.task2;

public abstract class Hero {

    private int health;
    private int physDef;
    private int magicDef;
    private int physAtt;


    public Hero(int physAtt, int physDef, int magicDef){
        health = 100;
        this.magicDef = magicDef;
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

    public void physicalAttack(Hero hero) {

        double fullAttack =  this.getPhysAtt()-(this.getPhysAtt()*(hero.getPhysDef()/100.0));

        if ((hero.getHealth()-fullAttack)>0){
            hero.setHealth((int) (hero.getHealth()-fullAttack));
        } else {
            hero.setHealth(0);
        }

    }
}
