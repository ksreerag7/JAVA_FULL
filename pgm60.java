// Performs addition and multiplication using lambda expressions assigned to a functional interface.
// Concept: Functional interface + lambda — @FunctionalInterface with single abstract method implemented via lambda.
@FunctionalInterface
interface Operation {
    int meth1(int a, int b);
}

public class pgm60 {

    public static void main(String[] args) {

        Operation add = (a, b) -> a + b;
        Operation multiply = (a, b) -> a * b;

        int addResult      = add.meth1(10, 5);
        int multiplyResult = multiply.meth1(10, 5);

        System.out.println("Addition: "       + addResult);
        System.out.println("Multiplication: " + multiplyResult);
    }
}