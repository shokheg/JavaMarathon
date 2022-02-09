package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file=new File("E:\\JavaMarathon2021\\people.txt");
        System.out.println(parseFileToString(file));

    }

    static List<String> parseFileToString(File file) {

        List<String> peoplesAsString = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                String[] peoplesArray = line.split("\r");
                peoplesAsString.addAll(List.of(peoplesArray));
            }

            for (String people : peoplesAsString) {
                if (people.contains("-"))
                    throw new IllegalArgumentException();
            }


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return null;
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
            return null;
        }
        return peoplesAsString;

    }
}
