package task3;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int t = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = t;

        System.out.println(arr[0] + arr[arr.length/2]);
    }
}
