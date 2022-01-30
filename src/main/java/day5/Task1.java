package day5;

//1. Создать класс Автомобиль (англ. Car) с полями “Модель”, “Цвет”, “Год выпуска”.
// Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
// Задать значение для каждого поля, используя set методы.
// Вывести в консоль значение каждого из полей, используя get методы.
//Созданный вами класс должен отвечать принципам инкапсуляции.

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Lada");
        car.setColor("Red");
        car.setYear(1989);
        System.out.println(car.getColor());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}

class Car{
    private String model;
    private String color;
    private int year;

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
}
