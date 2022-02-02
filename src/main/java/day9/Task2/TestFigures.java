package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));

    }
/*Первый метод, принимая на вход массив геометрических фигур, должен вернуть сумму периметров красных фигур.
Второй метод, принимая на вход массив геометрических фигур, должен вернуть сумму площадей красных фигур.
Вызовите эти два метода на массиве figures и выведите результат в консоль.*/

    public static double calculateRedPerimeter(Figure[] figures){
        double sumRedPerimeters=0;
        for (Figure z:figures) {
            if (z.getColor()=="Red"){
                sumRedPerimeters=sumRedPerimeters+z.perimeter();
            }
        }
        return sumRedPerimeters;
    }
    public static double calculateRedArea(Figure[] figures){
        double sumRedAreas=0;
        for (Figure z:figures) {
            if (z.getColor()=="Red"){
                sumRedAreas=sumRedAreas+z.area();
            }
        }
        return sumRedAreas;
    }

}
