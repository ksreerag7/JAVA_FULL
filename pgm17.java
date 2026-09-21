// Computes GCD and LCM of two numbers using the Euclidean algorithm.
// Concept: Euclidean algorithm (repeated remainder), LCM = |a*b| / GCD.
import java.util.Scanner;

public class pgm17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt(), a=num1, b = num2, rem=0;

        while(b>0){
            rem = a%b;
            a = b;
            b = rem;

        }
        System.out.println(a); //gcd
        System.out.println(Math.abs(num1*num2)/a); //lcm

    }
}
