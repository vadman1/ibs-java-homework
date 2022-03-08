package finalTask3;

import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int count = scanner.nextInt();

        System.out.println("Введите " + count + " строк");
        String[] arrStr = new String[count];
        for (int i = 0; i < count; i++) {
            arrStr[i] = scanner.next();
        }

        String[] arrSymb = new String[count];
        for (int i = 0; i < count; i++) {
            arrSymb[i] = "";
            for (char c : arrStr[i].toCharArray()) {
                if (arrSymb[i].indexOf(c) == -1)
                    arrSymb[i] += c;
            }
        }

        int longestLine = arrSymb[0].length();
        for (String str : arrSymb) {
            if (str.length() > longestLine)
                longestLine = str.length();
        }

        for (String str : arrStr) {
            if (str.length() == longestLine){
                System.out.println(str);
                break;
            }
        }
    }
}
