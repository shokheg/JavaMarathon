package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior (){
        super(30,80,0);

    }

    @Override
    public void physicalAttack(Hero hero) {
        super.physicalAttack(hero);
    }
}
