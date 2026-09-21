// Reads a salary from user input and updates an employee, catching invalid input.
// Concept: try/catch with Scanner — graceful handling of non-numeric input using Exception.
import java.util.HashMap;
import java.util.Scanner;

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

public class pgm40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Employee> employees = new HashMap<>();
        employees.put(101,new Employee(101,"Alice",200000));
        employees.put(202, new Employee(202, "John",250000));
        employees.put(303,new Employee(303,"Carol",185000));
        Employee e = employees.get(202);
        try{
            double sala = sc.nextDouble();
            e.setSalary(sala);
        }
        catch(Exception ex){
            System.out.println("Invalid input");
        }
        employees.remove(303);
        for(Employee e1:employees.values()){e1.display();}
    }  
}
