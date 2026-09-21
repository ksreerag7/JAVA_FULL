// Computes the sum of all digits of an integer (handles negatives with Math.abs).
// Concept: Math.abs(), digit extraction using modulo and integer division.
import java.util.Scanner;

public class pgm12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num  = sc.nextInt(),num2=num, dig, sum=0;
        num = Math.abs(num);
        while(num>0){
            dig = num%10;
            sum+=dig;
            num/=10;
        }
        System.out.println("The sum of digits in "+num2+" is "+sum);
    }
}
