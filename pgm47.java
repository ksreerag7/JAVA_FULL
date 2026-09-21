// Cross-references a list of user IDs against an employee HashMap to find matches.
// Concept: Using ArrayList and HashMap together to join two collections.
import java.util.HashMap;
import java.util.ArrayList;

public class pgm47 {
    public static void main(String[] args) {
        ArrayList<Integer> users= new ArrayList<>();
        users.add(101);
        users.add(102);
        users.add(103);
        users.add(104);
        users.add(105);

        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101,"Alice");
        employees.put(102,"Bob");
        employees.put(103,"Charlie");

        for(int e:users){
            if(employees.containsKey(e)){
                System.out.println("Employee "+e+" exists: "+employees.get(e));
            }
            else{
                System.out.println("User not found with id "+e);
            }
        }
        
    }
}
