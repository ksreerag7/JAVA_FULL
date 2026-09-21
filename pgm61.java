@FunctionalInterface
interface StringOperation {
    public String strchange(String text);
}

public class pgm61 {

    public static void main(String[] args) {

        StringOperation upper = (text) -> (text.toUpperCase());

        StringOperation reverse = (text) -> (new StringBuilder(text).reverse().toString());
        
        String text = "hello";

        System.out.println(upper.strchange(text) + " " + reverse.strchange(text));
    }
}