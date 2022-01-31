package day7;

//В классе Самолет реализовать статический метод compareAirplanes,
// который в качестве аргументов принимает два объекта класса Airplane (два самолета)
// и выводит сообщение в консоль о том, какой из самолетов длиннее.

public class Airplane {

    String manufacturer;
    int year;
    int length;
    int weight;
    int fuel;


   public Airplane(String manufacturer, int year, int length, int weight){
       this.manufacturer = manufacturer;
       this.year = year;
       this.length = length;
       this.weight = weight;
       this.fuel = 0;
   }

   public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
       if (airplane1.length > airplane2.length){
           System.out.println("Самолет #1 " + airplane1.manufacturer + " длиннее чем самолет #2 " + airplane2.manufacturer);
       } else if (airplane1.length< airplane2.length) {
           System.out.println("Самолет #1 " + airplane1.manufacturer + " короче чем самолет #2 " + airplane2.manufacturer);
       } else if (airplane1.length == airplane2.length) {
           System.out.println("Длины самолетов равны");
       }

   }

    public void setManufacturer(String manufacturer){

        this.manufacturer = manufacturer;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setLength(int length){
        this.length = length;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    void info(){
        System.out.println("Изготовитель: " + this.manufacturer + ", год выпуска: " + this.year + ", длина: " + this.length + ", вес: " + this.weight + ", количество топлива в баке: " + this.fuel);
    }

    void fillUp(int n){
       this.fuel = this.fuel + n;
    }





}
