package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file=new File("E:\\JavaMarathon2021\\numbers.txt");
        printResult(file);

    }


    static void printResult (File file){
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersAsString = line.split(" ");

           if (numbersAsString.length==0){
               throw new IllegalArgumentException();
          }

            Double averageNum = 0.0;
            int count = 0;
            for (String number:numbersAsString) {
                averageNum+=Double.parseDouble(number);
                count++;
            }

            String s2 = String.format(Locale.ROOT, "%.3f",(averageNum/count));  //локаль для вывода точки вместо запятой в десятичном разделителе

            System.out.println((averageNum/count) + " --> " + s2);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e){
            System.out.println("Некорректный или пустой входной файл");
        }

    }
}

