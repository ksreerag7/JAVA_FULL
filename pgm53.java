// Holds and displays a pair of values of two different types (e.g. ID+name, score+item).
// Concept: Generic class with two type parameters — Pair<T, U>.
class Pair<T, U> {

    T temp;
    U num;

    Pair(T temp, U num){
        this.temp = temp;
        this.num = num;
    }

    public void display(){
        System.out.println(temp + " " + num);
    }
}

public class pgm53 {

    public static void main(String[] args) {

        Pair<Integer, String> p1 = new Pair<>(201, "Alice");
        Pair<Double, String> p2 = new Pair<>(99.5, "Laptop");

        p1.display();
        p2.display();
    }
}