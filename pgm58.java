// Finds both the minimum and maximum values in an Integer list using one generic method.
// Concept: Bounded type parameter — <T extends Comparable<T>> with both compareTo() directions.
import java.util.ArrayList;

public class pgm58 {
    public static <T extends Comparable<T>> void minmax(ArrayList<T> items) {
        T max = items.get(0), min = items.get(0);
        for(T e:items){
            if(e.compareTo(max)>0){
                max = e;
            }
            if(e.compareTo(min)<0){
                min = e;
            }
        }
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
        
    }

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(7);
        nums.add(40);
        nums.add(15);
        nums.add(2);

        minmax(nums);



    }
}