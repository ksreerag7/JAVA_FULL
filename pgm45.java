// Adds Employee objects to a HashSet; duplicate IDs are rejected via custom equality.
// Concept: Overriding equals() and hashCode() so HashSet deduplicates by employee ID.
import java.util.HashSet;
import java.util.Objects;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Employee employee = (Employee) obj;

        return this.id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class pgm45 {

    public static void main(String[] args) {

        HashSet<Employee> employees = new HashSet<>();

        employees.add(new Employee(101, "Alice"));
        employees.add(new Employee(102, "Bob"));
        employees.add(new Employee(101, "Alice"));

        System.out.println("Number of employees: " + employees.size());
    }
}