package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse ozoneWarehouse = new Warehouse();
        Picker pickerOzone1 = new Picker(ozoneWarehouse);
        Courier courierOzone1 = new Courier(ozoneWarehouse);
        businessProcess(pickerOzone1);
        businessProcess(courierOzone1);
        System.out.println(ozoneWarehouse.getCountPickedOrders());
        System.out.println(ozoneWarehouse.getCountDeliveredOrders());
        System.out.println(pickerOzone1.getSalary());
        System.out.println(courierOzone1.getSalary());



    }


    static void businessProcess(Worker worker){

        for (int i=0; i<10000; i++){
                worker.doWork();
        }
        worker.bonus();
    }
}
