import java.util.ArrayList;

public class pgm69 {

    public static void main(String[] args) {

    ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(23);
        nums.add(99);
        nums.add(19);
        nums.add(12);
        nums.add(6);
        nums.add(32);
        
        nums.stream().sorted().forEach(n -> System.out.println(n));
    }
}