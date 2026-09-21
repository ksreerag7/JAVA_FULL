// Stores Employee objects in a HashMap keyed by ID, then updates and removes entries.
// Concept: HashMap with custom objects — get(), put(), remove(), and iteration over values.
import java.util.HashMap;

class Employee{
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary){
        this.id = id; 
        this.name = name;
        this.salary = salary;
    }
    void setSalary(double sal){
        this.salary = sal;
    }

    void display(){
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class pgm39 {
    public static void main(String[] args) {
        HashMap<Integer, Employee> employees = new HashMap<>();
        employees.put(101,new Employee(101,"Alice",200000));
        employees.put(202, new Employee(202, "John",250000));
        employees.put(303,new Employee(303,"Carol",185000));

        Employee e = employees.get(202);
        e.setSalary(150000);
        employees.remove(303);

        for(Employee e1:employees.values()){e1.display();}
    }
}
