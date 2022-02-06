package day12.task5;

public class Task5 {
    public static void main(String[] args) {

        MusicBand abba = new MusicBand("ABBA",1972);
        MusicBand kiss = new MusicBand("KISS",1973);
//        MusicBand manoWar = new MusicBand("Manowar",1980);
//        MusicBand Rammstein = new MusicBand("Rammstein",1994);
//        MusicBand duranDuran = new MusicBand("DuranDuran",1978);
//        MusicBand imperialAge = new MusicBand("IMPERIAL AGE",2012);
//        MusicBand babyMetal = new MusicBand("BABYMETAL",2010);
//        MusicBand empireOfTheSun = new MusicBand("Empire Of The Sun",2007);
//        MusicBand knife = new MusicBand("THE Knife",1999);
//        MusicBand arcticMonkeys = new MusicBand("Arctic Monkeys,",2002);
//        MusicBand myChemicalRomance = new MusicBand("My Chemical Romance",2001);
//        MusicBand twenty_one_pilots = new MusicBand("Twenty One Pilots",2009);

        abba.addMember(new MusicArtist("a1", 24 ));
        abba.addMember(new MusicArtist("a2", 41 ));
        abba.addMember(new MusicArtist("a3", 29 ));
        abba.addMember(new MusicArtist("a4", 28 ));
        kiss.addMember(new MusicArtist("k1", 21 ));
        kiss.addMember(new MusicArtist("k2", 45 ));
        kiss.addMember(new MusicArtist("k3", 34 ));
        kiss.addMember(new MusicArtist("k4", 37 ));

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
