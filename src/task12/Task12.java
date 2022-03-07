package task12;

import java.util.Locale;

public class Task12 {
    public static void main(String[] args) {
        String str = "I like Java!!!";

        if (str.contains("Java")) {
            System.out.println("Строка содержит подстроку \"Java\"");
        }

        if (str.startsWith("I like")) {
            System.out.println("Строка начинается с подстроки \"I like\"");
        }

        if (str.endsWith("!!!")) {
            System.out.println("Строка заканчивается подстрокой \"!!!\"");
        }

        if (str.contains("Java") && str.startsWith("I like") && str.endsWith("!!!")) {
            System.out.println(str.toUpperCase(Locale.ROOT));
        }

        str = str.replaceAll("a", "o");
        System.out.println(str.substring(7, 11));
    }
}
