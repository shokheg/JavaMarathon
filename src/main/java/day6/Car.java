package day6;


import java.util.Scanner;

class Car {
    private String model;
    private String color;
    private int year;

    public Car(String model, String color, int year){
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

    public void info(){
        System.out.println("Это автомобиль");
    }

    int yearDifference(int inputYear){
        return (inputYear-this.year);

    }
}
