// Checks if a number is an Armstrong number (sum of digits each raised to power of digit count equals the number).
// Concept: Math.pow(), digit count first pass, then digit extraction for sum.
import java.util.Scanner;

public class pgm18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        num = (num<0)?num*=-1:num;
        int num1 = num;
        int cnt = 0, sum = 0;
        while(num1>0){
            num1/=10;
            cnt+=1;
        }
        int num2 = num;
        while(num>0){
            int dig = num%10;
            sum += Math.pow(dig,cnt);
            num/=10;
        }
        System.out.println(sum == num2);
    }
}
