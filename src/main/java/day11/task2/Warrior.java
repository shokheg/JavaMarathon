package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior (){
        super(30,80,0,0);

    }

    @Override
    public void physicalAttack(Hero hero) {
        double fullAttack =  super.getPhysAtt()-(super.getPhysAtt()*(hero.getPhysDef()/100.0));

        if ((hero.getHealth()-fullAttack)>0){
            hero.setHealth((int) (hero.getHealth()-fullAttack));
        } else {
            hero.setHealth(0);
        }
    }
}
