package Basic.Syntax;

import java.util.Scanner;

public class ConvertMtToKm {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    double meters = Double.parseDouble(scanner.nextLine());
    double kilometers = Math.round(meters / 1000.0 * 100) / 100.0;

    System.out.printf("%.2f", kilometers);
}
}
