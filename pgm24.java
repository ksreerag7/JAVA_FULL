// Demonstrates setter validation — salary is only updated if the new value is positive.
// Concept: Encapsulation with input validation inside a setter method.
class Employee{
    private int id;
    private String name;
    private double salary;

    Employee(int id, String name, double salary ){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(double newSalary){
        if(newSalary>0){this.salary = newSalary;}
        else{System.out.println("Salary cannot be negative amount.");}
    }

    public double getSalary(){return this.salary;}
}


public class pgm24 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Alice", 65000.00);
        Employee e2 = new Employee(102, "Bob", 72000.00);

        e1.setSalary(165000.00);
        System.out.println(e1.getSalary());

        e1.setSalary(-230000);
        System.out.println(e1.getSalary());

        e2.setSalary(87000);
        System.out.println(e2.getSalary());
    }

}
