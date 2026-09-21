// Manager overrides the work() method defined in Employee.
// Concept: Method overriding with @Override annotation.
class Employee{
    String name;

    void work(){
        System.out.println("Employee is working");
    }
}

class Manager extends Employee{
    @Override
    void work(){
        System.out.println("Manager is managing the team");
    }
}
public class pgm26 {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.work();
    }

}
