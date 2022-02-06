package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {


    private Integer year;
    private String name;
    private List<MusicArtist> membersOfBand = new ArrayList<>();

    public List<MusicArtist> getMembersOfBand() {
        return membersOfBand;
    }

    public void setMembersOfBand(List<MusicArtist> membersOfBand) {
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
      MusicArtist member;
       for (int i=0; i<band1.getMembersOfBand().size(); i++){
           member = band1.getMembersOfBand().get(i);
           band2.getMembersOfBand().add(member);

       }

        band1.membersOfBand.removeAll(band2.membersOfBand);

    }

    public void printMembers(){
        System.out.println(membersOfBand);
    }

    public List<MusicArtist> getMembers(){
        return membersOfBand;
    }

    public void addMember(MusicArtist member){
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
