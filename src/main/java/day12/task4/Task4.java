package day12.task4;



public class Task4 {
    public static void main(String[] args) {
        MusicBand abba = new MusicBand("ABBA",1972);
        MusicBand kiss = new MusicBand("KISS",1973);
        MusicBand manoWar = new MusicBand("Manowar",1980);
        MusicBand Rammstein = new MusicBand("Rammstein",1994);
        MusicBand duranDuran = new MusicBand("DuranDuran",1978);
        MusicBand imperialAge = new MusicBand("IMPERIAL AGE",2012);
        MusicBand babyMetal = new MusicBand("BABYMETAL",2010);
        MusicBand empireOfTheSun = new MusicBand("Empire Of The Sun",2007);
        MusicBand knife = new MusicBand("THE Knife",1999);
        MusicBand arcticMonkeys = new MusicBand("Arctic Monkeys,",2002);
        MusicBand myChemicalRomance = new MusicBand("My Chemical Romance",2001);
        MusicBand twenty_one_pilots = new MusicBand("Twenty One Pilots",2009);

        abba.addMember("a1");
        abba.addMember("a2");
        abba.addMember("a3");
        abba.addMember("a4");
        kiss.addMember("k1");
        kiss.addMember("k2");
        kiss.addMember("k3");
        kiss.addMember("k4");

        abba.printMembers();
        kiss.printMembers();


        kiss.transferMembers(kiss, abba);

        System.out.println(abba.getMembers());
        System.out.println(kiss.getMembers());

        abba.transferMembers(abba, kiss);

        abba.printMembers();
        kiss.printMembers();







    }
}
