package day8;

public class Airplane {

    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    StringBuilder stringBuilder = new StringBuilder();


   public Airplane(String manufacturer, int year, int length, int weight){
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

    @Override
    public String toString(){
       return stringBuilder.append("Изготовитель: ").append(this.manufacturer).append(", год выпуска: ").append(this.year).append(", длина: ").append(this.length).append(", вес: ").append(this.weight).append(", количество топлива в баке: ").append(this.fuel).toString();



    }





}