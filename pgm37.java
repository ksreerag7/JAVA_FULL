// Stores multiple Employee objects in an ArrayList and prints each one.
// Concept: ArrayList of custom objects — adding and iterating over object collections.
import java.util.ArrayList;

class Employee{
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

}

public class pgm37 {
    public static void main(String[] args) {
        ArrayList<Employee> employees= new ArrayList<>();
        employees.add(new Employee(101, "Alice", 200000));
        employees.add(new Employee(202, "John", 250000));
        employees.add(new Employee(303, "Carol", 185000));

        for(Employee e : employees){e.display();}
    }
}
