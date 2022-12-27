import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello Java!");

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Pick Between Operation:");
        System.out.println("1. Addition ");
        System.out.println("2. Multiplication ");
        System.out.println("3. Subtraction ");
        System.out.println("4. Division ");
        System.out.println("5. Exit");


        System.out.println("What Operation: ");
        int num1 = myScanner.nextInt();


        switch (num1){
            case 1:
                System.out.println("Addition");
                System.out.println((float)addition.myAddition());
                break;
            case 2:
                System.out.println("Multiplication");
                System.out.println((float) multiplication.myMultiplication());
                break;
            case 3:
                System.out.println("Subtraction");
                System.out.println((float) subtraction.mySubtraction());
                break;
            case 4:
                System.out.println("Division");
                System.out.println((float)division.myDivision());
                break;
            case 5:
                break;
            default:
                System.out.println("You didn`t pick the right number try again");
                break;
        }
    }
}