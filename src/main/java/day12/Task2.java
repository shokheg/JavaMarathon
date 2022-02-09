package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List <Integer> numList = new ArrayList<>();

        for (int i=0; i<350;i++){
            if ((i<=30||i>=300)&&i%2==0)
                numList.add(i);

        }


        System.out.println(numList);
    }
}
