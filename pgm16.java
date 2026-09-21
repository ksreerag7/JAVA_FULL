// Generates and prints the Fibonacci series up to N terms.
// Concept: while loop, two-variable rolling update to produce the series.
import java.util.Scanner;

public class pgm16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), i =3, a = 0, b = 1,c;
        if(num ==0){System.out.println("No terms to display");System.exit(0);}
        if(num == 1){System.out.println(a);}
        else{
            System.out.print(a+ " "+ b);
            while(i<=num){
                c = a+b;
                a=b;
                b=c;
                System.out.print(" "+c);
                i+=1;
            }
        }
        System.out.println();
    }

}
