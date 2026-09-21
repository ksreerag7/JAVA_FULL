// Checks if a number is a Strong number (sum of factorials of digits equals the number).
// Concept: Classes and objects — Calculator class with a factorial method used from main class.
import java.util.Scanner;

class Calculator{
    public int factorial(int number){

        int result=1, i=1;
        while(i<=number){
            result*=i;
            i+=1;
        }
        return result;
    }
}

public class pgm20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        int num = sc.nextInt(), num1=num, sum = 0;
        while(num1>0){
            int dig = num1%10;
            int res = cal.factorial(dig);
            sum+=res;
            num1/=10;
        }
        System.out.println(sum==num);
    }
}
