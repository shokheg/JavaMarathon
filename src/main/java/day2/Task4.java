package day2;

//Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner, число x.
// Для этого числа, по формуле выше, необходимо вычислить значение y и вывести его в консоль, используя метод System.out.println().
//(Для этих вещественных чисел x и y необходимо использовать тип double и метод nextDouble()
// у Scanner’а соответственно, чтобы считать из консоли число x).

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        if (x >= 5){
            System.out.println(((x * x) - 10) / (x + 7) );
        } else if (x > -3 && x < 5) {
            System.out.println((x + 3) * ((x * x) - 2));
        } else if (x <= -3) {
            System.out.println(420.0);
        }

    }
}
