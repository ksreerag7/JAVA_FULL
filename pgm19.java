// Checks if a number is a perfect number (sum of proper divisors equals the number).
// Concept: Iterating divisors — sum all proper divisors (excluding the number itself).
import java.util.Scanner;

public class pgm19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){ sum += i; }
        }
        System.out.println(sum == num);
    }

}
