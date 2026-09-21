// Prints all elements of an Integer ArrayList and a String ArrayList using one generic method.
// Concept: Generic method with ArrayList — <T> void display(ArrayList<T> list).
import java.util.ArrayList;

public class pgm55 {

    public static <T> void display(ArrayList<T> list){
        for(T item: list){
            System.out.println(item);
        }
    }
    
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("John");
        words.add("welcome");

        display(nums);
        display(words);
    }
}