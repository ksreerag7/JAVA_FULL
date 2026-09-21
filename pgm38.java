// Finds an employee by ID, updates their salary, and removes another by condition.
// Concept: ArrayList operations — search, in-place update, and removeIf with lambda.
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

    void check(){
        if(id == 202){
            System.out.println("Employee with ID 202 is: "+name);
            salary = 80000;
        }
    }

    void display(){
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

}

public class pgm38 {
    public static void main(String[] args) {
        ArrayList<Employee> employees= new ArrayList<>();
        employees.add(new Employee(101, "Alice", 200000));
        employees.add(new Employee(202, "John", 250000));
        employees.add(new Employee(303, "Carol", 185000));

        for(Employee e : employees){e.check();}
        employees.removeIf(e -> e.id == 303);
        for(Employee e : employees){e.display();}


    }
}
