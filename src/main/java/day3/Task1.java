package day3;
//Реализовать, используя следующие данные:
//Москва, Владивосток, Ростов - Россия
//Рим, Милан, Турин - Италия
//Ливерпуль, Манчестер, Лондон - Англия
//Берлин, Мюнхен, Кёльн - Германия
//
//При вводе любого другого города, вывести сообщение “Неизвестная страна”.


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
    while (!city.equals("stop")){

        switch (city){
            case "Москва":
            case "Владивосток":
            case "Ростов":
                System.out.println("Россия");
                break;
            case "Рим":
            case "Милан":
            case "Турин":
                System.out.println("Италия");
                break;
            case "Ливерпуль":
            case "Манчестер":
            case "Лондон":
                System.out.println("Англия");
                break;
            case "Берлин":
            case "Мюнхен":
            case "Кёльн":
                System.out.println("Германия");
                break;
            default:
                System.out.println("Неизвестная страна");

    } city = scanner.nextLine();

    }
}}
