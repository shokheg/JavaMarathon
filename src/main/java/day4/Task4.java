package day4;

//4. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой выведите
// значение суммы и индекс первого элемента тройки.
//
//Пример:
//*Для простоты пример показан на массиве размера 10
//
//[1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]
//
//Тройка с максимальной суммой: [8742, 1040, 3254]
//
//Вывод в консоль:
//13036
//7

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] array = new int[100];

        for (int i=0; i<array.length; i++){
            array[i]=rand.nextInt(10000);
        }

        int maxSum = 0;
        int count = 0;
        for (int i=1; i<array.length-1; i++){
            int sumThree = array[i-1] + array[i] + array[i+1];
            if (sumThree > maxSum){
                maxSum = sumThree;
                count = i-1;
            }

        }
        System.out.println(maxSum);
        System.out.println(count);



    }



}
