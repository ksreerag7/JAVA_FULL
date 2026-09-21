// Checks whether a number is a palindrome (reads same forwards and backwards).
// Concept: Reverse-and-compare technique using digit extraction.
import java.util.Scanner;

public class pgm9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev=0;
        int num1=num;
        while(num>0){
            int dig = num%10;
            rev = rev*10+dig;
            num/=10;
        }
        System.out.println(num1==rev);

    }

}
