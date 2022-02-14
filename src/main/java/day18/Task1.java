package day18;

public class Task1 {

    private static int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};

    public static void main(String[] args) {

        System.out.println(recursionSum(0,numbers));
    }

    public static long recursionSum(int i, int[] array) {
        if (i==(array.length-1))
            return array[i];
        return array[i] + recursionSum(i+1,array);
    }
    }


