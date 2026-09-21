// Prints the multiplication table (1–10) for a number entered by the user.
// Concept: for loop, formatted output.
import java.util.Scanner;
public class pgm6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("----------MULTIPLICATION TABLE FOR "+num+"-------------");
        for(int i = 1;i<=10;i++){
            System.out.println(num +  " * " + i + " = " + num*i);
        }
        sc.close();
    }

    
}
