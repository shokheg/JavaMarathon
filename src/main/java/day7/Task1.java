package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Airbus",2010,98,105000);
        Airplane airplane2 = new Airplane("Boeing",2015,110,94000);
        Airplane.compareAirplanes(airplane1,airplane2);
    }
}