package day18;

public class Task2 {


    public static void main(String[] args) {


        System.out.println(count7(7745127107727L));
    }

    public static int count7(long i) {
        //System.out.println("Вызов метода при i = " + i);

        long res = i;
        if (i==0) return 0; //когда остаток от деления на 10 вернёт нам ноль (т.е. десятков больше нет), всплываем)

        if (res%10 == 7)
        {
          return 1+count7(res/10);
        }
        return count7(res/10);
    }
}
