// Compares two values in a Pair and prints the larger one, for Integer and Double pairs.
// Concept: Bounded type parameter on a generic class — Pair<T extends Comparable<T>>.
class Pair<T extends Comparable<T>> {

    T a, b;

    Pair(T a,T b){
        this.a = a;
        this.b = b;
    }

    public void compare(){
        int n = a.compareTo(b);
        System.out.println(n > 0 ? a:b);
    }  
}

public class pgm59 {

    public static void main(String[] args) {

        Pair<Integer> p1 = new Pair<Integer>(55,78);

        Pair<Double> p2 = new Pair<Double>(62.5,17.9);

        p1.compare();
        p2.compare();
    }
}