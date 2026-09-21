// Employee references hold Manager and Developer objects, each calling their own work().
// Concept: Runtime polymorphism — parent reference pointing to child object, dynamic dispatch.
class Employee{
    void work(){
        System.out.println("Employee is working.");
    }
}

class Manager extends Employee{
    @Override
    void work(){
        System.out.println("Manager is managing the team.");
    }
}

class Developer extends Employee{
    @Override
    void work(){
        System.out.println("Developer is writing code.");
    }
}

public class pgm27 {
    public static void main(String[] args) {
        Employee m1 = new Manager();
        m1.work();
        Employee d1 = new Developer();
        d1.work();
    }
}
