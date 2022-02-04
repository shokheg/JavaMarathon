package day11.task1;

public class Courier implements Worker{

    private int salary;
    private boolean isPayed = false;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
       this.warehouse = warehouse;
    }


    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        this.salary = getSalary()+100;
        this.warehouse.increaseCountDeliveredOrders();

    }

    @Override
    public void bonus() {
        if (this.warehouse.getCountDeliveredOrders()>=10000 && isPayed == false){
            this.salary = getSalary()+50000;
            this.isPayed = true;
        } else System.out.println("Бонус пока недоступен");


    }
}
