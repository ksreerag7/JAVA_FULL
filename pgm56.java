// Searches for an integer and a string inside their respective ArrayLists.
// Concept: Generic search method — <T> void search(ArrayList<T>, T) using equals().
import java.util.ArrayList;
import java.util.Scanner;

public class pgm56 {

    public static <T> void search(ArrayList<T> list,T item){
        boolean found = false;
        for(T temp: list){
            if(temp.equals(item)){
                found = true;
                System.out.println("Item found");
            }
        }
        if(!found){
            System.out.println("Item not found");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(60);
        int n = sc.nextInt();
        search(nums, n);
        sc.nextLine();
        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("java");
        words.add("what");
        words.add("tiny");
        words.add("kangaroo");
        words.add("peacock");
        String var = sc.nextLine();
        search(words, var);
    }
}