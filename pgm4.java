// Finds the largest of three numbers entered by the user.
// Concept: Nested if/else conditions to compare multiple values.
import java.util.Scanner;
public class pgm4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("\nEnter second number: ");
        int num2 = sc.nextInt();
        System.out.print("\nEnter third number: ");
        int num3 = sc.nextInt();

        if(num1>num2){
            if(num1>num3){
                System.out.println("\nThe largest number is "+num1);
            }
            else{
                System.out.println("\nThe largest number is "+num3);
            }
        }
        else{
        if(num2>num3){
            System.out.println("\nThe largest number is "+num2);
        }
        else{
            System.out.println("\nThe largest number is "+num3);
        }
    }
    }
}
