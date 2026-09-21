// Counts how many times each fruit name is entered, stopping when "done" is typed.
// Concept: getOrDefault() — concise frequency counting with HashMap without if/else checks.
import java.util.HashMap;
import java.util.Scanner;

public class pgm49 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String temp;
        HashMap<String, Integer> fruits = new HashMap<>();
        System.out.println("Enter the fruits enter 'done' to stop.");
        while(!(temp = sc.nextLine()).equals("done")){
            // if(fruits.containsKey(temp)){
            //     fruits.put(temp,fruits.get(temp)+1);
            // }
            // else{
            //     fruits.put(temp,1);
            // }
            fruits.put(temp,fruits.getOrDefault(temp, 0)+1);
        } 
        System.out.println(fruits);
        sc.close();
    }
}