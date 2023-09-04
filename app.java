import java.util.Scanner;

public class app {

    public static void main (String[] args) {
        Scanner newScanner = new Scanner(System.in);

        int num1 = 10;
        int num2 = 3;

        int sum = num1 + num2;

        int subtract = num1 - num2;

        System.out.println("The sum of num2 och num2 is: " + sum);
        System.out.println();

        System.out.println("The subtraction of num1 and num2: " + subtract);
        System.out.println();

        int product = num1 * num2;
        int quota = num1 / num2;

        System.out.println("The product of num1 and num2 is: " + product);
        System.out.println();

        System.out.println("The quota of num1/num2 is: " + quota);
        System.out.println();

        int remainder1 = 10%3;
        int remainder2 = 173%2;

        System.out.println("The remainder of 10 % 3 is = " + remainder1);
        System.out.println();
        System.out.println("The remainder of 173 % 2 is = " + remainder2);
        System.out.println();

        double decimalNumOne = 5.3;
        double decimalNumTwo = 44.4;

        double addDecimal = decimalNumOne  + decimalNumTwo;
        double subtractDecimal = decimalNumOne  - decimalNumTwo;

        System.out.println("The sum of decimalOne and decimalTwo is: " + addDecimal);

        System.out.println();
        System.out.println("The subtraction of decimalOne and decimalTwo is: " + subtractDecimal);
        System.out.println();

        double multiplyDecimal = decimalNumOne  + decimalNumTwo;
        double divideDecimal = decimalNumOne  + decimalNumTwo;
    

        System.out.println("The division of decimalNumOne and decimalNumTwo is: " + divideDecimal);
        System.out.println();
        System.out.println("The multiplication of decimalNumOne and decimalNumTwo is:" + multiplyDecimal);


        




 



    }
}