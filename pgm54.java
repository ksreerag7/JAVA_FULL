// Stores a pair of typed values and retrieves each one via its own typed getter.
// Concept: Generic class with typed getter methods — display1() returns T, display2() returns U.
class Pair<T, U> {

    T var1;
    U var2;

    Pair(T v1, U v2){
        var1 = v1;
        var2 = v2;
    }

    T display1(){
        return var1;
    }

    U display2(){
        return var2;
    }
}

public class pgm54 {

    public static void main(String[] args) {

        Pair<Integer, String> p1 = new Pair<>(101, "Alice");

        System.out.println(p1.display1());
        System.out.println(p1.display2());


        Pair<Double, String> p2 = new Pair<>(95.5, "Bob");
        System.out.println(p2.display1()+" "+p2.display2());
    }
}