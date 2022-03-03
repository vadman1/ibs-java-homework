package task9;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива");

        int size = scanner.nextInt();
        double[] arr = new double[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum / arr.length;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] * average);
        }
    }
}
