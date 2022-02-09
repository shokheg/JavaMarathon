package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException, IllegalArgumentException  {
        File file=new File("E:\\JavaMarathon2021\\numbers.txt");
        printSumDigits(file);
    }

    public static void printSumDigits (File file){

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersAsString = line.split(" ");
            if (numbersAsString.length!=10){
                throw new IllegalArgumentException();
            }
            Integer summOfNumbers = 0;
            for (String number:numbersAsString) {
                summOfNumbers+=Integer.parseInt(number);
            }
            System.out.println(summOfNumbers);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }

    }
}
