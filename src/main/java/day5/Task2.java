package day5;

//2. Создать класс Мотоцикл (англ. Motorbike) с полями “Модель”, “Цвет”, “Год выпуска”.
// Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
// Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
// Вывести в консоль значение каждого из полей, используя get методы.

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Java", "RED", 1987);
        System.out.println(motorbike.getModel());
        System.out.println(motorbike.getColor());
        System.out.println(motorbike.getYear());
    }
}

class Motorbike {
    private String model;
    private String color;
    private int year;

    public Motorbike(){
        System.out.println("Jopa");
    }

    public Motorbike(String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;

    }


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
