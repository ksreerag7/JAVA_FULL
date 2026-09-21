// Counts how many digits in a number are odd and how many are even.
// Concept: Digit-by-digit iteration using modulo, counters, if/else.
import java.util.Scanner;

public class pgm11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = (num<0)?num*=-1:num;
        int cnt = 0,oc=0,ec=0;
        while(num>0){
            int dig = num%10;
            num/=10;
            if(dig%2==0){ec+=1;}
            else{oc+=1;}
        }
        System.out.println("Odd count = "+oc+" Even count = "+ec);

    }

}
