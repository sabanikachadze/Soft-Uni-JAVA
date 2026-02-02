package Basic.Syntax;

import java.util.Scanner;

public class PrintOddNumbers {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int oddNum = 1;
    int sum = 0;

    for(int i = 0; i < n ; i++){

        System.out.println(oddNum);
        sum += oddNum;
        oddNum += 2;
    }
    System.out.printf("Sum: %d",sum);
    }
}
