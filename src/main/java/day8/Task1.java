package day8;

/*1. Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна строка, полученная конкатенацией (“склеиванием”)
чисел из диапазона через пробел (0 + “ “ + 1 + “ “ + 2 + … + 20000).
После создания такой строки, вызов System.out.println() на этой строке должен вывести в консоль сразу все числа из диапазона:
0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000

Для того, чтобы почувствовать разницу в производительности между конкатенацией обычных строк (класс String) и использовании StringBuilder,
реализуйте описанную задачу этими двумя способами, замеряя время работы программы.
*/


public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        /*String numbers = new String();


            for (Integer i=0; i<=20000; i++){
                numbers = numbers+i+" ";

            }
        System.out.println(numbers);*/

        long startTime = System.currentTimeMillis(); //сохраняем время перед запуском блока кода

        for (int i=0; i<=20000; i++){
            sb.append(i);
            sb.append(" ");
        }
        System.out.println(sb);

        long stopTime = System.currentTimeMillis(); //сохраняем время после того, как код отработал - 12 мс у СБ против 282 мс у стринга
        System.out.println("Длительность работы, в мс.:" + (stopTime - startTime));




    }




    }

