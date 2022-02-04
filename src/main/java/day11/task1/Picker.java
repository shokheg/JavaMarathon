package day11.task1;

public class Picker implements Worker {

    private int salary;
    private boolean isPayed = false;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }


    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        this.salary = getSalary()+80;
        this.warehouse.increaseCountPickedOrders();

    }

    @Override
    public void bonus() {
        if (this.warehouse.getCountPickedOrders()>=10000 && this.isPayed == false){
            this.salary = getSalary()+70000;
            this.isPayed = true;
        } else System.out.println("Бонус пока недоступен");


    }
}
