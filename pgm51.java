// Prints all elements of an Integer array and a String array using one generic method.
// Concept: Generic method — <T> void display(T[] arr) works with any array type.
public class pgm51 {

    public static <T> void display(T[] arr){
        for(T item : arr){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        Integer[] nums = {1,2,3,4,5,6};
        String[] words = {"Apple", "Alice", "hello", "world", "dumb"};

        display(nums);
        display(words);
    }
}