// Demonstrates that changing a static field updates it for all instances.
// Concept: Static fields — shared across all objects of the class.
class Employee{
    String name;
    static String company = "SAP";

    Employee(String name){
        this.name = name;
    }
    void display(){
        System.out.println(name + " works at "+company);
    }
}

public class pgm32 {
    public static void main(String[] args) {
        Employee e1 = new Employee("John");
        Employee e2 = new Employee("Grace");

        e1.display();
        e2.display();

        Employee.company = "Google";

        e1.display();
        e2.display();
    }
}
