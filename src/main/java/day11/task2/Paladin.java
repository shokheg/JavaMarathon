package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {

    public Paladin(){
        super(15,50,20);

    }

    @Override
    public void healHimself() {

        if ((super.getHealth()+25)<=100){
            super.setHealth((super.getHealth()+25));
        } else {
            super.setHealth(100);
        }


    }

    @Override
    public void healTeammate(Hero hero) {

        if ((hero.getHealth()+10)<=100){
            hero.setHealth(hero.getHealth()+10);
        }else hero.setHealth(100);
    }

    @Override
    public void physicalAttack(Hero hero) {

        //Значения защиты в процентах, а другие параметры в единицах,
        // т.е. атаковав воина типом Ф 10,
        // он получит урон не 10, а 2 ед. урона (10 - 10*0.8 = 2)

        super.physicalAttack(hero);
    }


}
