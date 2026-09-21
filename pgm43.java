// Sets an employee salary and throws a custom exception if the value is negative.
// Concept: Custom exception — InvalidSalaryException extends Exception with a message.
class InvalidSalaryException extends Exception{
    public InvalidSalaryException(String message){
        super(message);
    }
}

class Employee{
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void setSalary(int sal) throws InvalidSalaryException{
        if(sal<0){
            throw new InvalidSalaryException("Salary cannot be negative");
        }
        else{
            this.salary = sal;
        }
    }
}
public class pgm43 {
    public static void main(String[] args) {
        Employee e = new Employee(101, "John", 100000);
        try{
        e.setSalary(-215000);
        } catch (InvalidSalaryException e1) {
            System.out.println(e1.getMessage());
        }
        finally{
            System.out.println("program finished");
        }
    }   
}
