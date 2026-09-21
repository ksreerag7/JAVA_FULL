// Prints pairs of values where each value can be a different type.
// Concept: Multiple type parameters — <T, U> allows two independent generic types in one method.
public class pgm52 {

    public static <T,U> void display(T temp, U num){
        System.out.println(temp+ " " + num);
    }

    public static void main(String[] args) {

        display(5, "hello");

        display("world", 23.45);

        display(12.50, 66.40);
    }
}