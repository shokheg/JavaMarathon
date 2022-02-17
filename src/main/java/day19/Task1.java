package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {

       String path = "E:\\JavaMarathon2021\\src\\main\\resources\\dushi.txt";
       Map<Integer,String> dushi = new HashMap<>();
       addFileToHashMap(dushi,path);
       countTopOneHundredDuplicates(dushi);
    }

    static void addFileToHashMap (Map<Integer, String> map, String path){

        File file = new File(path);
        Scanner scanner = null;

        try {

            scanner = new Scanner(file);

        } catch (FileNotFoundException e) {

            System.out.println("Неправильный или пустой входной файл");

        }

        scanner.useDelimiter("[.,:;()?!\"\\s–]+");  //добавил символы кавычек, !!!ДОБАВИТЬ ТРОЕТОЧИЕ«“„»<>

//        while (scanner.hasNext()){
//            System.out.println(scanner.next());
//        }

        for (int i = 0; scanner.hasNext(); i++) {
            map.put(i, scanner.next());
        }

    }

    static void countTopOneHundredDuplicates(Map<Integer, String> map){

        Map<String,Integer> notSortedMap = new HashMap<>();
        for(Map.Entry<Integer, String> entry: map.entrySet()){
            if (!notSortedMap.containsKey(entry.getValue())){
                notSortedMap.put(entry.getValue(), 1);
            } else {
                int x = notSortedMap.get(entry.getValue());
                notSortedMap.put(entry.getValue(), x+1);
            }
            }



        ArrayList<Integer> listOfValues = new ArrayList<>(notSortedMap.values());
        String temp = null;
        listOfValues.sort(Comparator.reverseOrder());

        for (int i = 0; i < 100; i++) {
             listOfValues.get(i);
            for (Map.Entry<String, Integer> entry: notSortedMap.entrySet()) {

                if (Objects.equals(listOfValues.get(i), entry.getValue())) {
                   temp = entry.getKey();
                }
            }
          System.out.println(listOfValues.get(i) + " " + temp);
        }

//        for(Map.Entry<String, Integer> entry: countTopOneHundredDuplicates(dushi).entrySet()){    // Чичиков - 120
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }


    }


}
