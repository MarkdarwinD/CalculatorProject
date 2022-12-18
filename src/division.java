import java.util.Scanner;

public class division {
    static float myDivision(){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Place 1st Number: ");
        float num1 = myScanner.nextFloat();

        System.out.println("Place 2nd Number: ");
        float num2 = myScanner.nextFloat();

        if(num1 < num2){
            System.out.println("Can`t Divide");
        }

        float sum = num1/num2;

        return sum;
    }
}
