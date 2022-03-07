package task13;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String str = scanner.nextLine();

        String[] result = str.split("\\s+");
        int count = 0;

        for (String word : result) {
            if (word.matches("^[a-zA-Z]+$")) {
                System.out.println(word);
                count++;
            }
        }

        System.out.println(count);
    }
}
