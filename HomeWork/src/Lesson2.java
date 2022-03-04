public class Lesson2 {
    public static void main (String [] args){
        System.out.println(checksum(7, 11));
        integer(10);
        System.out.println(integer2(-2));
        task4("HellWorld", 3);
        System.out.println(StellarTask(2022));

    }

    //Task1
    static boolean checksum(int a, int b){
        int sum = a + b;
        return (sum >= 10 && sum <=20);

    }

    //Task2
    public static void integer(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отприцательное");
        }
    }

    //Task3
    static boolean integer2(int a){
        return a <= 0;
    }

    //Task4
    static void task4(String str, int n){
        for (int i = 1; i <= n; i++){
            System.out.println("" + str);
        }
    }

    //Task5*
    static boolean StellarTask(int year){
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
}
