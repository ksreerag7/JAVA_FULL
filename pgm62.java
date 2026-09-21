@FunctionalInterface
interface NumberCheck {
    public boolean poseven(int num);
}

public class pgm62 {

    public static void main(String[] args) {

        NumberCheck isPos = (number) -> (number > 0);

        NumberCheck isEven = (number) -> (number%2 == 0);

        int number = 13;

        System.out.println("Positive: "+isPos.poseven(number));
        System.out.println("Even: "+isEven.poseven(number));
    }
}