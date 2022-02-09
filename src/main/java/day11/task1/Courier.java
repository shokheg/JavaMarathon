package day11.task1;

public class Courier implements Worker{

    private int salary;
    private boolean isPayed = false;
    private Warehouse warehouse;
//constants
    private final int COURIER_BONUS = 50000;
    private final int DELIVERED_ORDERS_BONUS=10000;
    private final int COURIER_SALARY_PER_ORDER=100;

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
        this.salary = salary+COURIER_SALARY_PER_ORDER;
        this.warehouse.increaseCountDeliveredOrders();

    }

    @Override
    public void bonus() {
        if (this.warehouse.getCountDeliveredOrders()>=DELIVERED_ORDERS_BONUS && isPayed == false){
            this.salary = getSalary()+COURIER_BONUS;
            this.isPayed = true;
        } else System.out.println("Бонус пока недоступен");


    }
}
