package finalTask4;

import java.util.Scanner;

public class FinalTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Загадка:");
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");

        int numberOfAttempt = 3;
        boolean needHelp = false;

        while (numberOfAttempt >= 0) {
            numberOfAttempt--;
            String answer = scanner.nextLine();
            if (answer.equals("Заархивированный вирус")) {
                System.out.println("Правильно!");
                break;
            } else if (answer.equals("Подсказка")) {
                if (numberOfAttempt == 2 && needHelp == false) {
                    System.out.println("Ответ состоит из 2 слов");
                    needHelp = true;
                } else {
                    System.out.println("Подсказка уже недоступна");
                }
                numberOfAttempt--;
                continue;
            }
            if (numberOfAttempt == 0 || needHelp) {
                System.out.println("Обидно, приходи в другой раз");
                break;
            }
            System.out.println("Подумай еще!");
        }
    }
}