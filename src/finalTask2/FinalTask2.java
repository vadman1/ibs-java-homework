package finalTask2;

import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] strToArr = str.toCharArray();
        int answer;

        if (strToArr[0] == 'x') {
            if (strToArr[1] == '+') {
                answer = strToArr[4] - strToArr[2];
            } else {
                answer = strToArr[4] + strToArr[2];
            }
        } else if (strToArr[2] == 'x') {
            if(strToArr[1] == '+'){
                answer = strToArr[4] - strToArr[0];
            } else {
                answer = strToArr[0] - strToArr[4];
            }
        } else {
            if(strToArr[1] == 'x') {
                answer = strToArr[0] + strToArr[2];
            } else {
                answer = strToArr[0] - strToArr[2];
            }
        }

        System.out.println("Вывод: " + answer);
    }
}
