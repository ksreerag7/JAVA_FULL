// Checks whether a number is prime, composite, or neither (1 and negatives).
// Concept: Primality test using sqrt optimization (loop while i*i <= num).
import java.util.Scanner;

public class pgm15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(),i=2;
        boolean isPrime = true;
        if(num ==1){System.out.println("Neither prime nor composite");}
        else if(num<=0){System.out.println("Invalid input");}
        else{
        while(i*i<=num){
            if(num%i==0){System.out.println(num+" is composite"); isPrime = false;break;}
            i+=1;
        }
        if(isPrime){System.out.println(num + " is prime number");}
    }
    }
}
