// Checks if a number is even or odd, runs in an infinite loop until interrupted.
// Concept: Scanner input, while(true) loop, if/else conditional.
import java.util.Scanner;

public class pgm2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num%2==0) {
            System.out.println(num + " is even.");            
        }
        else{
            System.out.println(num + " is odd.");
        }
    }
}
}

