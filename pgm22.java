// Demonstrates encapsulation using an Employee class with private fields.
// Concept: Encapsulation — private fields accessed/modified only via public getters and setters.
class Employee{
    private int id;
    private String name;
    private double salary;

    void setID(int id){
        this.id = id;
    }
    void setName(String name){
        this.name = name;
    }
    void setSal(double sal){
        this.salary = sal;
    }
    int getID(){
        return this.id;
    }
    String getName(){
        return this.name;
    }
    double getSal(){
        return this.salary;
    }

}


public class pgm22 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setID(123);
        e1.setName("Kuttappan");
        e1.setSal(230000.00);

        System.out.println("----Employee Details----");

        System.out.println("ID: "+e1.getID());
        System.out.println("NAME: "+e1.getName());
        System.out.println("SALARY: "+e1.getSal());
    }
}
