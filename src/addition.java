import java.util.Scanner;

public class addition {
    static float myAddition(){
        Scanner myScanner = new Scanner(System.in);
        //
        System.out.println("Place 1st Number: ");
        float num1 = myScanner.nextFloat();
        //
        System.out.println("Place 2nd Number: ");
        float num2 = myScanner.nextFloat();

        float sum = num1+num2;

        return sum;
    }
}
