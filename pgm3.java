// Reads a number and prints whether it is positive, negative, or zero.
// Concept: Scanner input, if/else-if/else chain for multi-branch decision.
import java.util.Scanner;

public class pgm3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();

        if(num < 0){
            System.out.println(num + " is negative.");
        }

        else if(num == 0){
            System.out.println(num+ " is zero.");
        }

        else{
            System.out.println(num + " is positive");
        }
    }
}

