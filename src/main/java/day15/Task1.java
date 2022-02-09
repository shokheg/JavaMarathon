package day15;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("E:\\JavaMarathon2021\\src\\main\\resources\\shoes.csv");
        parseCsvMissingShoes(file);
    }

    static void parseCsvMissingShoes(File file) {

        try {
            Scanner scanner = new Scanner(file);
            File outputFile = new File("E:\\JavaMarathon2021\\src\\main\\resources\\missing_shoes.txt");
            PrintWriter pw = new PrintWriter(outputFile);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] shoesStringArray = line.split("\r");


                for (String shoesInfo : shoesStringArray) {
                    String[] shoesInfoSeparateInfo = shoesInfo.split(";");

                    if ((shoesInfoSeparateInfo.length > 3) || (shoesInfoSeparateInfo.length == 0)) {
                        throw new IllegalArgumentException();
                    }

                    String shoesDescription = shoesInfoSeparateInfo[0];
                    int shoesSize = Integer.parseInt(shoesInfoSeparateInfo[1]);
                    int shoesQuantity = Integer.parseInt(shoesInfoSeparateInfo[2]);

                    if (shoesQuantity == 0) {
                        pw.println(shoesDescription + ", " + shoesSize + ", " + shoesQuantity);
                        System.out.println(shoesDescription + ", " + shoesSize + ", " + shoesQuantity);
                    }
                }


            }
            pw.close();


            /*Возникающие исключения обрабатывать (try-catch), а не пробрасывать в сигнатуре метода (throws).
Учтите ситуацию, когда в файле может быть содержимое отличное от ожидаемого.
В нашем случае файл один и он корректен, но гипотетически может быть подан пустой файл или кол-во столбцов отличаться от трех.
 */

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");

        }


    }
}
