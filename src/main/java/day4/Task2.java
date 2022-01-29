package day4;

//2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//Затем, используя цикл for each вывести в консоль:
//наибольший элемент массива
//наименьший элемент массива
//количество элементов массива, оканчивающихся на 0
//сумму элементов массива, оканчивающихся на 0
//
//Использовать сортировку запрещено.

import java.util.Arrays;
import java.util.Random;


public class Task2 {
    public static void main(String[] args) {

        Random rand = new Random();
        int [] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }

        int max = array[0];     //find array max
        for (int x:array) {
            if (max < x){
                max = x;
            }

        }

        int min = array[0];     //find array min
        for (int x:array) {
            if (x < min){
            min = x;
            }

        }

        int countOfZeroEnding = 0;
        int sum = 0;
        for (int x:array            //numbers ending in 0
        ) { if (x%10 == 0){
            countOfZeroEnding++;
            sum = sum + x;}

        }

        System.out.println(Arrays.toString(array));

        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + countOfZeroEnding);
        System.out.println("Cумма элементов массива, оканчивающихся на 0:" + sum );






    }
}
