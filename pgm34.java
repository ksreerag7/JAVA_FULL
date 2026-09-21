// Creates an Employee with a fixed ID that cannot be changed after construction.
// Concept: final keyword — final field id is immutable once assigned.
class Employee {
    final int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class pgm34 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Alice");
        e1.display();

        // e1.id = 201; cannot be changed since final
    }
}
