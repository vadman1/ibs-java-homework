package task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        double[] arr = new double[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextDouble();
        }

        double x = 17;
        double y = 83;
        double z = 15.5;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x || arr[i] == y || arr[i] == z) {
                System.out.println("Данное значение имеется в константах");
                return;
            }
        }
    }
}
