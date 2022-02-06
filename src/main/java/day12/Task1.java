package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> carsList = new ArrayList<String>();
        carsList.add("Lada");
        carsList.add("BMW");
        carsList.add("AUDI");
        carsList.add("ZUK");
        carsList.add("VW");

        System.out.println(carsList);

        carsList.add(2,"KAMAZ");
        carsList.remove(0);
        System.out.println(carsList);



    }
}
