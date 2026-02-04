package Basic.Syntax;

import java.util.Scanner;

public class printTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            printForm(scanner.nextInt());
        }
    }

    static void printForm(int size) {
        for (int i = 1; i <= size; i++) {
            printLine(i);
        }

        for (int i = size - 1; i >= 1; i--) {
            printLine( i);
        }
    }

    static void printLine(int end) {
        for (int i = 1; i <= end; i++) {
            System.out.print(i + (i == end ? "" : " "));
        }
        System.out.println();
    }
}
