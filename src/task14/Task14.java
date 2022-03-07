package task14;

public class Task14 {
    public static void main(String[] args) {
        int[] arr = new int[15];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * (40 + 1)) - 20);
        }

        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println(max);
        System.out.println(min);

        System.out.println("Наибольшее значение по модулю из минимального и максимального числа:");
        if(Math.abs(max) > Math.abs(min)) {
            System.out.println(max);
        } else {
            System.out.println(min);
        }
    }
}
