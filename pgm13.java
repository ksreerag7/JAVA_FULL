// Finds the largest digit in an integer entered by the user.
// Concept: Digit extraction with a running maximum comparison.
import java.util.Scanner;

public class pgm13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num  = sc.nextInt(), dig,num2=num, max = 0;
        num = Math.abs(num);
        while(num>0){
            dig = num%10;
            if(dig>max){max = dig;}
            num/=10;
        }
        System.out.println("The largest digit in "+num2+" is "+ max);
    }
}
