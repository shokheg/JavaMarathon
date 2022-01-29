package day4;

//1. С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить
// его случайными числами от 0 до 10 (не включительно). Используя цикл for each вывести содержимое массива в консоль,
// а также вывести в консоль информацию о:
//а) Длине массива
//б) Количестве чисел больше 8
//в) Количестве чисел равных 1
//г) Количестве четных чисел
//д) Количестве нечетных чисел
//е) Сумме всех элементов массива
//
//Пример:
//Введено число 10. Сгенерирован следующий массив:
//[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
//
//Информация о массиве:
//Длина массива: 10
//Количество чисел больше 8: 1
//Количество чисел равных 1: 0
//Количество четных чисел: 6
//Количество нечетных чисел: 4
//Сумма всех элементов массива: 46

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int n = scanner.nextInt();
        int count8 = 0;
        int count1 = 0;
        int countEven = 0; //четный счетчик
        int countOdd = 0; //нечетный счетчик
        int sum = 0;

        int [] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }

        for (int x:array) {
            if (x > 8)
                 count8++;
        }

        for (int x:array){
            if (x==1) count1++;
        }

        for (int x:array){
            if (x % 2 ==0){
                countEven++;
            }
        }
        for (int x:array){
            if (x % 2 != 0){
                countOdd++;
            }
        }
        for (int x:array){
            sum +=x;
        }




        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количестве чисел больше 8: " + count8);
        System.out.println("Количестве чисел равных 1: " + count1);
        System.out.println("Количестве четных чисел: " + countEven);
        System.out.println("Количестве нечетных чисел: " + countOdd);
        System.out.println("Сумме всех элементов массива: " + sum);


    }
}
