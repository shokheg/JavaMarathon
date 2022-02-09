package day11.task2;

public class Magician extends Hero implements MagicAttack,PhysAttack {

    private int magicAtt = 20;

    public Magician (){
        super(5,0,80);
    }


    @Override
    public void physicalAttack(Hero hero) {

        super.physicalAttack(hero);
    }

    @Override
    public void magicalAttack(Hero hero) {

        double fullAttack =  magicAtt-(magicAtt*(hero.getMagicDef()/100.0));

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
