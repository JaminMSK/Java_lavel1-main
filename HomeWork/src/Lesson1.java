public class Lesson1 {
    public static void main (String [] args){
        printThreeWords();
        boolean result = checkSumSign(5,10);
        System.out.println(result? "Сумма положительная" : "Сумма отрицательная");
        System.out.println(checkSumSign(-5,-10)? "Сумма положительная" : "Сумма отрицательная");
        System.out.println(checkSumSign(-5,10)? "Сумма положительная" : "Сумма отрицательная");
        System.out.println(checkSumSign(5,-10)? "Сумма положительная" : "Сумма отрицательная");
        printColor();
        compareNumbers();

        }
        //task2
        static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }
        //task3
        static boolean checkSumSign(int a, int b) {
            return a + b >= 0;
        }
        //task4
        static void printColor() {
            int value = 77;
            if (value <= 0) {
                System.out.println ("Красный");
            } else if (value > 0 & value <= 100){
                System.out.println("Желтый");
            } else  {
                System.out.println("Зеленый");
            }
        }
        //task5
        static void compareNumbers(){
            int a = 5, b = 7;
            if (a >= b) {
                System.out.println("a >= b");
            }else {
                System.out.println("a < b");
            }
        }
}
