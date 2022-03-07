package finalTask1;

import java.util.Scanner;

public class finalTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара:");
        double exchangeRate = scanner.nextDouble();

        System.out.println("Введите количество рублей:");
        double countRub = scanner.nextDouble();

        System.out.printf("Итого: %.2f долларов", countRub / exchangeRate);
    }
}
