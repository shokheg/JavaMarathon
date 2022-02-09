package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        CreateNewFile("file1");
        CreateNewFile("file2");
        addThousandRandomNumbersToFile1(new File("E:\\JavaMarathon2021\\file1.txt"));
        addNumbersToFile2(new File("E:\\JavaMarathon2021\\file1.txt"));
        printResult(new File("E:\\JavaMarathon2021\\file2.txt"));

    }

    static void addThousandRandomNumbersToFile1(File file) {
        Random random = new Random();

        try {
            PrintWriter pw = new PrintWriter(file);

            for (int i = 0; i < 1000; i++) {
                int z = random.nextInt(100);
                pw.print(z + " ");
            }

            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println("addThousandRandomNumbersToFile1. Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("addThousandRandomNumbersToFile1. Некорректный входной файл");
        }


    }
//Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из
// Файла 1 рассчитывается их среднее арифметическое. Затем, полученное значение записывается в Файл 2.
// Таким образом в Файле 2 будет находиться 50 вещественных чисел (1000 / 20 = 50).


    static void addNumbersToFile2(File file) {
        try {

            int count = 0;
            double averageTwenty = 0;

            Scanner scanner = new Scanner(file);
            File outputFile = new File("E:\\JavaMarathon2021\\file2.txt");
            PrintWriter pw = new PrintWriter(outputFile);


            while (scanner.hasNext()) {
                String line = scanner.next();
                String[] numbersStringArray = line.split("\r");

                for (String s : numbersStringArray) {
                    averageTwenty += Integer.parseInt(s);
                    count++;
                    if (count == 20) {

                        pw.print((averageTwenty / 20.0) + " ");
                        //System.out.println(averageTwenty/20.0);
                        count = 0;
                    }
                }
            }
            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println("addNumbersToFile2. Файл не найден");

        } catch (IllegalArgumentException e) {
            System.out.println("addNumbersToFile2. Некорректный входной файл");
            e.printStackTrace();

        }


    }
//статический метод printResult(File file).
// Этот метод должен рассчитать сумму всех вещественных чисел из Файла 2 и вывести её в консоль, отбросив вещественную часть.

    static void printResult(File file) {
        try {
            double sumAllNumsInFile2 = 0;
            double averageFile2 = 0;
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.next();
                String[] numbersStringArray = line.split("\r");

                for (String s : numbersStringArray) {
                    sumAllNumsInFile2 += Double.parseDouble(s);
                }
                averageFile2 = sumAllNumsInFile2 / numbersStringArray.length;
            }

            System.out.println((int)Math.ceil(averageFile2));


        } catch (FileNotFoundException e) {
            System.out.println("printResult. Файл не найден");

        } catch (IllegalArgumentException e) {
            System.out.println("printResult. Некорректный входной файл");
            e.printStackTrace();

        }


    }

    static void CreateNewFile(String filename) {
        try {
            File file = new File("E:\\JavaMarathon2021\\" + filename + ".txt");
            if (file.createNewFile()) {
                System.out.println("Мы создали новый файл: " + file.getName());
            } else {
                System.out.println("Файл уже создан до нас.");
            }
        } catch (IOException e) {
            System.out.println("Что-то пошло не так при создании файла.");
        }


    }
}
