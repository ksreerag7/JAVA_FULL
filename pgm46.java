// Looks up a user by ID in a HashMap and reports whether the user exists.
// Concept: HashMap lookup — containsKey() to check key presence before retrieval.
import java.util.HashMap;
import java.util.Scanner;
public class pgm46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> users = new HashMap<>();

        users.put(101, "Alice");
        users.put(102,"Bob");
        users.put(103,"Charlie");

        int id = sc.nextInt();

        if(users.containsKey(id)){
            System.out.println("User found: "+users.get(id));
        }
        else{
            System.out.println("User not found");
        }
        sc.close();
    }    
}
