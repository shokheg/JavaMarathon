package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2008, 89, 110);
        airplane.setYear(2010);
        airplane.setLength(92);
        airplane.fillUp(21000);
        airplane.fillUp(30500);
        airplane.info();

    }
}
