package day11.task1;

public class Picker implements Worker {

    private int salary;
    private boolean isPayed = false;
    private Warehouse warehouse;
    //constants
    private final int PICKER_BONUS = 70000;
    private final int PICKED_ORDERS_BONUS=10000;
    private final int PICKER_SALARY_PER_ORDER=800;

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
        this.salary = getSalary()+PICKER_SALARY_PER_ORDER;
        this.warehouse.increaseCountPickedOrders();

    }

    @Override
    public void bonus() {
        if (this.warehouse.getCountPickedOrders()>=PICKED_ORDERS_BONUS && this.isPayed == false){
            this.salary = getSalary()+PICKER_BONUS;
            this.isPayed = true;
        } else System.out.println("Бонус пока недоступен");


    }
}
