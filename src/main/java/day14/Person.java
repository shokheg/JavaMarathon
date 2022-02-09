package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    static List<Person> parseFileToObjList(File file) {

        List<Person> peoplesAsString = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] peoplesArray = line.split("\r");
                for (String peopleAndAge: peoplesArray) {
                    String[] sepArray = peopleAndAge.split(" ");
                    int age = Integer.parseInt(sepArray[1]);
                    peoplesAsString.add(new Person(sepArray[0], age));
                }


            }

            for (Person people : peoplesAsString) {
                if (people.age<0)
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
