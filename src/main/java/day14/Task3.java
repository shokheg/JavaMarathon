package day14;

import java.io.File;

import static day14.Person.parseFileToObjList;

public class Task3 {
    public static void main(String[] args) {
        File file=new File("E:\\JavaMarathon2021\\people.txt");
        System.out.println(parseFileToObjList(file));

    }
}

