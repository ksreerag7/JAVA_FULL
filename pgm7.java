// Counts the number of digits in an integer (handles negatives).
// Concept: while loop, ternary operator for absolute value.
import java.util.Scanner;

public class pgm7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = (num<0)?num*=-1:num;
        int cnt = 0;
        while(num>0){
            num/=10;
            cnt+=1;
        }
        System.out.println(cnt);
        
    }
    
}
