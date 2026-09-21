import java.util.ArrayList;

@FunctionalInterface
interface NumberCheck {
    public boolean evencheck(int num);
}

public class pgm64 {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(23);
        nums.add(19);
        nums.add(12);
        nums.add(40);
        nums.add(32);

        NumberCheck isEven = (number) -> (number % 2 == 0 && number >20);

        for(int number:nums){
            if(isEven.evencheck(number)){
            System.out.println(number);
            }
        }

    }
}