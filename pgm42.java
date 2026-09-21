// Divides 100 by user input, catching division by zero errors.
// Concept: try/catch/finally — ArithmeticException handling; finally block always executes.
import java.util.Scanner;

public class pgm42 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    try{
        int num = sc.nextInt();
        int res = 100/num;
        System.out.println("Result is: " + res);
    }
    catch(ArithmeticException e){
        System.out.println("Division by 0 not possible");
    }
    finally{
        System.out.println("Program Finished");
    }
}
}
