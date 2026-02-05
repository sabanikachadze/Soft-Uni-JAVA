package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Math.abs(scanner.nextInt());
         getMultipleOfEvensAndOdds(numbers);
    }

    static void getMultipleOfEvensAndOdds(int numbers){
        int wholeNumber = numbers;
        int even = 0;
        int odd = 0;

        while(wholeNumber > 0){
            int firstNum = wholeNumber % 10;
            if(firstNum % 2 == 0){
                even += firstNum;
            }else{
                odd += firstNum;
            }
            wholeNumber /= 10;
        }
        getSumOfDigits(odd , even);


    }
    static void getSumOfDigits(int odd, int even){
        System.out.println(odd*even);
    }

}