package task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        String choice = scanner.next();

        switch (choice) {
            case "1":
                System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - карат");
                String choiceWeight = scanner.next();
                System.out.println("Введите количество выбранных единиц");
                double countWeight = scanner.nextInt();
                switch (choiceWeight) {
                    case "1":
                        System.out.println("Килограммы: " + countWeight);
                        System.out.println("Фунты: " + countWeight * 2.2046);
                        System.out.println("Караты: " + countWeight * 5000);
                        break;
                    case "2":
                        System.out.println("Килограммы: " + countWeight * 0.453592);
                        System.out.println("Фунты: " + countWeight);
                        System.out.println("Караты: " + countWeight * 2267.96);
                        break;
                    case "3":
                        System.out.println("Килограммы: " + countWeight * 0.0002);
                        System.out.println("Фунты: " + countWeight * 0.0004409245);
                        System.out.println("Караты: " + countWeight);
                        break;
                    default:
                        System.out.println("Передано неверное значение");
                }
                break;
            case "2":
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                String choiceDistance = scanner.next();
                System.out.println("Введите количество выбранных единиц");
                double count = scanner.nextInt();
                switch (choiceDistance) {
                    case "1":
                        System.out.println("Метры: " + count);
                        System.out.println("Мили: " + count * 0.000621371);
                        System.out.println("Ярды: " + count * 1.0936);
                        System.out.println("Футы: " + count * 3.281);
                        break;
                    case "2":
                        System.out.println("Метры: " + count * 1609.34);
                        System.out.println("Мили: " + count);
                        System.out.println("Ярды: " + count * 1760);
                        System.out.println("Футы: " + count * 5280);
                        break;
                    case "3":
                        System.out.println("Метры: " + count * 0.9144);
                        System.out.println("Мили: " + count * 0.000568182);
                        System.out.println("Ярды: " + count);
                        System.out.println("Футы: " + count * 3);
                        break;
                    case "4":
                        System.out.println("Метры: " + count * 0.3048);
                        System.out.println("Мили: " + count * 0.0000189394);
                        System.out.println("Ярды: " + count);
                        System.out.println("Футы: " + count * 0.333333);
                        break;
                    default:
                        System.out.println("Передано неверное значение");
                }
                break;
            default:
                System.out.println("Передано неверное значение");
                break;
        }

    }
}
