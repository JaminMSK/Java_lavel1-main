/* Сделал Vladislav Torgashev
21.02.2022
 */

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static int SIZE = 5;

    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] table;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        initMap();
        printTable();
        while (true) {
            humanTurn();
            printTable();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isTableFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printTable();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isTableFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
    static boolean checkWin(char symb) {
        if(table[0][0] == symb && table[0][1] == symb && table[0][2] == symb && table[0][3] == symb && table[0][4] == symb) return true;
        if(table[1][0] == symb && table[1][1] == symb && table[1][2] == symb && table[1][3] == symb && table[1][4] == symb) return true;
        if (table[2][0] == symb && table[2][1] == symb && table[2][2] == symb && table[2][3] == symb && table[2][4] == symb) return true;
        if (table[3][0] == symb && table[3][1] == symb && table[3][2] == symb && table[3][3] == symb && table[3][4] == symb) return true;
        if (table[4][0] == symb && table[4][1] == symb && table[4][2] == symb && table[4][3] == symb && table[4][4] == symb) return true;
        if (table[0][0] == symb && table[1][1] == symb && table[2][2] == symb && table[3][3] == symb && table[4][4] == symb) return true;
        if (table[0][0] == symb && table[1][0] == symb && table[2][0] == symb && table[3][0] == symb && table[4][0] == symb) return true;
        if (table[0][1] == symb && table[1][1] == symb && table[2][1] == symb && table[3][1] == symb && table[4][1] == symb) return true;
        if (table[0][2] == symb && table[1][2] == symb && table[2][2] == symb && table[3][2] == symb && table[4][2] == symb) return true;
        if (table[0][3] == symb && table[1][3] == symb && table[2][3] == symb && table[3][3] == symb && table[4][3] == symb) return true;
        if (table[0][4] == symb && table[1][4] == symb && table[2][4] == symb && table[3][4] == symb && table[4][4] == symb) return true;
        return false;
    }
    static boolean isTableFull() {
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                if (table[y][x] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        table[y][x] = DOT_O;
    }
     static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X -диаг. Y-вертик.");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
         table[y][x] = DOT_X;
    }
     static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (table[y][x] == DOT_EMPTY) return true;
        return false;
    }
     static void initMap() {
         table = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                table[i][j] = DOT_EMPTY;
            }
        }
    }
     static void printTable() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
