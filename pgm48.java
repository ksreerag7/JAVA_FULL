// Updates one employee's name and removes another from a HashMap by key.
// Concept: HashMap update operations — replace() to change a value, remove() to delete an entry.
import java.util.HashMap;

public class pgm48 {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101,"Alice");
        employees.put(102,"Bob");
        employees.put(103,"Dylan");
        employees.put(104,"Neil");

        if(employees.containsKey(102)){
            employees.replace(102,"Karen");
        }
        if(employees.containsKey(103)){
            employees.remove(103);
        }
        System.out.println(employees);

    }   
}
