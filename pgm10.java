// Computes the factorial of a number entered by the user.
// Concept: while loop with a running product (iterative factorial).
import java.util.Scanner;

public class pgm10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int facto =1;
        while(num>0){
            facto=facto*num;
            num-=1;
        }
        System.out.println(facto);
    }

}
