// Computes the sum of integers from 1 to N entered by the user.
// Concept: for loop with accumulator pattern.
import java.util.Scanner;
public class pgm5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n (limit): ");
        int n = sc.nextInt();
        int totalSum = 0;
        for(int i = 1; i<=n; i++){
            totalSum+=i;
        }
        System.out.println("The total required sum is: "+ totalSum);
    }
}