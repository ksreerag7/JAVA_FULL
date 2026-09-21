// Manager class inherits from Employee and extends it with teamSize.
// Concept: Inheritance — extends keyword, super() to call parent constructor.
class Employee{
    String name;
    double salary;
    Employee(String name, double sal){
        this.name = name;
        this.salary = sal;
    }
    void displayEmployee(){
        System.out.print("Name: "+name+" Salary: "+salary);
    }
}

class Manager extends Employee{
    int teamSize;

    Manager(String name, double salary, int teamSize){
        super(name, salary);
        this.teamSize = teamSize;
    }

    void displayManager(){
        this.displayEmployee();
        System.out.println(" Team Size: "+teamSize);

    }
}

public class pgm25 {
    public static void main(String[] args) {

        Manager m1 = new Manager("Ron", 320000, 55);
        m1.displayManager();

    }

}
