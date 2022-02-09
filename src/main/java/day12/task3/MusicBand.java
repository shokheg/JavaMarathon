package day12.task3;

public class MusicBand {


    private Integer year;
    private String name;

    public MusicBand (String name, Integer year){
        this.name = name;
        this.year = year;
    }

    public Integer getYear(){
        return year;
    }

    public void setYear(Integer year){
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

}
