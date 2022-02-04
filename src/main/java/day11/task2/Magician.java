package day11.task2;

public class Magician extends Hero implements MagicAttack,PhysAttack {

    public Magician (){
        super(5,0,20,80);
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

    @Override
    public void magicalAttack(Hero hero) {

        double fullAttack =  super.getMagicAtt()-(super.getMagicAtt()*(hero.getMagicDef()/100.0));

        if ((hero.getHealth()-fullAttack)>0){
            hero.setHealth((int) (hero.getHealth()-fullAttack));
        } else {
            hero.setHealth(0);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
