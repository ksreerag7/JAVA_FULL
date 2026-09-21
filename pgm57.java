// Finds the maximum element in an Integer list and a Double list using one generic method.
// Concept: Bounded type parameter — <T extends Comparable<T>> restricts T to comparable types.
import java.util.ArrayList;

public class pgm57 {
    public static <T extends Comparable<T>> T max_item(ArrayList<T> items) {
        T max = items.get(0);
        for(T e:items){
            if(e.compareTo(max)>0){
                max = e;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(7);
        nums.add(40);
        nums.add(15);

        System.out.println("Max element in the integer list is: "+max_item(nums));

        ArrayList<Double> values = new ArrayList<>();
        values.add(2.5);
        values.add(9.8);
        values.add(4.2);
        values.add(7.1);

        System.out.println("Max element in the double list is: "+max_item(values));

    }
}