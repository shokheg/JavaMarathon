package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {


    private Integer year;
    private String name;
    private List<String> membersOfBand = new ArrayList<>();

    public List<String> getMembersOfBand() {
        return membersOfBand;
    }

    public void setMembersOfBand(List<String> membersOfBand) {
        this.membersOfBand = membersOfBand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }


    public MusicBand(String name, Integer year){
        this.name = name;
        this.year = year;
    }
    public static void transferMembers (MusicBand band1, MusicBand band2){
      String member;
       for (int i=0; i<band1.getMembersOfBand().size(); i++){
           member = band1.getMembersOfBand().get(i);
           band2.getMembersOfBand().add(member);

       }

        band1.membersOfBand.removeAll(band2.membersOfBand);

    }

    public void printMembers(){
        System.out.println(membersOfBand);
    }

    public List<String> getMembers(){
        return membersOfBand;
    }

    public void addMember(String member){
        membersOfBand.add(member);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

}
