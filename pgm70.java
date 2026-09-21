import java.util.ArrayList;

public class pgm70 {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(23);
        nums.add(10);
        nums.add(19);
        nums.add(32);
        nums.add(11);
        nums.add(32);

        nums.stream().distinct().forEach(n -> System.out.println(n));
    }
}