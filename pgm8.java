// Reverses the digits of an integer entered by the user.
// Concept: while loop, digit extraction using modulo and integer division.
import java.util.Scanner;

public class pgm8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = (num<0)?num*=-1:num;
        int rev=0;
        while(num>0){
            int dig = num%10;
            rev = rev*10+dig;
            num/=10;
        }
        System.out.println(rev);
        
    }
    
}
