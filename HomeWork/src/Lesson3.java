/* Сделал Vladislav Torgashev
15.02.2022
 */

public class Lesson3 {
    public static void main(String[] args) {
        System.out.println("\nTask1");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        Task1(arr);
        System.out.println("\nTask2");
        Task2(100);
        System.out.println("\nTask3");
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Task3(arr2);
        System.out.println("\nTask4");
        int[][] arr3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Task4(arr3);
        System.out.println("\nTask5");
        Task5(6,2);
    }

    static void Task1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] > 0) ? 0 : 1;
            System.out.print(arr[i] + " ");
        }
    }

    static void Task2(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
                System.out.print(arr[i] + " ");

        }
    }
    static void Task3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    static void Task4(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void Task5(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
}









