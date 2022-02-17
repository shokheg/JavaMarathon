package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 * Для квадрата, введенного пользователем, вам необходимо, используя сформированный объект HashMap<Integer, Point>,
 * определить, какие машины попали внутрь этого квадрата. Вам необходимо вывести в консоль идентификаторы машин,
 * которые находятся внутри квадрата и общее количество машин в квадрате.
 * Машины, лежащие на грани квадрата, не учитываются.
 * Алгоритм должен работать для любого корректно введенного квадрата.
 */
public class Task2 {
    public static void main(String[] args) {

        String path = "E:\\JavaMarathon2021\\src\\main\\resources\\taxi_cars.txt";
        HashMap<Integer, Point> taxiInArea = new HashMap<>();
        addFileToHashMap(taxiInArea, path);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты x1 y1 левой верхней точки: ");
        Point point1 = new Point(scanner.nextInt(), scanner.nextInt());
        System.out.println("Введите координату x2 y2 правой нижней точки: ");
        Point point2 = new Point(scanner.nextInt(), scanner.nextInt());

        isInArea(taxiInArea, point1, point2);









//        for(Map.Entry<Integer, Point> entry: taxiInArea.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }


    }

    static void addFileToHashMap (Map<Integer, Point> taxiCoordinates, String path){

        File file = new File(path);
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Неправильный или пустой входной файл");
        }

//        while (scanner.hasNext()){
//            System.out.println(scanner.nextLine());
//        }
        for (int i = 0; scanner.hasNext(); i++) {
        String[] taxiCoordsArray = scanner.nextLine().split(" ");
            for (int j = 0; j < taxiCoordsArray.length; j++) {
                taxiCoordinates.put(Integer.parseInt(taxiCoordsArray[0]), new Point(Integer.parseInt(taxiCoordsArray[1]),Integer.parseInt(taxiCoordsArray[2])));
            }
        }
    }

    static void isInArea (Map<Integer, Point> taxiCoordinates, Point point1, Point point2){
        //Вам необходимо вывести в консоль идентификаторы машин,
        // которые находятся внутри квадрата и общее количество машин в квадрате.
        int count = 0;
        for (Map.Entry<Integer, Point> entry: taxiCoordinates.entrySet()) {
                Point point = entry.getValue();
                if((point1.getX()<point.getX() && point.getX()<point2.getX()) && (point1.getY()>point.getY() && point.getY()>point2.getY())  ){
                    System.out.println("Такси в заданной области. ID такси: " + entry.getKey());
                    count++;
                }
        }
        System.out.println("Общее количество машин в квадрате: " + count);

    }


}

