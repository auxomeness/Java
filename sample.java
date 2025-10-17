import java.util.Scanner;

public class sample {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (double) num1 / (double)num2;

        System.out.println("The sum of two numbers is: " + sum);
        System.out.println("The difference of two numbers is: " + difference);
        System.out.println("The product of two numbers is: " + product);
        System.out.printf("The quotient of two numbers is: %.3f\n", quotient);    
    }
}
