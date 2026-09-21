// Creates multiple Employee objects and displays their details.
// Concept: Parameterized constructor, multiple objects from the same class.
class Employee{
    private int id;
    private String name;
    private double salary;

    Employee(int id, String name, double salary ){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void displayDetails(){
        System.out.println("   "+this.id+"      "+this.name+"      "+this.salary);
    }

}
public class pgm23 {

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Alice", 65000.00);
        Employee e2 = new Employee(102, "Bob", 72000.00);
        System.out.println("---ID------NAME------SALARY---");
        e1.displayDetails();
        e2.displayDetails();

    }
    
}
