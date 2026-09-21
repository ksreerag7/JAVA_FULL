// Reads a number and prints its square using a utility class.
// Concept: Static methods — MathUtils.square() called without creating an object.
import java.util.Scanner;

class MathUtils{
        static int square(int num){
            return num*num;
        }
}

public class pgm33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = MathUtils.square(n);
        System.out.println(res);
        
    }
}
