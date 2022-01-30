package day6;

public class Airplane {

    String manufacturer;
    int year;
    int length;
    int weight;
    int fuel;


   public Airplane (String manufacturer, int year, int length, int weight){
       this.manufacturer = manufacturer;
       this.year = year;
       this.length = length;
       this.weight = weight;
       this.fuel = 0;
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
