// Adds two ints, two doubles, or three ints using the same method name.
// Concept: Method overloading — same name add() with different parameter types and counts.
class Calculator{

    int add(int a, int b){
        return (a+b);
    }

    double add(double a, double b){
        return (a+b);
    }

    int add(int a, int b, int c){
        return (a+b+c);
    }
}

public class pgm35 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(3,5));
        System.out.println(c1.add(6.0,18.0));
        System.out.println(c1.add(33,15,11));      
    }   
}
