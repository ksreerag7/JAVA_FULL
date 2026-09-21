// Creates Box objects holding an Integer and a String using the same generic class.
// Concept: Generic class — Box<T> can hold any type, enforced at compile time.
class Box<T> {

    T val;

    Box(T n){
        val = n;
    }

    void display(){
        System.out.println(val);
    }
}

public class pgm50 {

    public static void main(String[] args) {

        Box<Integer> b1 = new Box<>(5);
        Box<String> b2 = new Box<>("Ram");

        b1.display();b2.display();
    }
}