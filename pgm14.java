// Counts how many times a specific digit appears in a number.
// Concept: Digit extraction, counter variable, edge-case handling (both zero).
import java.util.Scanner;

public class pgm14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num  = sc.nextInt(), digit = sc.nextInt(),num2=num,ct=0;
        if (num == 0 && digit == 0) {ct = 1;}
        num = Math.abs(num);
        while(num>0){
            int dig = num%10;
            if(dig == digit){ct+=1;}
            num/=10;
        }
        System.out.println("The count of digit " + digit + " in "+num2+" is "+ct);
    }
}
