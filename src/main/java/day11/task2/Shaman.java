package day11.task2;

public class Shaman extends Hero implements Healer,PhysAttack,MagicAttack {

    private int magicAtt=15;

    public Shaman (){
        super(10,20,20);

    }

    @Override
    public void healHimself() {
        if ((super.getHealth()+50)<=100){
            super.setHealth((super.getHealth()+50));
        } else {
            super.setHealth(100);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if ((hero.getHealth()+30)<=100){
            hero.setHealth(hero.getHealth()+30);
        }else hero.setHealth(100);
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
    public void physicalAttack(Hero hero) {

        super.physicalAttack(hero);

    }
}
