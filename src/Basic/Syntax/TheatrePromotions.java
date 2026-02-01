package Basic.Syntax;

import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = scanner.nextInt();


        if(0 > age || age > 122){
            System.out.println("Error!");
            return;
        }

        switch(typeOfDay){
            case "Weekday": Weekday(age);   break;
            case "Weekend": Weekend(age);   break;
            case "Holiday": Holiday(age);    break;
        }
    }

    public static void Weekday(int integer) {
    if(integer >= 0 && integer <= 18){
        System.out.println("12$");
    }else if(integer >  18 && integer <= 64){
        System.out.println("18$");
    }else{
        System.out.println("12$");
    }
}
    public static void Weekend(int integer) {
    if(integer >= 0 && integer <= 18){
        System.out.println("15$");
    }else if(integer >  18 && integer <= 64){
        System.out.println("20$");
    }else{
        System.out.println("15$");
    }
}
    public static void Holiday(int integer) {
    if(integer >= 0 && integer <= 18){
        System.out.println("5$");
    }else if(integer >  18 && integer <= 64){
        System.out.println("12$");
    }else{
        System.out.println("10$");
    }
}

}
