// Creates a Student object and displays its details.
// Concept: Class definition, constructor, instance variables, and instance method (OOP basics).
class Student{
    int id; String name; double marks;
    Student(int id, String name, double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void displayDetails(){
        System.out.println("---ID------NAME------MARKS---");
        System.out.println("   "+this.id+"      "+this.name+"      "+this.marks);
    }
}
public class pgm21 {
    public static void main(String[] args) {

        Student stu1 = new Student(123,"John",478);
        stu1.displayDetails();
        
    }
}
