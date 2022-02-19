package task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextInt();
        double num2 = scanner.nextInt();
        double num3 = scanner.nextInt();

        double average = (num1 + num2 + num3)/3;
        System.out.println(average);

        double averageDividedBy2RoundedFloor = Math.floor(average/2);

        if(averageDividedBy2RoundedFloor > 3){
            System.out.println("Программа выполнена корректно");
        }
    }
}
