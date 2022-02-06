package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(new MusicBand("ABBA",1972));
        musicBands.add(new MusicBand("KISS",1973));
        musicBands.add(new MusicBand("Manowar",1980));
        musicBands.add(new MusicBand("Rammstein",1994));
        musicBands.add(new MusicBand("DuranDuran",1978));
        musicBands.add(new MusicBand("IMPERIAL AGE",2012));
        musicBands.add(new MusicBand("BABYMETAL",2010));
        musicBands.add(new MusicBand("Empire Of The Sun",2007));
        musicBands.add(new MusicBand("THE Knife",1999));
        musicBands.add(new MusicBand("Arctic Monkeys,",2002));
        musicBands.add(new MusicBand("My Chemical Romance",2001));
        musicBands.add(new MusicBand("Twenty One Pilots",2009));

        Collections.shuffle(musicBands);

        System.out.println(musicBands);

        System.out.println(groupsAfter2000(musicBands));



    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
       List<MusicBand> groupAfter2000List = new ArrayList<>();
        for (MusicBand z: bands) {
            if(z.getYear()>2000){
                groupAfter2000List.add(z);
            }

        }
        return groupAfter2000List;


    }
}
