// Employee is an abstract class with an abstract work() and a concrete attendMeeting() method.
// Concept: Abstract class — forces subclasses to implement work(), while sharing common behavior.
abstract class Employee{

    abstract void work();

    void attendMeeting(){
        System.out.println("Employee is attending a meeting.");
    }
}

class Manager extends Employee{

    @Override
    void work(){
        System.out.println("Manager is managing the team.");
    }

}


public class pgm28 {

    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.work();
        m1.attendMeeting();
    }

}
