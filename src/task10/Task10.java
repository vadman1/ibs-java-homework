package task10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк матрицы");
        int x = scanner.nextInt();
        System.out.println("Введите количество столбцов матрицы");
        int y = scanner.nextInt();


        double[][] arr = new double[x][y];

        System.out.println("Введите элементы матрицы");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < arr[0].length; i++) {
            System.out.println(arr[0][i] * 3);
        }
    }
}
