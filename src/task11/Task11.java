package task11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        String num1 = scanner.next();
        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();

        System.out.println("Большее число:");
        if(Integer.parseInt(num1) > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }

        System.out.println("Меньшее число:");
        if(Integer.parseInt(num1) < num2) {
            System.out.println(Double.parseDouble(num1));
        } else {
            System.out.println((double) num2);
        }
    }
}
